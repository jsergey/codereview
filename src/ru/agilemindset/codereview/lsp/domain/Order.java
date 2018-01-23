package ru.agilemindset.codereview.lsp.domain;

import java.util.List;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public abstract class Order {

    public void placeOrder(List orders) {
        orders.add(getOrderCode());
    }

    protected abstract String getOrderCode();

}
