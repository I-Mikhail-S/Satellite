package org.example.workWithDB;

import org.example.utils.DatabaseDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SpacecraftDB implements InterfaceNotCRUD {
    private ResultSet resultSet;

    public SpacecraftDB() {}

    public void completion() {
        try {
            for (int i = 1; i < 9; i++) {
                DatabaseDAO.statement.executeUpdate("INSERT INTO schema.spacecraft (id) VALUES (" + i + ")");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"completion.spacecraft\" отработал.");
        }
    }

    public void deleted(int id) {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.spacecraft WHERE id = " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deleted.spacecraft\" отработал.");
        }
    }

    public void deletedAll() {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.spacecraft");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deletedAll.spacecraft\" отработал.");
        }
    }

    public void report() {
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
