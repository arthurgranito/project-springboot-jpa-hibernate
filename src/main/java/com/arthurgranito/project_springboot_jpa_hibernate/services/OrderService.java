package com.arthurgranito.project_springboot_jpa_hibernate.services;

import com.arthurgranito.project_springboot_jpa_hibernate.entities.Order;
import com.arthurgranito.project_springboot_jpa_hibernate.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> order = repository.findById(id);

        return order.get();
    }
}
