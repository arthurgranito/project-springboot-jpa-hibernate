package com.arthurgranito.project_springboot_jpa_hibernate.repositories;

import com.arthurgranito.project_springboot_jpa_hibernate.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
