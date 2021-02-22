package jp.kks.backend.modules.core.eventHandlerImpl;

import jp.kks.backend.modules.core.Event;
import jp.kks.backend.modules.core.EventCode;
import jp.kks.backend.modules.core.EventHandler;
import jp.kks.backend.modules.core.EventRequest;
import jp.kks.backend.modules.core.EventResponse;

@Event(EventCode.CREATE_PURCHASE_ORDER)
public class EventHandlerImpl implements EventHandler {

    @Override
    public <V extends EventResponse, T extends EventRequest> V execute(T request) {
        return null;
    }
}
