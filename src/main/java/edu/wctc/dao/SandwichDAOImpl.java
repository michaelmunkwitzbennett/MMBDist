package edu.wctc.dao;


import edu.wctc.entity.Sandwich;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class SandwichDAOImpl implements SandwichDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Sandwich> getSandwiches() {
        Session session = sessionFactory.getCurrentSession();

        List<Sandwich> list = session.createQuery("from Sandwich", Sandwich.class).getResultList();

        return list;
    }

    @Override
    public void saveSandwich(Sandwich theSandwich) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(theSandwich);
    }

    @Override
    public Sandwich getSandwich(int theId) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Sandwich.class, theId);
    }

    @Override
    public void deleteSandwich(int theId) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("delete from Sandwich where id = :doomedSandwich");
        query.setParameter("doomedSandwich", theId);

        query.executeUpdate();
    }

    @Override
    public List<Sandwich> getSandwichesByName(String theSearchTerm) {
        theSearchTerm = "%" + theSearchTerm.toLowerCase() + "%";

        Session session = sessionFactory.getCurrentSession();

        Query<Sandwich> query = session.createQuery("from Sandwich where lower(name) like :search");
        query.setParameter("search", theSearchTerm);

        return query.getResultList();
    }
}
