package com.arthurgranito.project_springboot_jpa_hibernate.repositories;

import com.arthurgranito.project_springboot_jpa_hibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
