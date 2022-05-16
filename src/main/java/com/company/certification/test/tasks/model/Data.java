package com.company.certification.test.tasks.model;

import java.util.List;
import java.util.Map;

public class Data {

    private static Map<String, Object> map;

    private Data() { }

    public static Map<String, Object> getMap() {
        return map;
    }

    public static void setMap(Map<String, Object> dataTest) {
        map = dataTest;
    }

    public static String obtain(String dataObtain) {
        return (String) getMap().get(dataObtain);
    }

    public static List<Map<String, Object>> obtainList(String dataObtain) {
        return  (List<Map<String, Object>>) getMap().get(dataObtain);
    }

}