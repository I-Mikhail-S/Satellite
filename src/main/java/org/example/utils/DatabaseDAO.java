package org.example.utils;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class DatabaseDAO  {
    private static final String URL = "jdbc:mysql://localhost:3306/towns?serverTimezone=Europe/Moscow&useSSL=false";
    //нет, это чтобы синхронизировать московское время
    private static final String USER = "root";
    private static final String PASSWORD = "Stepan11022004";
    private static final String GET_STUDENTS_IN_CLASS_QUERY = "SELECT * FROM student WHERE class_id = ?";
    //функция выше нужна для поиска элемента из бд..
    // Дословно: Получить всех {} где какой-то параметр чему то равен нет нет
    private Connection conn;

    public DatabaseDAO() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

                String sql = "INSERT INTO ekater (date,name) VALUES (?, ?) ";
                Parser parser = new Parser();
                PreparedStatement statement = conn.prepareStatement(sql);
                for (int i = 0; i < 99; i++) {
                    statement.setString(1, parser.parse("Ulan-Ude.txt").get(i).substring(0, 19));
                    statement.setString(2, parser.parse("Ulan-Ude.txt").get(i).substring(20, 33));
                    int rowsInserted = statement.executeUpdate();
                }
            } catch (Exception ex) {
                System.out.println("Connection failed...");

                System.out.println(ex);
            }
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}