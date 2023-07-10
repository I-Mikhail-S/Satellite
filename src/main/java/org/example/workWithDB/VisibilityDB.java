package org.example.workWithDB;

import org.example.utils.DatabaseDAO;
import org.example.utils.Parser;
import org.example.utils.ParserSecond;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VisibilityDB implements InterfaceCRUD{
    private ResultSet resultSet;
    private  static Parser parserOne;

    public VisibilityDB() {
        parserOne = new Parser();
    }

    public void completion(String file,int idTown) {
        try {
            for (int i = 0; i < parserOne.parse(file).size()/2; i++) {
                DatabaseDAO.statement.executeUpdate("INSERT INTO schema.visibility (start_time,end_time,id_ground_station,id_spacecraft) VALUES ('" +
                        parserOne.getDateEnd().get(i) + "', '" +parserOne.getDateStart().get(i) + "', '" + idTown + "' , '" + parserOne.getName().get(i) + "' )");
            }
            } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"completion.visibility\" отработал.");
        }
    }

    public void deleted(int id) {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.visibility WHERE id = " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deleted.visibility\" отработал.");
        }
    }

    public void deletedAll() {
        try {
            DatabaseDAO.statement.executeUpdate("DELETE FROM schema.visibility");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\"deletedAll.visibility\" отработал.");
        }
    }

    public void report() {
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
