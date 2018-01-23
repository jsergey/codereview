package ru.agilemindset.codereview.lsp.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public class GiftCardOrder extends Order{

    List customer = new ArrayList();

    @Override
    public void placeOrder(List orders) {
        customer.add(orders);
    }

    @Override
    protected String getOrderCode() {
        return "gift code";
    }
}
