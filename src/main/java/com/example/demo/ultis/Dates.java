package com.example.demo.ultis;

import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.DateTime;

import java.util.Date;

public class Dates extends DateUtils {

    public static Date plusSeconds(int seconds) {
        DateTime now = new DateTime();
        return now.plusSeconds(seconds).toDate();
    }
}
