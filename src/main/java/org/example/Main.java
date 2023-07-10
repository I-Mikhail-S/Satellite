package org.example;



import org.example.specifications.TimeInterval;
import org.example.utils.Time;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {

        TimeInterval timeInterval = new TimeInterval(
                new Time("2023-07-01 00:13:35"),
                new Time("2023-07-01 00:15:15")
        );
        System.out.println(timeInterval.getTimeIntervalSecond());

    }
}
