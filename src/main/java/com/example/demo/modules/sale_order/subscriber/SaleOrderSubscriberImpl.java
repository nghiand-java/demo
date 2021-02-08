package com.example.demo.modules.sale_order.subscriber;

import com.example.demo.modules.core.Event;
import com.example.demo.modules.sale_order.service.SaleOrderService;
import com.example.demo.modules.sale_order.subscriber.request.SaleOrderRequest;
import com.example.demo.modules.sale_order.subscriber.response.SaleOrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SaleOrderSubscriberImpl implements SaleOrderSubscriber {

    private final SaleOrderService saleOrderService;

    @Override
    public SaleOrderResponse subscribe(Event event, SaleOrderRequest request) {
        switch (event) {
            case CREATE_PURCHASE_ORDER: {
                saleOrderService.createSaleOrder(request);
                return new SaleOrderResponse();
            }
            default: {
                return null;
            }
        }
    }
}
