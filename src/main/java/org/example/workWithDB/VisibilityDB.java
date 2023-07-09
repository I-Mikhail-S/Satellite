package org.example.workWithDB;

import org.example.utils.DatabaseDAO;
import org.example.utils.Parser;
import org.example.utils.ParserSecond;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VisibilityDB implements InterfaceCRUD{
    private static ResultSet resultSet;
    private final AllParser parserOne;
    private final AllParser parserTwo;

    public VisibilityDB() {
        parserOne = new Parser();
        parserTwo = new ParserSecond();
    }

    public static void completion(String file) {
        try {
            for (int i = 1; i < 1; i++) {
                DatabaseDAO.statement.executeUpdate("INSERT INTO schema.spacecraft (id,stat_time,end_time,id_ground_station,id_spacecraft,) VALUES (" + i + ")");
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
