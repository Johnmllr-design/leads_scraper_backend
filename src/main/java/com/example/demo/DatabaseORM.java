package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseORM extends JpaRepository<previousRequest, Integer> {
}