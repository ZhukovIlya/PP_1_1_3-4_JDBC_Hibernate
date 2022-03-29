package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private String userName = "root";
    private String password = "root";
    private String connectionUrl = "jdbc:mysql://localhost:3306/test";
    private Connection connection = null;

    private Util() {
        try {
            connection = DriverManager.getConnection(connectionUrl, userName, password);
        } catch (SQLException e) {
            System.out.printf("Не подключился");
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static Util getInstance() {
        return new Util();
    }
}


