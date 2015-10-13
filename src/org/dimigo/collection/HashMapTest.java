/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hangeonho on 15. 10. 1..
 */
public class HashMapTest {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("kor", 100);
        map.put("mat", 100);
        map.put("eng", 100);

        printMap(map);

        System.out.println(map.get("kor"));
        System.out.println(map.get("sci")); // 없는 key로 get하면 null이 나옴
        System.out.println("---------------------------------------------------");

        map.remove("mat");
        printMap(map);

        map.replace("kor", 95);
        printMap(map);

        map.put("kor", 100);
        printMap(map);

        map.put("java", 100);
        printMap(map);

        map.clear();
        printMap(map);
    }

    public static void printMap(Map<String, Integer> map) {
        for(String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("---------------------------------------------------");
    }
}
