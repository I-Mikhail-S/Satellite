package org.example.algorithm;

import org.example.entities.AreaOfInterest;
import org.example.entities.Satellite;
import org.example.entities.Station;
import org.example.specifications.Purpose;
import org.example.specifications.Schedule;
import org.example.specifications.TimeInterval;
import org.example.utils.DatabaseDAO;
import org.example.utils.Time;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Collections;
import java.util.List;

public class GettingDataFromBD {

    public void gettingDataFromBD(List<Satellite> satelliteList, List<Station> stationList, List<AreaOfInterest> areaOfInterestList) {
        try {
            ResultSet resultSet = DatabaseDAO.statement.executeQuery("SELECT * FROM schema.visibility");
                while (resultSet.next()) {
                    if (resultSet.getObject("id_ground_station") == null) {
                        //if (resultSet.getInt("id_spacecraft") != 1) continue;
                        satelliteList.get(resultSet.getInt("id_spacecraft") - 1).getSchedule().addPurpose(
                                new Purpose(satelliteList.get(resultSet.getInt("id_spacecraft") - 1),
                                        areaOfInterestList.get(resultSet.getInt("id_area_of_interest")),
                                        new TimeInterval(
                                                new Time(resultSet.getString("start_time")),
                                                new Time(resultSet.getString("end_time"))
                                        )
                                ));

                    } else if (resultSet.getObject("id_area_of_interest") == null) {
                        //if (resultSet.getInt("id_spacecraft") != 1) continue;
                        satelliteList.get(resultSet.getInt("id_spacecraft") - 1).getSchedule().addPurpose(
                                new Purpose(satelliteList.get(resultSet.getInt("id_spacecraft")  - 1),
                                        stationList.get(resultSet.getInt("id_ground_station") - 1),
                                        new TimeInterval(
                                                new Time(resultSet.getString("start_time")),
                                                new Time(resultSet.getString("end_time"))
                                        )
                                ));
                    }
                    //if (satelliteList.get(0).getSchedule().getAllPurpose().size() >= 1000) break;
                }
            for (Satellite helpVariable : satelliteList) {
                sortedSchedule(helpVariable.getSchedule());
            }
        } catch (SQLException | ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\tДанные выгружены.");
    }

    public void sortedSchedule(Schedule schedule) {
        Collections.sort(schedule.getAllPurpose());
    }

}
