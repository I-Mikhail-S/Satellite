package org.example.utils;

import com.mysql.cj.conf.ConnectionUrlParser;
import org.example.workWithDB.AllParser;

import java.io.*;
import java.util.*;

public class Parser implements AllParser {
    private List<String> dateStart = new ArrayList<>();
    private List<String> dateEnd = new ArrayList<>();
    private List<String> name = new ArrayList<>();
    public static final int countSymbolsAll = 33;
    public List<String> getName() {
        return name;
    }

    public List<String> getDateStart() {
        return dateStart;
    }

    public List<String> getDateEnd() {
        return dateEnd;
    }

    @Override
    public List<String> parse(String file) {
        List<String> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int count = 1;
            while (line != null) {
                if (count % 2 != 0 && line.isEmpty() != true) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    all.add(line.substring(0, countSymbolsAll));
                    line = br.readLine();
                } else {
                    line = br.readLine();
                }
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < all.size(); i++) {
            if(i%2!=0){
                dateStart.add(all.get(i).substring(0, 19));
            }
            else{
                dateEnd.add(all.get(i).substring(0, 19));
            }
            name.add(String.valueOf(all.get(i).charAt(32)));
        }
        return all;
    }
}

