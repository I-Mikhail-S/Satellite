package org.example;

import org.example.utils.ParserSecond;
import org.example.workWithDB.SpacecraftDB;
import org.example.workWithDB.StationDB;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ParserSecond parserSecond = new ParserSecond();
        for (String helpVariable : parserSecond.parse("visible.txt")) {
            System.out.println(helpVariable);
        }

    }
}