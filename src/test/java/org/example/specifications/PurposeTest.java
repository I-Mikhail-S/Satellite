package org.example.specifications;

import org.example.algorithm.GettingDataFromBD;
import org.example.algorithm.CreateEntities;
import org.example.entities.Satellite;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class PurposeTest {
    private static CreateEntities createEntities;
    private static GettingDataFromBD gettingDataFromBD;

    @BeforeClass
    public static void setUp() {
        createEntities = new CreateEntities();
        gettingDataFromBD = new GettingDataFromBD();
    }

    @Test
    public void testCompareTo() {
        List<Satellite> satelliteList = createEntities.createAllSatellite();
        gettingDataFromBD.gettingDataFromBD(
                satelliteList,
                createEntities.createAllStation(),
                createEntities.createAllAreaOfInterest()
        );
        System.out.println(satelliteList.get(0));
    }

}