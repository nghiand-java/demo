package com.example.demo.modules.inventory.repository;

import com.example.demo.modules.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, String> {
}
