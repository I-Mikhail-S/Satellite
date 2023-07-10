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


    public static void main(String[] args) {
        Parser parser = new Parser();
     for (int i = 0; i < parser.parse("Moscow.txt").size()/2; i++) {
            System.out.println(i +" " + parser.getName().get(i)+ " " + parser.getDateStart().get(i)+ " " +parser.getDateEnd().get(i));
        }
    }
}
