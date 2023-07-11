package org.example;

import org.example.utils.Parser;
import org.example.workWithDB.VisibilityDB;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        VisibilityDB visibilityDB = new VisibilityDB();
        visibilityDB.completion("Moscow.txt", 1);
        visibilityDB.report();

    }
}
