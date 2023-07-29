package org.example.algorithm;

import org.example.entities.AreaOfInterest;
import org.example.entities.Satellite;
import org.example.entities.Station;

import java.util.List;

public class StartApplication {

    public static void startApplication() {
        CreateEntities createEntities = new CreateEntities();
        GettingDataFromBD gettingDataFromBD = new GettingDataFromBD();
        FindAreaOfInterest findAreaOfInterest = new FindAreaOfInterest();

        List<Satellite> satelliteList = createEntities.createAllSatellite();
        List<Station> stationList = createEntities.createAllStation();
        List<AreaOfInterest> areaOfInterestList = createEntities.createAllAreaOfInterest();

        gettingDataFromBD.gettingDataFromBD(
                satelliteList,
                stationList,
                areaOfInterestList
        );

        findAreaOfInterest.findAreaOfInterest(satelliteList);
        printResult(satelliteList);
    }

    public static void printResult(List<Satellite> satelliteList) {
        for (Satellite helpVariable : satelliteList) {
            System.out.println(helpVariable);
        }
    }

}
