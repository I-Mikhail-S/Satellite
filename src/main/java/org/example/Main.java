package org.example;

import org.example.entities.Satellite;
import org.example.utils.DatabaseDAO;
import org.example.utils.Parser;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        DatabaseDAO databaseDAO = new DatabaseDAO();
        Parser parser = new Parser();
        for (int i = 0; i < 99; i++) {
            System.out.println(parser.parse("Moscow.txt").get(i).substring(0,19)+ parser.parse("Moscow.txt").get(i).substring(20, 33));
        }

    }
}