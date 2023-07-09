package org.example.utils;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class DatabaseDAO  {
    private static final String URL = "jdbc:mysql://localhost:3306/pracktica?serverTimezone=Europe/Moscow&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "Stepan11022004";

    private static Connection connection;
    public static Statement statement;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
        } catch (SQLException | ClassNotFoundException | InvocationTargetException |
                 InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

}