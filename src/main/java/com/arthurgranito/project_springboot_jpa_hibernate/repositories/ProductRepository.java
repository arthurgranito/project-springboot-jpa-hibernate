package com.arthurgranito.project_springboot_jpa_hibernate.repositories;

import com.arthurgranito.project_springboot_jpa_hibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
