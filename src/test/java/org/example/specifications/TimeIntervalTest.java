package org.example.specifications;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.example.utils.Time;

import java.text.ParseException;

public class TimeIntervalTest extends TestCase {

    public void testGetTimeIntervalSecond() throws ParseException {
        // взято из БД
        TimeInterval timeInterval = new TimeInterval(
                new Time("2023-07-03 00:17:16"),
                new Time("2023-07-03 00:19:28")
        );

        long expect = timeInterval.getTimeIntervalSecond();
        long actual = 132L; // считал вручную

        Assert.assertEquals(expect, actual);
    }

}