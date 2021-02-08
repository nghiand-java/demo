package com.example.demo.modules.inventory.subscriber;

import com.example.demo.modules.core.Event;
import com.example.demo.modules.inventory.subscriber.request.InventoryRequest;
import com.example.demo.modules.inventory.subscriber.response.InventoryResponse;

public interface InventorySubscriber {
    InventoryResponse subscribe(Event event, InventoryRequest request);
}
