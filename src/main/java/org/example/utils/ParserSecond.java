package org.example.utils;

import org.example.workWithDB.AllParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public class ParserSecond implements AllParser {
    public static final String txt = "visible.txt";

    public List<String> parse(String txt) {
        List<String> all = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(txt));
            String line = String.valueOf(br.readLine());
            Pattern pattern = Pattern.compile("(.*).23 (.*)"); //dd.MM(.23 )hh:mm:ss
            SimpleDateFormat oldDateFormat = new SimpleDateFormat("dd-MM-yy HH:mm:ss", Locale.getDefault());
            SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            while (line != null){
                if (line.contains("\"point\"")) {
                    all.add('!' + line.replaceAll("\\D", " ").replace(" ", ""));
                } else if (line.contains("\"sat\"")) {
                    all.add(String.valueOf(line.charAt(28)));
                } else if (pattern.matcher(line).find() && line.contains(",")) {
                    Date date = oldDateFormat.parse(line.substring(14, 30).replace('.', '-'));
                    String result = newDateFormat.format(date);
                    all.add(result + 's');
                }
                else if (pattern.matcher(line).find()) {
                    Date date = oldDateFormat.parse(line.substring(14, 30).replace('.', '-'));
                    String result = newDateFormat.format(date);
                    all.add(result);
                }
                line = br.readLine();
            }
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
        return all;
    }

}
