package com.example.demo.modules.approval.subscriber;

import com.example.demo.modules.core.Event;
import com.example.demo.modules.core.EventRequest;
import com.example.demo.modules.core.EventResponse;
import org.springframework.stereotype.Component;

@Component
public class ApprovalSubscriberImpl implements ApprovalSubscriber {
    @Override
    public <V extends EventResponse, T extends EventRequest> V subscribe(Event event, T request) {
        return null;
    }
}
