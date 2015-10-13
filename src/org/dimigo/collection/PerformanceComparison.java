/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hangeonho on 15. 10. 12..
 */
public class PerformanceComparison {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        /********************************************/

        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 500000; i++) {
            arrayList.add(0, i + "");
        }

        long endTime1 = System.currentTimeMillis();

        System.out.println("ArryaList 걸린 시간 : " + (endTime1 - startTime1));

        /********************************************/

        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < 500000; i++) {
            linkedList.add(0, i + "");
        }

        long endTime2 = System.currentTimeMillis();

        System.out.println("LinkedList 걸린 시간 : " + (endTime2 - startTime2));
    }

}
