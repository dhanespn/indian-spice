package com.example.demo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ORDERS")
public class Orders {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ORDER_ID")
    private long orderId;

    @Column(name = "USER_ID")
    private long userId;

    @Column(name = "ORDER_NUMBER")
    private long orderNumber;

    @Column(name = "SHIP_DATE")
    private Date shipDate;

    @Column(name = "REQ_DATE")
    private Date requiedDate;

    @Column(name = "PAID")
    private boolean paid;

    @Column(name = "PAYMENT_DATE")
    private Date paymentDate;

    @Column(name = "DELETED")
    private boolean deleted;


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Date getRequiedDate() {
        return requiedDate;
    }

    public void setRequiedDate(Date requiedDate) {
        this.requiedDate = requiedDate;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
