package com.arthurgranito.project_springboot_jpa_hibernate.services.exceptions;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String message) {
        super(message);
    }
}
