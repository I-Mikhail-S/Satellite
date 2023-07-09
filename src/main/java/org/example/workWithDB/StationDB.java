package org.example.workWithDB;

import org.example.utils.DatabaseDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StationDB implements InterfaceCRUD{
    private static ResultSet resultSet;

    public StationDB() {}

    public static void completion() {
        try {
<<<<<<< HEAD
            for (int i = 1; i < 4; i++) {
                DatabaseDAO.statement.executeUpdate("INSERT INTO pracktica.ground_station (id) VALUES (" + i + ")");
=======
            for (int i = 1; i < 4; i++) { // всего 3 наземных станции (1 - Москва; 2 - Екатеринбург; 3 - Улан-Уде)
                DatabaseDAO.statement.executeUpdate("INSERT INTO schema.ground_station (id) VALUES (" + i + ")");
>>>>>>> 3c1d791dec2d1915fe9736e4c9d45eec3cd2d7a1
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"completion.ground_station\" отработал.");
        }
    }

    public static void deleted(int id) {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.ground_station WHERE id = " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deleted.ground_station\" отработал.");
        }
    }

    public static void deletedAll() {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.ground_station");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deletedAll.ground_station\" отработал.");
        }
    }

    public static void report() {
        try {
            resultSet = DatabaseDAO.statement.executeQuery("SELECT * FROM schema.ground_station");
            while (resultSet.next()) {
                System.out.println(resultSet.getRow() + ". " +
                        resultSet.getInt("id") + ';');
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"report.ground_station\" отработал.");
        }
    }
}
