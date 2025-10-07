package com.andersonbackdev.curso.services;


import com.andersonbackdev.curso.entities.Order;
import com.andersonbackdev.curso.entities.User;
import com.andersonbackdev.curso.repositories.OrderRepository;
import com.andersonbackdev.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();

    }
}
