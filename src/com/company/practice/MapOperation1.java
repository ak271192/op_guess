package com.company.practice;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapOperation1 {



    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        Collections.unmodifiableMap(map);
        map.put("b",2);
        System.out.println(map);



    }
}












