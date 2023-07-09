package org.example.workWithDB;

import org.example.utils.DatabaseDAO;
import org.example.utils.Parser;
import org.example.utils.ParserSecond;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VisibilityDB implements InterfaceCRUD{
    private static ResultSet resultSet;
    private  static Parser parserOne;

    public VisibilityDB() {
        parserOne = new Parser();
    }

    public static void completion(String file,int idTown) {
        try {
            for (int i = 1; i < parserOne.parse(file).size()+1; i++) {
                DatabaseDAO.statement.executeUpdate("INSERT INTO pracktica.visibility (id_ground_station,id_spacecraft,start_time,end_time) VALUES ('" + parserOne.getDateStart().get(i) + "', '" +  parserOne.getDateEnd().get(i)  + "', '" + idTown + "' , '" + parserOne.getName().get(i) + "' )");
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
