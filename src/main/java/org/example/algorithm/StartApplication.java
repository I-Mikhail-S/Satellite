package org.example.algorithm;

import org.example.entities.CreateEntities;
import org.example.entities.Satellite;

import java.util.List;

public class StartApplication {

    public static void startApplication() {
        CreateEntities createEntities = new CreateEntities();
        GettingDataFromBD gettingDataFromBD = new GettingDataFromBD();
        FindAreaOfInterest findAreaOfInterest = new FindAreaOfInterest();
        List<Satellite> satelliteList = createEntities.createAllSatellite();
        gettingDataFromBD.gettingDataFromBD(
                satelliteList,
                createEntities.createAllStation(),
                createEntities.createAllAreaOfInterest()
        );
        findAreaOfInterest.findAreaOfInterest(satelliteList);
        for (Satellite helpVariable : satelliteList) {
            System.out.println(helpVariable);
        }
    }

}
