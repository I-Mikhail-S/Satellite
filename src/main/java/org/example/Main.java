package org.example;

import org.example.utils.Parser;
import org.example.utils.ParserSecond;
import org.example.workWithDB.SpacecraftDB;
import org.example.workWithDB.StationDB;
import org.example.workWithDB.VisibilityDB;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        VisibilityDB visibilityDB = new VisibilityDB();
        visibilityDB.completion("Moscow.txt",1);
    }
}
