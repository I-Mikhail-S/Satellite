package org.example.entities;

import org.example.utils.DatabaseDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CreateEntities {

    public List<Satellite> createAllSatellite() {
        List<Satellite> allSatellite = new ArrayList<>();
        try {
            ResultSet resultSet = DatabaseDAO.statement.executeQuery("SELECT * FROM schema.spacecraft");
            while (resultSet.next()) {
                allSatellite.add(new Satellite(resultSet.getInt("id")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allSatellite;
    }

    public List<Station> createAllStation() {
        List<Station> allStation = new ArrayList<>();
        try {
            ResultSet resultSet = DatabaseDAO.statement.executeQuery("SELECT * FROM schema.ground_station");
            while (resultSet.next()) {
                allStation.add(new Station(resultSet.getInt("id")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allStation;
    }

    public List<AreaOfInterest> createAllAreaOfInterest() {
        List<AreaOfInterest> allAreaOfInterest = new ArrayList<>();
        try {
            ResultSet resultSet = DatabaseDAO.statement.executeQuery("SELECT * FROM schema.area_of_interest");
            while (resultSet.next()) {
                allAreaOfInterest.add(new AreaOfInterest(resultSet.getInt("id")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allAreaOfInterest;
    }

}
