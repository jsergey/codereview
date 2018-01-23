package ru.agilemindset.codereview.dip.simple;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public interface CustomerService {

    LinkedList getCustomers();

    HashMap getCustomersReports(List ids);

}
