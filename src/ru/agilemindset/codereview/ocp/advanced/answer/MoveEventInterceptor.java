package ru.agilemindset.codereview.ocp.advanced.answer;

import ru.agilemindset.codereview.ocp.advanced.answer.domain.*;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public class MoveEventInterceptor implements EventEnterceptor {


    public void interceptEvent(Enter event, Object entity) {
        System.out.println("enter");
    }

    public void interceptEvent(Exit event, Object entity) {
        System.out.println("exit");
    }

    public void interceptEvent(Fly event, Object entity) {
        System.out.println("fly");
    }

    public void interceptEvent(Go event, Object entity) {
        System.out.println("go");
    }

    public void interceptEvent(Jump event, Object entity) {
        System.out.println("jump");

    }

}
