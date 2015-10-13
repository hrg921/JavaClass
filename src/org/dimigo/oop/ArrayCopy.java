/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.oop;

/**
 * Created by hangeonho on 15. 5. 29..
 */
public class ArrayCopy {

    public static void main(String[] args) {
        int[] intSrc = {1, 2, 3, 4, 5};
        int[] intDest = new int[10];

//        // intSrc -> intDest 에 복사해보자
//        for(int i = 0; i < intSrc.length ; i++) {
//            intDest[i] = intSrc[i];
//        }
//
//        for(int value: intDest) {
//            System.out.println(value);
//        }

        System.arraycopy(intSrc, 0, intDest, 3, intSrc.length);

        for(int value: intDest) {
            System.out.println(value);
        }

        String[] strSrc = {"진세연", "아이유", "공승연", "손승연"};
        String[] strDest = new String[10];

        // strSrc -> strDest

        System.arraycopy(strSrc, 0, strDest, 0, strSrc.length);

        for(String value: strDest) {
            System.out.println(value);
        }
    }
}
