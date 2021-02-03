package com.example.demo.domain.inventory_projection.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Inventory extends JpaRepository<Inventory, String> {
}
