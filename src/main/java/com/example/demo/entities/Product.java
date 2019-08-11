package com.example.demo.entities;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT")
public class Product {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private long productId;

    @Column(name="PRODUCT_NAME")
    private String productName;

    @Column(name="Product_Description")
    private String productDescription;

   /* @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "CAT_ID", nullable = false)
    private Category category;*/

    @Column(name="QNTY_PER_UNIT")
    private String quantityPerUnit;

    @Column(name="UNIT_PRICE")
    private String unitPrice;

  /*  @
    @Column(name="IMAGE")
    private byte[] image;*/

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }


    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    /*public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }*/

   /* public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }*/
}
