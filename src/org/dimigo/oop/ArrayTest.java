/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.oop;

import java.util.Arrays;

/**
 * Created by hangeonho on 15. 6. 1..
 */
public class ArrayTest {

    public static void main(String[] args) {
        String[] src = {"카이", "타오", "수호", "루한", "세훈"};

        // 배열 복사
        String[] dest = Arrays.copyOf(src, src.length);

        // 배열 출력
        System.out.println(Arrays.toString(dest));

        // 배열 비교
        System.out.println(Arrays.equals(src, dest));

        // 배열 정렬
        Arrays.sort(dest);

        System.out.println(Arrays.toString(dest));

        // 배열요소 검색
        System.out.println(Arrays.binarySearch(dest, "정성민"));

        int[][] intArr1 = {
                new int[]{1, 2, 3},
                new int[]{4, 5},
                new int[]{6, 7, 8, 9}
        };

        int[][] intArr2 = {
                {9, 8, 7},
                {6, 5},
                {4, 3, 2, 1}
        };

        printArr(intArr1);
        printArr(intArr2);
    }

    private static void printArr(int[][] Arr) {
        for(int[] arr: Arr) {
            for(int value: arr) {
                System.out.print(value + " | ");
            }
            System.out.println();
        }
    }
}