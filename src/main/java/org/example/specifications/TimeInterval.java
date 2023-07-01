package org.example.specifications;

import java.util.Calendar;

public class TimeInterval{
    private Time start;
    private Time finish;

    public TimeInterval(Time start, Time finish) {
        this.start = start;
        this.finish = finish;
    }

    public Time getStart() {
        return start;
    }

    public Time getFinish() {
        return finish;
    }


}
