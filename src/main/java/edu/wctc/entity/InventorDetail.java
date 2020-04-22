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

    @Column(name="creation_count")
    private int creationCount;

    @OneToOne(mappedBy = "detail",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Inventor inventor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getCreationCount() {
        return creationCount;
    }

    public void setCreationCount(int creationCount) {
        this.creationCount = creationCount;
    }

    public Inventor getInventor() {
        return inventor;
    }

    public void setInventor(Inventor inventor) {
        this.inventor = inventor;
    }

    public InventorDetail() {

    }

    public InventorDetail(int age, String style, int creationCount, Inventor inventor) {
        this.age = age;
        this.style = style;
        this.creationCount = creationCount;
        this.inventor = inventor;
    }
}
