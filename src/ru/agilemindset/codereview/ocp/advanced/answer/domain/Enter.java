package ru.agilemindset.codereview.ocp.advanced.answer.domain;

import ru.agilemindset.codereview.ocp.advanced.answer.EventEnterceptor;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public class Enter implements Event {
    @Override
    public void handle(EventEnterceptor interceptor, Object entity) {
        interceptor.interceptEvent(this, entity);
    }
}
