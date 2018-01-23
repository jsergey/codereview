package ru.agilemindset.codereview.ocp.advanced.answer.domain;

import ru.agilemindset.codereview.ocp.advanced.answer.IEventEnterceptor;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public class Exit implements Event {
    @Override
    public void handle(IEventEnterceptor interceptor, Object entity) {
        interceptor.interceptEvent(this, entity);
    }
}
