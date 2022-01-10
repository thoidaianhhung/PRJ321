package context;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {

    public Connection getConnection() throws Exception {
        String serverName = "localhost";
        String dbName = "shoppingdb";
        String portNumber = "3306";
        String url = "jdbc:mysql://" + serverName + ":" + portNumber + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        String userId = "root";
        String password = "Thienthao1";
        return DriverManager.getConnection(url, userId, password);
    }
}
