package edu.wctc.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="inventor_details")
public class InventorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="inventor_id")
    private int id;

    @Column(name="age")
    private int age;

    @Column(name="style")
    private String style;

    @Column(name="creationCount")
    private int creationCount;

    @OneToOne(mappedBy = "detail",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Inventor inventor;

    public InventorDetail() {

    }

    public InventorDetail(int age, String style, int creationCount, Inventor inventor) {
        this.age = age;
        this.style = style;
        this.creationCount = creationCount;
        this.inventor = inventor;
    }
}
