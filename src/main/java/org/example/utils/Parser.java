package org.example.utils;

import com.mysql.cj.conf.ConnectionUrlParser;
import org.example.workWithDB.AllParser;

import java.io.*;
import java.util.*;

public class Parser implements AllParser {
    private List<String> date;
    private List<String> name;
    private Map<String,String> contain = new TreeMap<>();
    private String file;
    public static final int countSymbolsAll = 33;
    public static final int countSymbolsSputnik = 13;
    public static final int countSymbolsDateAndTime = 20;
    public static final int countSymbolsTime = 8;
    public static final int countSymbolsDate = 10;
    public static  int height = 99;

    public Parser(String file) {
        this.file = file;
    }

    public List<String> getDate() {
        return date;
    }

    public List<String> getName() {
        return name;
    }

    public Map<String, String> getContain() {
        return contain;
    }

    public List<String> parse(String file) {
        List<String> all= new ArrayList<>();
         try(BufferedReader br = new BufferedReader(new FileReader(file))) {
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
        } catch (IOException e) {
             e.printStackTrace();
         }
         for (int i = 0; i < 99; i++) {
             date.add(all.get(i).substring(0, 19));
             name.add(String.valueOf(all.get(i).charAt(32)));
         }
        return  all;
    }
/*
    public Map<String,String> date() {
        try {
            for (int i = 0; i < 99; i++) {
                date.add(parse().get(i).substring(0, 19));
                name.add(String.valueOf(parse().get(i).charAt(32)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       return contain;
    }*/

}
