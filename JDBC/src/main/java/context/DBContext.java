package context;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
    public Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
        String serverName = "localhost";
        String portNumber = "3306";
        String dbName = "webshop";
        String url = "jdbc:mysql//" + serverName + ":" + portNumber + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        String user = "root";
        String passwrod = "Thienthao1";
        return DriverManager.getConnection(url, user, passwrod);
    }
}
