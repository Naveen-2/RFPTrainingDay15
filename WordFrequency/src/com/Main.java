package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String str = "To be or not to be";
        Collections.addAll(list, str.split(" "));
        Map<String, Integer> map = new HashMap<>();

        for (String s : list) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        for(Map.Entry<String, Integer> each : map.entrySet()){

            System.out.println(each.getKey()+" occurs " + each.getValue() + " times");
        }
    }
}
