package com.example.EnocaChallenge3.service;


import com.example.EnocaChallenge3.model.Order;

import java.util.List;

public interface OrderService {

    Order saveOrder(Order order);
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order updateOrder(Order order, Long id);
    void deleteOrder(Long id);

}
