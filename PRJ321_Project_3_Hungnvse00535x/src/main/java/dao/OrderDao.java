package dao;

import context.DBContext;
import model.Cart;
import model.Orders;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class OrderDao {
    DBContext ctx = new DBContext();

    public void insertOrder(Orders o, Cart c) throws Exception {
        String INSERT_USERS_MYSQL = "INSERT INTO Orders" + "  (USER_MAIL, ORDER_ID, ORDER_STATUS, ORDER_DATE,ORDER_DISCOUNT_CODE, ORDER_ADDRESS)" +
                " VALUES " + " (?, ?, ?, ?, ?, ?);";
        Connection connection = ctx.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_MYSQL);
        preparedStatement.setString(1, o.getUSER_MAIL());
        preparedStatement.setInt(2, o.getORDER_ID());
        preparedStatement.setInt(3, o.getORDER_STATUS());
        preparedStatement.setDate(4, (Date) o.getORDER_DATE());
        preparedStatement.setString(5, o.getORDER_DISCOUNT_CODE());
        preparedStatement.setString(6, o.getORDER_ADDRESS());
        System.out.println(preparedStatement);
        preparedStatement.executeUpdate();

    }
}
