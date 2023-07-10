package org.example;


<<<<<<< HEAD
import org.example.utils.DatabaseDAO;
import org.example.utils.Parser;
import org.example.utils.ParserSecond;
import org.example.workWithDB.*;
=======
>>>>>>> 5b27bb34c65d26d50b4ffa40d5d45381905fc800

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

<<<<<<< HEAD
         ParserSecond parserSecond = new ParserSecond();
        VisibilitySecondDB visibilitySecondDB = new VisibilitySecondDB();
        List<String> listData = new ArrayList<>(parserSecond.parse("visible.txt"));
        visibilitySecondDB.completion(listData);
        visibilitySecondDB.report();
=======
>>>>>>> 5b27bb34c65d26d50b4ffa40d5d45381905fc800


    }
}
