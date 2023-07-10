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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicAlgorithm {

    public List<Schedule> basicAlgorithm(List<Satellite> satelliteList, List<Station> stationList, List<AreaOfInterest> areaOfInterestList) {
        List<Schedule> scheduleAllSatellite = new ArrayList<>();
        try {
            ResultSet resultSet = DatabaseDAO.statement.executeQuery("SELECT * FROM schema.visibility");
                while (resultSet.next()) {
                    if (resultSet.getObject("id_ground_station") == null) {
                        if (resultSet.getInt("id_spacecraft") == 1) {
                            satelliteList.get(1).getSchedule().addPurpose(new Purpose(satelliteList.get(1),
                                    areaOfInterestList.get(resultSet.getInt("id_area_of_interest")),
                                    new TimeInterval(
                                            new Time(resultSet.getString("start_time")),
                                            new Time(resultSet.getString("end_time"))
                                    )
                            ));
                        } else if (resultSet.getInt("id_spacecraft") == 2) {
                            satelliteList.get(2).getSchedule().addPurpose(new Purpose(satelliteList.get(2),
                                    areaOfInterestList.get(resultSet.getInt("id_area_of_interest")),
                                    new TimeInterval(
                                            new Time(resultSet.getString("start_time")),
                                            new Time(resultSet.getString("end_time"))
                                    )
                            ));
                        } else if (resultSet.getInt("id_spacecraft") == 3) {
                            satelliteList.get(3).getSchedule().addPurpose(new Purpose(satelliteList.get(3),
                                    areaOfInterestList.get(resultSet.getInt("id_area_of_interest")),
                                    new TimeInterval(
                                            new Time(resultSet.getString("start_time")),
                                            new Time(resultSet.getString("end_time"))
                                    )
                            ));
                        } else if (resultSet.getInt("id_spacecraft") == 4) {
                            satelliteList.get(4).getSchedule().addPurpose(new Purpose(satelliteList.get(4),
                                    areaOfInterestList.get(resultSet.getInt("id_area_of_interest")),
                                    new TimeInterval(
                                            new Time(resultSet.getString("start_time")),
                                            new Time(resultSet.getString("end_time"))
                                    )
                            ));
                        } else if (resultSet.getInt("id_spacecraft") == 5) {
                            satelliteList.get(5).getSchedule().addPurpose(new Purpose(satelliteList.get(5),
                                    areaOfInterestList.get(resultSet.getInt("id_area_of_interest")),
                                    new TimeInterval(
                                            new Time(resultSet.getString("start_time")),
                                            new Time(resultSet.getString("end_time"))
                                    )
                            ));
                        } else if (resultSet.getInt("id_spacecraft") == 6) {
                            satelliteList.get(6).getSchedule().addPurpose(new Purpose(satelliteList.get(6),
                                    areaOfInterestList.get(resultSet.getInt("id_area_of_interest")),
                                    new TimeInterval(
                                            new Time(resultSet.getString("start_time")),
                                            new Time(resultSet.getString("end_time"))
                                    )
                            ));
                        } else if (resultSet.getInt("id_spacecraft") == 7) {
                            satelliteList.get(7).getSchedule().addPurpose(new Purpose(satelliteList.get(7),
                                    areaOfInterestList.get(resultSet.getInt("id_area_of_interest")),
                                    new TimeInterval(
                                            new Time(resultSet.getString("start_time")),
                                            new Time(resultSet.getString("end_time"))
                                    )
                            ));
                        } else if (resultSet.getInt("id_spacecraft") == 8) {
                            satelliteList.get(8).getSchedule().addPurpose(new Purpose(satelliteList.get(8),
                                    areaOfInterestList.get(resultSet.getInt("id_area_of_interest")),
                                    new TimeInterval(
                                            new Time(resultSet.getString("start_time")),
                                            new Time(resultSet.getString("end_time"))
                                    )
                            ));
                        }
                    } else if (resultSet.getObject("id_area_of_interest") == null) {
                        if (resultSet.getInt("id_ground_station") == 1) {
                            satelliteList.get(resultSet.getInt("id_spacecraft")).getSchedule()
                                    .addPurpose(new Purpose(
                                            satelliteList.get(resultSet.getInt("id_spacecraft")),
                                            stationList.get(1),
                                            new TimeInterval(
                                                    new Time(resultSet.getString("start_time")),
                                                    new Time(resultSet.getString("end_time"))
                                            )
                                            )
                                    );
                        } else if (resultSet.getInt("id_ground_station") == 2) {
                            satelliteList.get(resultSet.getInt("id_spacecraft")).getSchedule()
                                    .addPurpose(new Purpose(
                                                    satelliteList.get(resultSet.getInt("id_spacecraft")),
                                                    stationList.get(2),
                                                    new TimeInterval(
                                                            new Time(resultSet.getString("start_time")),
                                                            new Time(resultSet.getString("end_time"))
                                                    )
                                            )
                                    );
                        } else if (resultSet.getInt("id_ground_station") == 3) {
                            satelliteList.get(resultSet.getInt("id_spacecraft")).getSchedule()
                                    .addPurpose(new Purpose(
                                                    satelliteList.get(resultSet.getInt("id_spacecraft")),
                                                    stationList.get(3),
                                                    new TimeInterval(
                                                            new Time(resultSet.getString("start_time")),
                                                            new Time(resultSet.getString("end_time"))
                                                    )
                                            )
                                    );
                        }
                    }
                    for (int i = 0; i < satelliteList.size(); i++) {
                        sortedSchedule(satelliteList.get(i).getSchedule());
                    }


                }
        } catch (SQLException | ParseException e) {
            throw new RuntimeException(e);
        }
        return scheduleAllSatellite;
    }

    public void sortedSchedule(Schedule schedule) {
        Collections.sort(schedule.getAllPurpose());
    }

}
