package org.example.utils;

import com.mysql.cj.conf.ConnectionUrlParser;
import org.example.workWithDB.AllParser;

import java.io.*;
import java.util.*;

public class Parser implements AllParser {
    private List<String> date;
    private List<String> name;
    public static final int countSymbolsAll = 33;

    public Parser() {
        this.date = new ArrayList<>();
        this.name = new ArrayList<>();
    }

    public List<String> getDate() {
        return date;
    }

    public List<String> getName() {
        return name;
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
         for (int i = 0; i < all.size(); i++) {
             date.add(all.get(i).substring(0, 19));
             name.add(String.valueOf(all.get(i).charAt(32)));
        }
        return  all;
    }

}
