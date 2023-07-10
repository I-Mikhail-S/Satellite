package org.example.utils;

import org.example.utils.MyCalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {
    private SimpleDateFormat format;
    //private Calendar calendar;
    private String stringTime;
    public static final String patternString = "yyyy-MM-dd HH:mm:ss";

/*    public Time(MyCalendar myCalendar) {
        this.format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS X");
        this.calendar = myCalendar.getCalendar();
        format.format(calendar.getTime());
    }*/

    public Time(String stringDate) throws ParseException {
        this.format = new SimpleDateFormat(patternString);
        DateFormat dateFormat = new SimpleDateFormat(patternString);
        Date date = dateFormat.parse(stringDate);
        this.stringTime = format.format(date);
    }

    public String getStringTime() {
        return stringTime;
    }

    public SimpleDateFormat getFormat() {
        return format;
    }
}
