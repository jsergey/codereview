package ru.agilemindset.codereview.dip.advanced.domain;

import java.sql.Connection;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public interface Database {

    Connection getConnection();

}
