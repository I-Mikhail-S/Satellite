package org.example.specifications;

import org.example.utils.Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeInterval{
    private Time start;
    private Time finish;

    public TimeInterval(Time start, Time finish) {
        this.start = start;
        this.finish = finish;
    }

    public long getTimeIntervalSecond() {
        LocalDateTime dateTime1= LocalDateTime.parse(start.getStringTime(), DateTimeFormatter.ofPattern(Time.patternString));
        LocalDateTime dateTime2= LocalDateTime.parse(finish.getStringTime(), DateTimeFormatter.ofPattern(Time.patternString));
        return java.time.Duration.between(dateTime1, dateTime2).getSeconds();
    }

    public Time getStart() {
        return start;
    }

    public Time getFinish() {
        return finish;
    }


}
