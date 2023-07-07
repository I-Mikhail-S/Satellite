package org.example;

import com.mysql.cj.xdevapi.JsonParser;
import org.example.entities.Satellite;
import org.example.utils.DatabaseDAO;
import org.example.utils.Parser;
import org.example.utils.ParserSecond;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, ParseException {
        //DatabaseDAO databaseDAO = new DatabaseDAO();
        ParserSecond parserSecond = new ParserSecond();
        List<String> dadaInFile = parserSecond.parser("visible.txt"); // size = 944556
        for (String helpVariable : dadaInFile) {
            System.out.println(helpVariable);
        }

    }
}