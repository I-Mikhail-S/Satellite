package org.example.utils;

import org.example.workWithDB.AllParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ParserSecond implements AllParser {

    public List<String> parse(String txt) {
        List<String> all = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(txt));
            String line = String.valueOf(br.readLine());
            Pattern pattern = Pattern.compile("(.*).23 (.*)"); //dd-MM-yy hh:mm:ss
            while (line != null){
                if (line.contains("\"point\"")) {
                    all.add(line.replaceAll("\\D", " ").replace(" ", ""));
                } else if (line.contains("\"sat\"")) {
                    all.add(String.valueOf(line.charAt(28)));
                } else if (pattern.matcher(line).find()) {
                    all.add(line.substring(14, 30).replace('.', '-'));
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return all;
    }

}
