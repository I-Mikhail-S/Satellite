package org.example;

import org.example.utils.DatabaseDAO;
import org.example.utils.Parser;
import org.example.utils.ParserSecond;
import org.example.workWithDB.*;

import org.example.specifications.TimeInterval;
import org.example.utils.Time;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {

<<<<<<< HEAD
    public static void main(String[] args) {
        Parser parser = new Parser();
       VisibilityDB visibilityDB = new VisibilityDB();
        visibilityDB.completion("Ulan-Ude.txt",3);
     /*   for (int i = 0; i < parser.parse("Moscow.txt").size()/2; i++) {
            System.out.println(i +" " + parser.getName().get(i)+ " " + parser.getDateStart().get(i)+ " " +parser.getDateEnd().get(i));
        }*/
=======
    public static void main(String[] args) throws ParseException {

        TimeInterval timeInterval = new TimeInterval(
                new Time("2023-07-01 00:13:35"),
                new Time("2023-07-01 00:15:15")
        );
        System.out.println(timeInterval.getTimeIntervalSecond());
>>>>>>> e1475f27f5a354e8d2566111074f09e47837056b

    }
}
