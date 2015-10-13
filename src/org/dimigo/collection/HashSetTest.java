/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hangeonho on 15. 10. 12..
 */
public class HashSetTest {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("사과");
        set.add("수박");
        set.add("배");
        set.add("사과");

        printSet(set);

    }

    private static void printSet(Set<String> set) {
        for(String value : set) {
            System.out.println(value);
        }
    }

}
