package org.example.workWithDB;

import org.example.utils.DatabaseDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class VisibilitySecondDB implements InterfaceCRUD{
    private static ResultSet resultSet;

    public VisibilitySecondDB() {}

    public static void completion(List<String> listData) {
        try {
            for (int i = 1; i < 4; i++) {
                DatabaseDAO.statement.executeUpdate("INSERT INTO schema.visibility (id) VALUES (" + i + ")");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"completion.visibility\" отработал.");
        }
    }

    public static void deleted(int id) {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.visibility WHERE id = " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deleted.visibility\" отработал.");
        }
    }

    public static void deletedAll() {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.visibility");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deletedAll.visibility\" отработал.");
        }
    }

    public static void report() {
        try {
            resultSet = DatabaseDAO.statement.executeQuery("SELECT * FROM schema.visibility");
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getRow() + ". " +
                        resultSet.getInt("id") + ", " +
                        resultSet.getInt("id_ground_station") + ", " +
                        resultSet.getInt("id_spacecraft") + ", " +
                        resultSet.getInt("id_area_of_interest") + ", " +
                        resultSet.getString("start_time") + ", " +
                        resultSet.getString("end_time") + '.'
                        );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"report.visibility\" отработал.");
        }
    }
}
