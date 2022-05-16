package com.company.certification.test.tasks.util.manager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Duration {

    private static final Logger LOGGER = LogManager.getLogger(Duration.class.getName());

    public static String durationDay(String durationDay) {
        if(durationDay.equals("2 - 5 Days")) {
            durationDay = "1";
        }else if(durationDay.equals("6 - 9 Days")) {
            durationDay = "2";
        }else if(durationDay.equals("10+ Days")){
            durationDay = "3";
        }
        return durationDay;
    }

}
