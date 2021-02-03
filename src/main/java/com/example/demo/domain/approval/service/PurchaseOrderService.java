package com.example.demo.domain.approval.service;

import com.example.demo.api.approval.request.PurchaseOrderApprovedRequest;
import com.example.demo.api.approval.response.PurchaseOrderApprovedResponse;

public interface PurchaseOrderService {
    public PurchaseOrderApprovedResponse purchaseOrderApproved(PurchaseOrderApprovedRequest request);
}
