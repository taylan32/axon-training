package com.example.axontraining.querymodel;

import com.example.axontraining.coreapi.events.OrderCreatedEvent;
import com.example.axontraining.coreapi.queries.FindAllOrderQuery;
import com.example.axontraining.model.OrderEntity;
import com.example.axontraining.repository.OrderRepository;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ProcessingGroup("orders")
public class OrderEventHandler {

    private final OrderRepository orderRepository;


    public OrderEventHandler(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @EventHandler
    public void on(OrderCreatedEvent event) {
        orderRepository.save(new OrderEntity(event.getOrderId(), event.getOrderCorfirmed()));
    }

    @QueryHandler
    public List<OrderEntity> on(FindAllOrderQuery query) {
        return orderRepository.findAll();
    }

}
