package com.example.demo.modules.sale_order.service.impl;

import com.example.demo.modules.sale_order.service.SaleOrderService;
import com.example.demo.modules.sale_order.subscriber.request.SaleOrderRequest;
import org.springframework.stereotype.Service;

@Service
public class SaleOrderServiceImpl implements SaleOrderService {
    @Override
    public void createSaleOrder(SaleOrderRequest request) {
        // do something
    }
}
