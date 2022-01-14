package dao;

import context.DBContext;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ListProductDAO {
    DBContext ctx = new DBContext();

    public List<Product> search(String characters) throws Exception {
        String sqlString = "select * from Products where products like CONCAT( '%',?,'%')";
        List<Product> result = new ArrayList<>();
        Connection connect = ctx.getConnection();

        PreparedStatement statement = connect.prepareStatement(sqlString);
        statement.setString(1, characters);
        // Result set get the result of the SQL query
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            Product product = new Product();

            int PRODUCT_ID = resultSet.getInt("PRODUCT_ID");
            product.setPRODUCT_ID(PRODUCT_ID);

            String PRODUCT_NAME = resultSet.getString("PRODUCT_NAME");
            product.setPRODUCT_NAME(PRODUCT_NAME);

            String PRODUCT_DES = resultSet.getString("PRODUCT_DES");
            product.setPRODUCT_DES(PRODUCT_DES);

            float PRODUCT_PRICE = resultSet.getFloat("PRODUCT_PRICE");
            product.setPRODUCT_PRICE(PRODUCT_PRICE);

            String PRODUCT_IMG_SOURCE = resultSet.getString("PRODUCT_IMG_SOURCE");
            product.setPRODUCT_IMG_SOURCE(PRODUCT_IMG_SOURCE);

            String PRODUCT_TYPE = resultSet.getString("PRODUCT_TYPE");
            product.setPRODUCT_TYPE(PRODUCT_TYPE);

            String PRODUCT_BRAND = resultSet.getString("PRODUCT_BRAND");
            product.setPRODUCT_BRAND(PRODUCT_BRAND);

            int PRODUCT_NUMBER = resultSet.getInt("PRODUCT_NUMBER");
            product.setPRODUCT_NUMBER(PRODUCT_NUMBER);

            result.add(product);
        }

        return result;
    }

    public Product getProductById(int id) throws Exception {
        String sqlString = "select * from Products where product_id = ?";
        Connection connect = ctx.getConnection();

        PreparedStatement statement = connect.prepareStatement(sqlString);
        statement.setInt(1, id);
        // Result set get the result of the SQL query
        ResultSet resultSet = statement.executeQuery();

        Product product = null;

        if (resultSet.next()) {
            int PRODUCT_ID = resultSet.getInt("PRODUCT_ID");
            String PRODUCT_NAME = resultSet.getString("PRODUCT_NAME");
            String PRODUCT_DES = resultSet.getString("PRODUCT_DES");
            float PRODUCT_PRICE = resultSet.getFloat("PRODUCT_PRICE");
            String PRODUCT_IMG_SOURCE = resultSet.getString("PRODUCT_IMG_SOURCE");
            String PRODUCT_TYPE = resultSet.getString("PRODUCT_TYPE");
            String PRODUCT_BRAND = resultSet.getString("PRODUCT_BRAND");
            int PRODUCT_NUMBER = resultSet.getInt("PRODUCT_NUMBER");
            product = new Product(PRODUCT_ID, PRODUCT_NAME, PRODUCT_DES, PRODUCT_PRICE, PRODUCT_IMG_SOURCE, PRODUCT_TYPE, PRODUCT_BRAND, PRODUCT_NUMBER);
        }
        return product;
    }
}
