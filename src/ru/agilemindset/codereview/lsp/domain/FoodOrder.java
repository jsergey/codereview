package ru.agilemindset.codereview.lsp.domain;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public class FoodOrder extends Order{
    @Override
    protected String getOrderCode() {
        return "food order";
    }
}
