package edu.wctc.service;

import edu.wctc.dao.SandwichDAO;
import edu.wctc.entity.Sandwich;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class SandwichServiceImpl implements SandwichService {

    @Autowired
    private SandwichDAO sandwichDAO;

    @Override
    @Transactional
    public List<Sandwich> getSandwiches() {
        return sandwichDAO.getSandwiches();
    }

    @Override
    @Transactional
    public void saveSandwich(Sandwich theSandwich) {
        sandwichDAO.saveSandwich(theSandwich);
    }

    @Override
    @Transactional
    public Sandwich getSandwich(int theId) {
        return sandwichDAO.getSandwich(theId);
    }

    @Override
    @Transactional
    public void deleteSandwich(int theId) {
        sandwichDAO.deleteSandwich(theId);
    }

    @Override
    @Transactional
    public List<Sandwich> getSandwichesByName(String theSearchTerm) {
        return sandwichDAO.getSandwichesByName(theSearchTerm);
    }


}
