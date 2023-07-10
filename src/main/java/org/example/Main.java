package org.example;


import org.example.utils.DatabaseDAO;
import org.example.utils.Parser;
import org.example.utils.ParserSecond;
import org.example.workWithDB.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

         ParserSecond parserSecond = new ParserSecond();
        VisibilitySecondDB visibilitySecondDB = new VisibilitySecondDB();
        List<String> listData = new ArrayList<>(parserSecond.parse("visible.txt"));
        visibilitySecondDB.completion(listData);
        visibilitySecondDB.report();


    }
}
