package edu.wctc.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ingredient_id")
    private int id;

    @Column(name="ingredient_nm")
    private String name;

    @Column(name="price")
    private double price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ingredient() {

    }

    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
