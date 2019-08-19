package com.example.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="USER_CATOGORY")
public class UserCatagory {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "USR_CAT_ID")
    private long userCatId;

    @Column(name="USR_CAT_NAME")
    private String userCatName;

    public long getUserCatId() {
        return userCatId;
    }

    public void setUserCatId(long userCatId) {
        this.userCatId = userCatId;
    }

    public String getUserCatName() {
        return userCatName;
    }

    public void setUserCatName(String userCatName) {
        this.userCatName = userCatName;
    }
}
