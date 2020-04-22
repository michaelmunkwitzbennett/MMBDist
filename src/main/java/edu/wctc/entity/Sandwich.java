package edu.wctc.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="sandwich")
public class Sandwich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sandwich_id")
    private int id;

    @Column(name="nm")
    private String name;

    @Column(name="inventiondate")
    private int inventionYear;

    @Column(name="family_nm")
    private Family family;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sandwich_id")
    private SandwichDetail detail;

    public Sandwich() {

    }

    public Sandwich(String name, int inventionYear, Family family, SandwichDetail detail) {
        this.name = name;
        this.inventionYear = inventionYear;
        this.family = family;
        this.detail = detail;
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

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public SandwichDetail getDetail() {
        return detail;
    }

    public void setDetail(SandwichDetail detail) {
        this.detail = detail;
    }
}
