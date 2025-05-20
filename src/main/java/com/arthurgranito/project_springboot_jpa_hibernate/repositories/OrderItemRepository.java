package com.arthurgranito.project_springboot_jpa_hibernate.repositories;

import com.arthurgranito.project_springboot_jpa_hibernate.entities.OrderItem;
import com.arthurgranito.project_springboot_jpa_hibernate.entities.User;
import com.arthurgranito.project_springboot_jpa_hibernate.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
