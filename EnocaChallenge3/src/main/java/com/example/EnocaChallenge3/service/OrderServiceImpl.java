package com.example.EnocaChallenge3.service;


import com.example.EnocaChallenge3.model.Order;
import com.example.EnocaChallenge3.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    private OrderRepository orderRepository;
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public Order updateOrder(Order order, Long id) {
        //we need to check whether order exists or not
        Order existingOrder = orderRepository.findById(id).get();
        if (null != existingOrder){
            existingOrder.setCreateDate(order.getCreateDate());
            existingOrder.setTotalPrice(order.getTotalPrice());
        }
        //saving to the DB
        orderRepository.save(existingOrder);
        return  existingOrder;
    }

    @Override
    public void deleteOrder(Long id) {
        Order existingOrder = orderRepository.findById(id).get();
        if (null != existingOrder){
            orderRepository.deleteById(id);
        }
    }




}
