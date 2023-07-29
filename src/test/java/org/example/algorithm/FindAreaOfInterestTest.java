package org.example.algorithm;

import org.example.entities.AreaOfInterest;
import org.example.entities.Satellite;
import org.example.entities.Station;
import org.example.specifications.Purpose;
import org.example.specifications.Schedule;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindAreaOfInterestTest {
    private static List<AreaOfInterest> interestList;
    private static List<Satellite> satelliteList;
    private static Schedule allSchedule;

    @BeforeClass
    public static void setUp() {
        CreateEntities createEntities = new CreateEntities();
        GettingDataFromBD gettingDataFromBD = new GettingDataFromBD();
        FindAreaOfInterest findAreaOfInterest = new FindAreaOfInterest();

        List<Satellite> satelliteList1 = createEntities.createAllSatellite();
        List<Station> stationList = createEntities.createAllStation();
        List<AreaOfInterest> areaOfInterestList = createEntities.createAllAreaOfInterest();

        gettingDataFromBD.gettingDataFromBD(
                satelliteList1,
                stationList,
                areaOfInterestList
        );

        findAreaOfInterest.findAreaOfInterest(satelliteList1);

        Schedule allSchedule1 = new Schedule();
        for (Satellite helpSatellite : satelliteList1) {
            allSchedule1.addAllPurpose(helpSatellite.getSchedule());
        }

        allSchedule = allSchedule1;
        satelliteList = satelliteList1;
        interestList = areaOfInterestList;
    }


    @Test
    public void uniquenessPurposesTest() {
        Set<Purpose> uniquePurpose = new LinkedHashSet<>(allSchedule.getAllPurpose());

        if (allSchedule.getAllPurpose().size() != uniquePurpose.size()) {
            Assertions.fail("Есть неуникальные элементы Purpose!");
        }
    }

    @Test
    public void uniquenessAreaOfInterestTest() {
        Set<AreaOfInterest> areaOfInterestUnique = new LinkedHashSet<>();
        List<AreaOfInterest> areaOfInterestList = new ArrayList<>();

        for (Purpose helpSPurpose : allSchedule.getAllPurpose()) {
            if (helpSPurpose.getStationOrArea() instanceof AreaOfInterest) {
                areaOfInterestUnique.add((AreaOfInterest) helpSPurpose.getStationOrArea());
                areaOfInterestList.add((AreaOfInterest) helpSPurpose.getStationOrArea());
            }
        }

        if (areaOfInterestList.size() > areaOfInterestUnique.size()) { // РИ - Район Интереса
            Assertions.fail("Есть точки (РИ) втречающиеся в расписании несколько раз! "
                    + "Количество просматриваемых точек: " + areaOfInterestList.size()
                    + ". Количество уникальных просматриваемых точек: " + areaOfInterestUnique.size()
                    + ". Лишних точек: " +
                    (areaOfInterestList.size() - areaOfInterestUnique.size()) + '.'
            );
        }
        if (areaOfInterestUnique.size() < interestList.size()) {
            Assertions.fail("Не все точки (РИ) просмотрены(сфотографированы)! "
                    + "Количеество пропущенных точек: "
                    + (interestList.size() - areaOfInterestUnique.size()) + '.'
            );
        }
    }


}