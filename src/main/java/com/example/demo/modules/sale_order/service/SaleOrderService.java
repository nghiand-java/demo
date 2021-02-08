package com.example.demo.modules.sale_order.service;

import com.example.demo.modules.sale_order.subscriber.request.SaleOrderRequest;

public interface SaleOrderService {

    void createSaleOrder(SaleOrderRequest request);
}
