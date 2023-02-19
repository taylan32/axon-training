package com.example.axontraining.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class OrderEntity {

    @Id
    private String orderId;
    private Boolean orderConfirmed;

    public OrderEntity() {
    }

    public OrderEntity(String orderId, Boolean orderConfirmed) {
        this.orderId = orderId;
        this.orderConfirmed = orderConfirmed;
    }

    public String getOrderId() {
        return orderId;
    }

    public Boolean getOrderConfirmed() {
        return orderConfirmed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return Objects.equals(orderId, that.orderId) && Objects.equals(orderConfirmed, that.orderConfirmed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderConfirmed);
    }





}
