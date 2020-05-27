package edu.wctc.service;

import edu.wctc.entity.Sandwich;

import java.util.List;

public interface SandwichService {
    List<Sandwich> getSandwiches();

    void saveSandwich(Sandwich sandwich);

    Sandwich getSandwich(int theId);

    void deleteSandwich(int theId);

    List<Sandwich> getSandwichesByName(String theSearchTerm);
}
