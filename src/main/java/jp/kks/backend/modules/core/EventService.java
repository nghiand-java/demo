package jp.kks.backend.modules.core;

import lombok.RequiredArgsConstructor;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class EventService {

    // Dependencies
    // -----------------------------------------------------------------------------------------------------------------

    private final List<EventHandler> eventHandlers;

    // EventHandler map
    // -----------------------------------------------------------------------------------------------------------------

    private Map<String, EventHandler> eventHandlerMap;

    @PostConstruct
    public void init() {
        if (CollectionUtils.isNotEmpty(eventHandlers)) {
            eventHandlerMap = new HashMap<>();
            eventHandlers.forEach(eventHandler -> {
                String eventCode = eventHandler.getClass().getAnnotation(Event.class).value().name();
                eventHandlerMap.put(eventCode, eventHandler);
            });
        }
    }

    // Methods
    // -----------------------------------------------------------------------------------------------------------------

    public <T extends EventRequest, V extends EventResponse> V generateNonce(EventCode eventCode, T request, EventSource source) {
        return eventHandlerMap.get(eventCode).execute(request);
    }
}
