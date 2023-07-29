package org.example.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    private SimpleDateFormat format;
    private String stringTime;
    private Date date;
    public static final String patternString = "yyyy-MM-dd HH:mm:ss";

    public Time(String stringDate) throws ParseException {
        this.format = new SimpleDateFormat(patternString);
        DateFormat dateFormat = new SimpleDateFormat(patternString);
        this.date = dateFormat.parse(stringDate);
        this.stringTime = format.format(date);
    }
    public SimpleDateFormat getFormat() {
        return format;
    }

    public String getStringTime() {
        return stringTime;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return " {'" + stringTime + "'}";
    }
}
