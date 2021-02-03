package com.example.demo.domain;

import com.example.demo.domain.inventory_projection.service.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EventImpl implements Event {
    @Autowired
    private final InventoryService service;

    @Override
    public void purchaseOrderApproved() {
        service.updateInventoryProjection();
    }
}
