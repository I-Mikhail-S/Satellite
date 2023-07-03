package org.example.utils;

import org.example.utils.MyCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
    private SimpleDateFormat format;
    private Calendar calendar;

    public Time(MyCalendar myCalendar) {
        this.format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS X");
        this.calendar = myCalendar.getCalendar();
        format.format(calendar.getTime());
    }

    public Calendar getCalendar() {
        return calendar;
    }

}
