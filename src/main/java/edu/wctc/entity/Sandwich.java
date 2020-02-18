package edu.wctc.entity;

public class Sandwich {
    private int id;
    private String name;
    private int inventionYear;
    private String family;

    public Sandwich() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInventionYear() {
        return inventionYear;
    }

    public void setInventionYear(int inventionYear) {
        this.inventionYear = inventionYear;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
