package edu.wctc.dao;

import edu.wctc.entity.Sandwich;

import java.util.List;

public interface SandwichDAO {
    List<Sandwich> getSandwiches();

    void saveSandwich(Sandwich theSandwich);

    Sandwich getSandwich(int theId);

    void deleteSandwich(int theId);

    List<Sandwich> getSandwichesByName(String theSearchTerm);
}
