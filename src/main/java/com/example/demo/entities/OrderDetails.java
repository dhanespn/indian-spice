package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="ORDER_DETAILS")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ORDER_DETAILS_ID")
    private long orderDetailId;

    @Column(name = "ORDER_ID")
    private long orderId;

    @Column(name = "PRODUCT_ID")
    private long productId;

    @Column(name = "ORDER_NO")
    private long orderNumber;

    @Column(name = "QUANTITY")
    private long quantity;

    @Column(name="PRICE", columnDefinition="Decimal(10,2)")
    private Double price;

    @Column(name="TOTAL", columnDefinition="Decimal(10,2)")
    private Double total;

    public long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
