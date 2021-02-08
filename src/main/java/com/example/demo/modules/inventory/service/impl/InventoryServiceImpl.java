package com.example.demo.modules.inventory.service.impl;

import com.example.demo.modules.inventory.service.InventoryService;
import com.example.demo.modules.inventory.subscriber.response.InventoryCheckResponse;
import com.example.demo.modules.inventory.subscriber.response.InventoryResponse;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {
    @Override
    public InventoryCheckResponse checkInventory() {
        return new InventoryCheckResponse();
    }
}
