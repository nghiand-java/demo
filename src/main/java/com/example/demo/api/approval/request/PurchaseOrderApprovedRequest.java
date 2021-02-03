package com.example.demo.api.approval.request;

import com.example.demo.domain.approval.model.PurchaseOrder;

public class PurchaseOrderApprovedRequest {
    public PurchaseOrder asPurchaseOrder() {
        return new PurchaseOrder();
    }
}
