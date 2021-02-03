package com.example.demo.api.approval.controller;

import com.example.demo.api.approval.request.PurchaseOrderApprovedRequest;
import com.example.demo.api.approval.response.PurchaseOrderApprovedResponse;
import com.example.demo.domain.approval.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApprovalController {
    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @PostMapping(value = "${endpoint.approval}")
    public ResponseEntity<PurchaseOrderApprovedResponse> purchaseOrderApproved(PurchaseOrderApprovedRequest request) {
        PurchaseOrderApprovedResponse response = purchaseOrderService.purchaseOrderApproved(request);
        return new ResponseEntity(response, HttpStatus.OK);
    }

}
