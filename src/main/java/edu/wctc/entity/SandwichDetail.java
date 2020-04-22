package edu.wctc.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="sandwich_detail")
public class SandwichDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sandwich_id")
    private int id;

    @Column(name="size")
    private String size;

    @Column(name="nickname")
    private String nickName;

    @Column(name="mass")
    private int mass;

    @Column(name="price")
    private double price;

    @OneToOne(mappedBy = "detail",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Sandwich sandwich;

    public SandwichDetail() {

    }

    public SandwichDetail(String size, String nickName, int mass, double price, Sandwich sandwich) {
        this.size = size;
        this.nickName = nickName;
        this.mass = mass;
        this.price = price;
        this.sandwich = sandwich;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
