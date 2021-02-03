package com.example.demo.domain.approval.service.impl;

import com.example.demo.api.approval.request.PurchaseOrderApprovedRequest;
import com.example.demo.api.approval.response.PurchaseOrderApprovedResponse;
import com.example.demo.domain.Event;
import com.example.demo.domain.approval.repository.PurchaseOrderRepository;
import com.example.demo.domain.approval.service.PurchaseOrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    public final PurchaseOrderRepository purchaseOrderRepository;

    public final Event event;

    @Override
    public PurchaseOrderApprovedResponse purchaseOrderApproved(PurchaseOrderApprovedRequest request) {
        purchaseOrderRepository.save(request.asPurchaseOrder());
        event.purchaseOrderApproved();
        return new PurchaseOrderApprovedResponse();
    }
}
