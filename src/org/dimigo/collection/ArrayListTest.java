/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.collection;

import org.dimigo.oop.ParamArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hangeonho on 15. 9. 24..
 */
public class ArrayListTest {

    public static void main(String[] args) {
        // 제네릭(Generic) : List에 들어갈 데이터의 타입을 지정함
        List<String> list = new ArrayList<>();

        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");
        list.add("딸기");
//        list.add(10);           // new Integer(10)
//        list.add(3.14);

//        String obj = list.get(0);
        printList(list);

        list.add(1, "포도");

        printList(list);

        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
        System.out.println("------------------------------------------------");

        list.set(1, "바나나");
        printList(list);

        list.remove(0);
        printList(list);

        list.remove("딸기");
        printList(list);

        list.remove("키위");

        list.clear();
        printList(list);
    }

    public static void printList(List<String> list) {
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("------------------------------------------------");
    }

}
