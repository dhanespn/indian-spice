package com.example.demo.entities;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="CATAGORY")
public class Category {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "CAT_ID")
    private long catId;

    @Column(name="CAT_NAME")
    private String catName;

    @Column(name="CAT_DESC")
    private String catDesc;

    /*@Type(type="org.hibernate.type.BinaryType")
    @Column(name="IMAGE")
    private byte[] image;*/

    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Product> products = new HashSet<Product>();*/

    public long getCatId() {
        return catId;
    }

    public void setCatId(long catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    /*public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }*/
/*public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }*/
}
