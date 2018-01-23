package ru.agilemindset.codereview.ocp.advanced.answer.domain;

import ru.agilemindset.codereview.ocp.advanced.answer.EventEnterceptor;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public interface Event {

    void handle(EventEnterceptor interceptor, Object entity);

}
