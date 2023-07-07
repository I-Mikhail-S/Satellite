package org.example.utils;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class DatabaseDAO  {
    private static final String URL = "jdbc:mysql://localhost:3306/schema?serverTimezone=Europe/Moscow&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "admin1";
    private static final String GET_STUDENTS_IN_CLASS_QUERY = "SELECT * FROM student WHERE class_id = ?";
    private Connection conn;

    public DatabaseDAO() throws ClassNotFoundException {
        Parser parser = new Parser("");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

                String sql = "INSERT INTO ekater (date,name) VALUES (?, ?) ";
                PreparedStatement statement = conn.prepareStatement(sql);
                for (int i = 0; i < 99; i++) {
                    statement.setString(1,parser.getName().get(i));
                    statement.setString(1,parser.getDate().get(i));
                }
            } catch (Exception ex) {
                System.out.println("Connection failed...");
            }
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}