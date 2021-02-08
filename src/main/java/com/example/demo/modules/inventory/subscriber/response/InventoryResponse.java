package com.example.demo.modules.inventory.subscriber.response;

import com.example.demo.modules.core.EventResponse;

public class InventoryResponse {
    public <V extends EventResponse> V asEventResponse() {
        return null;
    }
}
