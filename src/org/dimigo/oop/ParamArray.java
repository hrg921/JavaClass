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
public class ParamArray {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        ParamArray arr = new ParamArray();

        arr.plus(intArr);

        for(int value: intArr) {
            System.out.println(value);
        }

        String[] strArr = {"홍길동", "홍길서", "홍길남", "홍길북", "홍길중"};

        arr.changeLastName(strArr);

        for(String value: strArr) {
            System.out.println(value);
        }
    }

    private void plus(int[] arr) {
        for(int i=0 ; i < arr.length; i++) {
            // arr[i] = arr[i] + 1;
            arr[i]++;
        }
    }

    private void changeLastName(String[] arr) {
        // 성을 "김"으로 바꾸기
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = "김" + arr[i].substring(1);
        }
    }
}
