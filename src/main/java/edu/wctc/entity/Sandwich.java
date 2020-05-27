package edu.wctc.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name="sandwich")
public class Sandwich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sandwich_id")
    private int id;

    @NotNull(message = "required")
    @Size(min = 1, max = 36, message = "1-36 characters")
    @Column(name="nm")
    private String name;

    @NotNull(message = "required XXXX format")
    @Column(name="inventiondate")
    private Integer inventionYear;

    @Column(name="family_nm")
    private String family;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sandwich_id")
    private SandwichDetail detail;

    public Sandwich() {

    }

    public Sandwich(String name, int inventionYear, String family, SandwichDetail detail) {
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

    public Integer getInventionYear() {
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



    public SandwichDetail getDetail() {
        return detail;
    }

    public void setDetail(SandwichDetail detail) {
        this.detail = detail;
    }
}
