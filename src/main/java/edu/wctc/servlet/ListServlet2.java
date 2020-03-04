package edu.wctc.servlet;

import edu.wctc.DatabaseUtils;
import edu.wctc.entity.Sandwich;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListServlet2", urlPatterns = "/view/list")
public class ListServlet2 extends HttpServlet {
    private final String DRIVER_NAME = "jdbc:derby:";
    private final String DATABASE_PATH = "../../db";
    private final String USERNAME = "michael";
    private final String PASSWORD = "michael";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Declare outside the try/catch so the variables are in scope in the finally block
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        try {
            //Load the driver
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            // Find the absolute path of the database folder
            String absPath = getServletContext().getRealPath("/") + DATABASE_PATH;

            // Build the query as a String
            StringBuilder sql = new StringBuilder("select sandwich_id, nm, inventiondate, family_nm ");
            sql.append("from sandwich ");
            sql.append(" ORDER BY inventiondate"); // Don't end SQL with semicolon!

            // Create a connection
            conn = DriverManager.getConnection(DRIVER_NAME + absPath, USERNAME, PASSWORD);
            // Create a statement to execute SQL
            stmt = conn.createStatement();
            // Execute a SELECT query and get a result set
            rset = stmt.executeQuery(sql.toString());

            List<Sandwich> sandwichList = new ArrayList<Sandwich>();

            // Loop while the result set has more rows
            while (rset.next()) {
                Sandwich s = new Sandwich();
                s.setId(rset.getInt(1));
                s.setName(rset.getString(2));
                s.setInventionYear(rset.getInt(3));
                s.setFamily(rset.getString(4));
                sandwichList.add(s);
            }

            request.setAttribute("sandwiches", sandwichList);
            request.getRequestDispatcher("list2.jsp").forward(request, response);

        } catch(SQLException | ClassNotFoundException e) {
            // If there's an exception locating the driver, send IT as the response
            response.getWriter().print(e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseUtils.closeAll(conn, stmt, rset);
        }
    }
}
