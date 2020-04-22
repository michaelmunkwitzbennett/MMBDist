package edu.wctc.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="family")
public class Family {

    @Id
    @Column(name="family_nm")
    private String name;

    public Family() {

    }

    public Family(String name) {
        this.name = name;
    }
}
