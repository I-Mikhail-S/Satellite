package org.example.utils;

import org.example.workWithDB.AllParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser implements AllParser {
    private static final List<String> dateStart = new ArrayList<>();
    private static final List<String> dateEnd = new ArrayList<>();
    private static final List<String> name = new ArrayList<>();
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
    public List<String> parser(String txt) {
        List<String> all = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(txt));
            String line = String.valueOf(br.readLine());
            for (int i = 0; line != null; i++) {
                if (i % 2 == 0) {
                    all.add(line.substring(0, countSymbolsAll));
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        getInformationForParser(all);
        return all;
    }

    public void getInformationForParser(List<String> all) {
        for (int i = 0; i < all.size(); i++) {
            if (i % 2 == 0) {
                name.add(String.valueOf(all.get(i).charAt(32)));
                dateStart.add(all.get(i).substring(0, 19));
            } else
                dateEnd.add(all.get(i).substring(0, 19));
        }
    }

}

