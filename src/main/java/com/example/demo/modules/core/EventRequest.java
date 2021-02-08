package com.example.demo.modules.core;

import com.example.demo.modules.approval.subscriber.request.ApprovalRequest;
import com.example.demo.modules.inventory.subscriber.request.InventoryRequest;
import com.example.demo.modules.sale_order.subscriber.request.SaleOrderRequest;

public class EventRequest {
    public InventoryRequest asInventoryRequest() {
        return new InventoryRequest();
    }

    public ApprovalRequest asApprovalRequest() {
        return new ApprovalRequest();
    }

    public SaleOrderRequest asSaleOrderRequest() {
        return new SaleOrderRequest();
    }
}
