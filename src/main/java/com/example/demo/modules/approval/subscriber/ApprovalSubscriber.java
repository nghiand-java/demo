package com.example.demo.modules.approval.subscriber;

import com.example.demo.modules.core.Event;
import com.example.demo.modules.core.EventRequest;
import com.example.demo.modules.core.EventResponse;

public interface ApprovalSubscriber {
    <V extends EventResponse, T extends EventRequest> V subscribe(Event event, T request);
}
