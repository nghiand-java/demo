package jp.kks.backend.modules.core;

public interface EventHandler {
     <V extends EventResponse, T extends EventRequest> V execute(T request);
}
