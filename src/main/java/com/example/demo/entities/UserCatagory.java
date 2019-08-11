package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="USER_CATOGORY")
public class UserCatagory {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "CAT_ID")
    private long catagoryId;

    @Column(name="CAT_NAME")
    private String catagoryName;

    public long getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(long catagoryId) {
        this.catagoryId = catagoryId;
    }

    public String getCatagoryName() {
        return catagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName;
    }
}
