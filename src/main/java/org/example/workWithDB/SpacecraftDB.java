package org.example.workWithDB;

import org.example.utils.DatabaseDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SpacecraftDB implements InterfaceCRUD{
    private static ResultSet resultSet;

    public SpacecraftDB() {}

    public static void completion() {
        try {
<<<<<<< HEAD
            for (int i = 1; i < 9; i++) {
                DatabaseDAO.statement.executeUpdate("INSERT INTO pracktica.spacecraft (id) VALUES (" + i + ")");
=======
            for (int i = 1; i < 9; i++) { // всего 8 спутников
                DatabaseDAO.statement.executeUpdate("INSERT INTO schema.spacecraft (id) VALUES (" + i + ")");
>>>>>>> 3c1d791dec2d1915fe9736e4c9d45eec3cd2d7a1
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"completion.spacecraft\" отработал.");
        }
    }

    public static void deleted(int id) {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.spacecraft WHERE id = " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deleted.spacecraft\" отработал.");
        }
    }

    public static void deletedAll() {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.spacecraft");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deletedAll.spacecraft\" отработал.");
        }
    }

    public static void report() {
        try {
            resultSet = DatabaseDAO.statement.executeQuery("SELECT * FROM schema.spacecraft");
            while (resultSet.next()) {
                System.out.println(resultSet.getRow() + ". " +
                        resultSet.getInt("id") + ';');
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"report.spacecraft\" отработал.");
        }
    }

}
