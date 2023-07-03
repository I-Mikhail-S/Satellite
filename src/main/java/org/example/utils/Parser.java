package org.example.utils;



import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parser {
    //"for example: 2023-06-30 22:43:17 satellite 1-6"

    public static final int countSymbolsAll = 33;
    public static final int countSymbolsSputnik = 13;
    public static final int countSymbolsDateAndTime = 20;
    public static final int countSymbolsTime = 8;
    public static final int countSymbolsDate = 10;
    public static  int height = 99;



    public List<String> parse(String txt) throws IOException {
        List<String> all= new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(txt))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());

                if(line.isEmpty()!=true){
                    all.add(line.substring(0, countSymbolsAll));
                }
                line = br.readLine();
            }
        }
        return  all;
    }
}
