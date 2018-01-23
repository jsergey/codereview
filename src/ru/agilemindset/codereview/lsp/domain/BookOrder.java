package ru.agilemindset.codereview.lsp.domain;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public class BookOrder extends Order {
    @Override
    protected String getOrderCode() {
        return "book order";
    }
}
