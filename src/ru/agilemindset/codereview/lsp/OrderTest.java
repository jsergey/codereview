package ru.agilemindset.codereview.lsp;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.agilemindset.codereview.lsp.domain.BookOrder;
import ru.agilemindset.codereview.lsp.domain.FoodOrder;
import ru.agilemindset.codereview.lsp.domain.GiftCardOrder;
import ru.agilemindset.codereview.lsp.domain.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public class OrderTest {

    @Test
    public void shouldAddItemsToOrders() {
        List<Order> allOrdersTypes = new ArrayList();
        allOrdersTypes.add(new BookOrder());
        allOrdersTypes.add(new FoodOrder());
        allOrdersTypes.add(new GiftCardOrder());

        List orders = new ArrayList();

        for(Order order: allOrdersTypes) {
            order.placeOrder(orders);
        }

        assertEquals("Three orders should be placed", 3, orders.size());

    }

}
