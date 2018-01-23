package ru.agilemindset.codereview.ocp.advanced;

import ru.agilemindset.codereview.ocp.advanced.domain.*;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public class EventHandler {

    private Object entity;
    private EventInterceptor eventInterceptor;

    public void handleEvent(Event event) {
        if(event instanceof Enter) {
            eventInterceptor.enter(entity);
        } else if(event instanceof Exit) {
            eventInterceptor.exit(entity);
        } else if (event instanceof Fly) {
            eventInterceptor.fly(entity);
        } else if(event instanceof Go) {
            eventInterceptor.go(entity);
        } else if(event instanceof Jump) {
            eventInterceptor.jump(entity);
        }

    }

}
