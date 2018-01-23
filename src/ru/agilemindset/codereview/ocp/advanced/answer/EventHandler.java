package ru.agilemindset.codereview.ocp.advanced.answer;

import ru.agilemindset.codereview.ocp.advanced.answer.domain.*;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public class EventHandler {

    private Object entity;
    private MoveEventInterceptor eventInterceptor = new MoveEventInterceptor();

    public void handleEvent(Event event) {
        event.handle(eventInterceptor, entity);
    }

    public static void main(String[] args) {
        EventHandler handler = new EventHandler();
        handler.handleEvent(new Exit());
        handler.handleEvent(new Enter());
        handler.handleEvent(new Fly());
        handler.handleEvent(new Jump());

    }

}
