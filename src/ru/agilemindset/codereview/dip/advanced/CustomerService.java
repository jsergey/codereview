package ru.agilemindset.codereview.dip.advanced;

import ru.agilemindset.codereview.dip.advanced.domain.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public class CustomerService {

    private static final String SQL = "INSERT INTO Customers (id, name, phone) VALUES (?,?,?)";

    private Database database;

    public CustomerService(Database database) {
        this.database = database;
    }

    public void addCustomer(int id, String name, String phone) {
        try (Connection connection = database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)
        ) {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, phone);
        } catch (SQLException e) {
            //database error handler
        }
    }

    public void placeOrder(String order) {
        //some logic here
    }

}
