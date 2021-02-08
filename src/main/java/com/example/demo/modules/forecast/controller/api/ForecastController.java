package com.example.demo.modules.forecast.controller.api;

import com.example.demo.modules.core.EventHandler;
import com.example.demo.modules.core.EventRequest;
import com.example.demo.modules.core.EventResponse;
import com.example.demo.modules.forecast.controller.request.CreateForecastRequest;
import com.example.demo.modules.forecast.controller.response.CreateForecastResponse;
import com.example.demo.modules.forecast.service.ForecastService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.demo.modules.core.Event.CREATE_PURCHASE_ORDER;
import static com.example.demo.modules.core.Event.INVENTORY_CHECK;
import static com.example.demo.modules.core.EventSource.FORECAST;

@RestController
@RequiredArgsConstructor
public class ForecastController {

    private final ForecastService forecastService;

    private final EventHandler eventHandler;


    @PostMapping("/forecast")
    public ResponseEntity<CreateForecastResponse> createForecast(CreateForecastRequest request) {
        forecastService.createForecast(request);
        InventoryCheckRequest inventoryCheckRequest = new InventoryCheckRequest();
        InventoryCheckResponse inventoryCheckResponse = eventHandler.emit(INVENTORY_CHECK, inventoryCheckRequest, FORECAST);
        // check status goods in inventory
        if (inventoryCheckResponse.status) {
            // check inventory ok => create purchase order
            eventHandler.emit(CREATE_PURCHASE_ORDER, new CreatePurchaseOrderRequest(), FORECAST);
        }
        return new ResponseEntity<>(new CreateForecastResponse(), HttpStatus.OK);
    }


    //helper class

    public static class InventoryCheckRequest extends EventRequest {

    }

    public static class InventoryCheckResponse extends EventResponse {
        private boolean status;
    }

    public static class CreatePurchaseOrderRequest extends EventRequest {

    }
}
