package com.example.demo.modules.inventory.subscriber;

import com.example.demo.modules.core.Event;
import com.example.demo.modules.inventory.service.InventoryService;
import com.example.demo.modules.inventory.subscriber.request.InventoryRequest;
import com.example.demo.modules.inventory.subscriber.response.InventoryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InventorySubscriberImpl implements InventorySubscriber {

    private final InventoryService inventoryService;

    @Override
    public InventoryResponse subscribe(Event event, InventoryRequest request) {
        switch (event) {
            case INVENTORY_CHECK: {
                return inventoryService.checkInventory();
            }
            default: {
                return null;
            }
        }
    }

}
