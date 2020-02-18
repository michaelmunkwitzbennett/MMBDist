package edu.wctc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

import static edu.wctc.DatabaseUtils.closeAll;

@WebServlet(name = "SearchServlet", urlPatterns = "/view/search")
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;

        String familyName = request.getParameter("family");

        try {
            // create connection
            // create statement
            // create resultset
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            String absPath = getServletContext().getRealPath("/") + "../../db";

            conn = DriverManager.getConnection("jdbc:derby:" + absPath, "michael", "michael");

            String sql = "SELECT nm, inventiondate, family_nm FROM sandwich WHERE family_nm = ?";

            stmt = conn.prepareStatement(sql);

            stmt.setString(1, familyName);

            rset = stmt.executeQuery();

            StringBuilder sb = new StringBuilder("<html><body>");

            sb.append("<ul>");

            while (rset.next()){
                // Get the sandwich ID and name
                // from this result row
                sb.append("<li>");
                String name = rset.getString("nm");
                int invDate = rset.getInt("inventiondate");
                String family = rset.getString("family_nm");

                sb.append(name + ", " + invDate + ", " + family);

                sb.append("</li>");
            }

            sb.append("</ul>");

            sb.append("</body></html>");

            response.setContentType("text/html");
            response.getWriter().print(sb.toString());

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // close result set, if not null
            // close statement, if not null
            // close connection, if not null
            closeAll(conn, stmt, rset);
        }
    }
}
