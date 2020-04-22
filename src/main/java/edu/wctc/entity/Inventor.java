package edu.wctc.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="inventors")
public class Inventor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="inventor_id")
    private int id;

    @Column(name="first_name")
    private String fName;

    @Column(name="last_name")
    private String lName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "inventor_id")
    private InventorDetail detail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public InventorDetail getDetail() {
        return detail;
    }

    public void setDetail(InventorDetail detail) {
        this.detail = detail;
    }

    public Inventor() {

    }

    public Inventor(int id, String fName, String lName, InventorDetail detail) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.detail = detail;
    }
}
