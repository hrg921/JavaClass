/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hangeonho on 15. 10. 12..
 */
public class ArrayListTest2 {

    public static void main(String[] args) {

        // ArrayList를 생성하고, 슈퍼맨, 배트맨, 스파이더맨 담기

        List<String> list = new ArrayList();

        list.add("슈퍼맨");
        list.add("배트맨");
        list.add("스파이더맨");

        // 리스트를 만드는 쉬운 방법

        List<String> list2 = Arrays.asList("슈퍼맨2", "배트맨2", "스파이더맨2");

        System.out.println(list);
        System.out.println(list2);

        // 리스트에 리스트를 더한다

        list.addAll(list2);
        System.out.println(list);

        // 컬렉션에 관한 유용한 유틸리티들
        // Collections에 담겨있다

        Collections.sort(list);
        System.out.println(list);

        // list -> array

        String[] strings = new String[list.size()];
        list.toArray(strings);

        for(String string: strings) {
            System.out.println(string);
        }

        // array -> list
        // array에 관한 유용한 메소드들은 Arrays에 담겨있다

        List<String> list3 = Arrays.asList(strings);
        System.out.println(list3);
    }

}
