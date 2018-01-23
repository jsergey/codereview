package ru.agilemindset.codereview.ocp.simple;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public class Friend {
    public int getMoney(String type) {
        if(type.equals("best")) {
            return 10000;
        } else if (type.equals("notbest")) {
            return 1000;
        } else if (type.equals("nomorefriend")) {
            return 100;
        }
        throw new RuntimeException("Should be unreachable");
    }

}
