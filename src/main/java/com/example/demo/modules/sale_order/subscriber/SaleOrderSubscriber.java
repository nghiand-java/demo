package com.example.demo.modules.sale_order.subscriber;

import com.example.demo.modules.core.Event;
import com.example.demo.modules.sale_order.subscriber.request.SaleOrderRequest;
import com.example.demo.modules.sale_order.subscriber.response.SaleOrderResponse;

public interface SaleOrderSubscriber {
    SaleOrderResponse subscribe(Event event, SaleOrderRequest request);
}
