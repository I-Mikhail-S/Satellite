package org.example.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ParserSecond {

    public List<String> parser(String txt) {
        List<String> all = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(txt));
            String line = String.valueOf(br.readLine());
            Pattern pattern = Pattern.compile("(.*).23 (.*)"); //dd-MM-yy hh:mm:ss
            while (line != null){
                if (line.contains("\"point\"")) {
                    if (line.charAt(15) == '\"') { // for example: {    "point": "0"} считываем номер РИ
                        all.add(String.valueOf(line.charAt(14)));
                    } else if (line.charAt(16) == '\"') {
                        all.add(String.valueOf(line.charAt(14) + line.charAt(15)));
                    } else {
                        all.add(String.valueOf(line.charAt(14) + line.charAt(15) + line.charAt(16)));
                    }
                } else if (line.contains("\"sat\"")) {
                    all.add(String.valueOf(line.charAt(29)));
                } else if (pattern.matcher(line).find()) {
                    all.add(line.substring(14, 30));
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return all;
    }
}
