package org.example.workWithDB;

import org.example.utils.DatabaseDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AreaOfInterestDB implements InterfaceCRUD{
    private ResultSet resultSet;

    public AreaOfInterestDB() {}

    public void completion() {
        try {
            for (int i = 0; i < 1000; i++) { // всего 1000 Районов Интереса начиная с "0"
                DatabaseDAO.statement.executeUpdate("INSERT INTO schema.area_of_interest (id) VALUES (" + i + ")");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"completion.area_of_interest\" отработал.");
        }
    }

    public void deleted(int id) {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.area_of_interest WHERE id = " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deleted.area_of_interest\" отработал.");
        }
    }

    public void deletedAll() {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.area_of_interest");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deletedAll.area_of_interest\" отработал.");
        }
    }

    public void report() {
        try {
            resultSet = DatabaseDAO.statement.executeQuery("SELECT * FROM schema.area_of_interest");
            while (resultSet.next()) {
                System.out.println(resultSet.getRow() + ". " +
                        resultSet.getInt("id") + ';');
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"report.area_of_interest\" отработал.");
        }
    }
}
