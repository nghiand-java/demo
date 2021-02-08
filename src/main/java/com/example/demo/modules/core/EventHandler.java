package com.example.demo.modules.core;

public interface EventHandler {
     <V extends EventResponse, T extends EventRequest> V emit(Event event, T request, EventSource source);
}
