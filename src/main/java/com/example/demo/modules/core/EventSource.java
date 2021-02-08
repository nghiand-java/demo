package com.example.demo.modules.core;

public enum EventSource {
    INVENTORY(0),
    SALE_ORDER(1),
    APPROVAL(2),
    FORECAST(3);

    private int code;

    EventSource(int code) {
        this.code = code;
    }
}
