package ru.agilemindset.codereview.ocp.advanced.answer;

import ru.agilemindset.codereview.ocp.advanced.answer.domain.*;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public interface IEventEnterceptor {

    public void interceptEvent(Enter event, Object entity);

    public void interceptEvent(Exit event, Object entity);

    public void interceptEvent(Fly event, Object entity);

    public void interceptEvent(Go event, Object entity);

    public void interceptEvent(Jump event, Object entity);


}
