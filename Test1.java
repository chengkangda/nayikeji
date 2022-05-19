package com.java.test;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.next();
        String[] titleSplit = title.split(",");
        String year1 = titleSplit[1];
        String year2 = titleSplit[2];

        String firstString = scanner.next();
        String[] firstSplit = firstString.split(",");
        String first = firstSplit[0];
        String firstYear1Cases = firstSplit[1];
        String firstYear2Cases = firstSplit[2];

        String secondString = scanner.next();
        String[] secondSplit = secondString.split(",");
        String second = secondSplit[0];
        String secondYear1Cases = secondSplit[1];
        String secondYear2Cases = secondSplit[2];

        String thirdString = scanner.next();
        String[] thirdSplit = thirdString.split(",");
        String third = thirdSplit[0];
        String thirdYear1Cases = thirdSplit[1];
        String thirdYear2Cases = thirdSplit[2];

        Map<Object,Map<Object,Object>> map = new HashMap<>();
        Map<Object,Object> year1Map = new HashMap<>();
        Map<Object,Object> year2Map = new HashMap<>();

        year1Map.put(first,firstYear1Cases);
        year1Map.put(second,secondYear1Cases);
        year1Map.put(third,thirdYear1Cases);

        year2Map.put(first,firstYear2Cases);
        year2Map.put(second,secondYear2Cases);
        year2Map.put(third,thirdYear2Cases);

        map.put(year1,year1Map);
        map.put(year2,year2Map);

        System.out.println("-----------------输出-------------------");
        System.out.println(titleSplit[0] + ",year,cases");
        for(Map.Entry<Object, Map<Object, Object>> value:map.entrySet()){
            for(Map.Entry<Object, Object> entry:value.getValue().entrySet()){
                System.out.println(entry.getKey() + "," + value.getKey() + "," + entry.getValue());
            }
        }

    }
}
