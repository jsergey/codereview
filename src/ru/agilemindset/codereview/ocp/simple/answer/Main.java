package ru.agilemindset.codereview.ocp.simple.answer;

import ru.agilemindset.codereview.ocp.simple.answer.domain.BestFriend;
import ru.agilemindset.codereview.ocp.simple.answer.domain.Friend;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Friend friend = new BestFriend();
        System.out.println(main.getMoney(friend));
    }

    public int getMoney(Friend friend) {
        return friend.getMoney();
    }

}
