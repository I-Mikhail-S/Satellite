package org.example.workWithDB;

import org.example.utils.DatabaseDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StationDB implements InterfaceNotCRUD {
    private ResultSet resultSet;

    public StationDB() {}

    public void completion() {
        try {
            for (int i = 1; i < 4; i++) {
                DatabaseDAO.statement.executeUpdate("INSERT INTO pracktica.ground_station (id) VALUES (" + i + ")");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"completion.ground_station\" отработал.");
        }
    }

    public void deleted(int id) {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.ground_station WHERE id = " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deleted.ground_station\" отработал.");
        }
    }

    public void deletedAll() {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.ground_station");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deletedAll.ground_station\" отработал.");
        }
    }

    public void report() {
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
