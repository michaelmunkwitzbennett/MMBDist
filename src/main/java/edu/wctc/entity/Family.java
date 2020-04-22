package edu.wctc.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name="family")
public class Family {

    @Id
    @Column(name="family_nm")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Family() {

    }

    public Family(String name) {
        this.name = name;
    }
}
