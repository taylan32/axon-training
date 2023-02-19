package com.example.axontraining.coreapi.events;

import java.util.Objects;

public class OrderCreatedEvent {

    private final String orderId;
    private final Boolean orderCorfirmed;


    public OrderCreatedEvent(String orderId, Boolean orderCorfirmed) {
        this.orderId = orderId;
        this.orderCorfirmed = orderCorfirmed;
    }

    public String getOrderId() {
        return orderId;
    }

    public Boolean getOrderCorfirmed() {
        return orderCorfirmed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderCreatedEvent that = (OrderCreatedEvent) o;
        return Objects.equals(orderId, that.orderId) && Objects.equals(orderCorfirmed, that.orderCorfirmed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderCorfirmed);
    }

    @Override
    public String toString() {
        return "OrderCreatedEvent{" +
                "orderId='" + orderId + '\'' +
                ", orderCorfirmed=" + orderCorfirmed +
                '}';
    }
}
