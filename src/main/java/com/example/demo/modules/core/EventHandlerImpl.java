package com.example.demo.modules.core;

import com.example.demo.modules.approval.subscriber.ApprovalSubscriber;
import com.example.demo.modules.inventory.subscriber.InventorySubscriber;
import com.example.demo.modules.sale_order.subscriber.SaleOrderSubscriber;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class EventHandlerImpl implements EventHandler {

    private final InventorySubscriber inventorySubscriber;
    private final ApprovalSubscriber approvalSubscriber;
    private final SaleOrderSubscriber saleOrderSubscriber;

    @Override
    public <V extends EventResponse, T extends EventRequest> V emit(Event event, T request, EventSource source) {
        switch (source) {
            case INVENTORY:
                return inventorySubscriber.subscribe(event, request.asInventoryRequest()).asEventResponse();
            case SALE_ORDER:
                return saleOrderSubscriber.subscribe(event, request.asSaleOrderRequest()).asEventResponse();
            //            case APPROVAL:
//                return approvalSubscriber.subscribe(event, request.asApprovalRequest()).asEventResponse();
            default:
                return null;
        }
    }
}
