package org.example.utils;

import java.util.Calendar;

public class MyCalendar {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;
    private Calendar calendar = Calendar.getInstance();

    public MyCalendar(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.calendar.set(year, month, day, hour, minute, second);
    }

    public Calendar getCalendar() {
        return calendar;
    }

}
