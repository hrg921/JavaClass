/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.oop;

/**
 * Created by hangeonho on 15. 5. 28..
 */
public class MultiArray2 {

    public static void main(String args[]) {
        // 이차원 배열 생성시 초기화하기
        // 1. 중괄호만 두번 이용
        int [][] intArr = {
                {1, 2, 3, 4},
                {5, 6}
        };

        // 초기화된 값 출력해보기
        for (int []arr: intArr) {
            for(int value: arr) {
                System.out.print(value + " | ");
            }
            System.out.println();
        }

        // 2. 중괄호 + new 연산자 이용
        int [][] intArr2 = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7}
        };

        for(int i=0 ; i < intArr2.length ; i++) {
            for(int j=0; j < intArr2[i].length ; j++) {
                System.out.print(intArr2[i][j] + " | ");
            }
            System.out.println();
        }

        // 3. new 연산자 + 중괄호 이용
        int [][] intArr3 = new int[][] {
                new int[]{1, 2, 3, 4},
                new int[]{5, 6}
        };

        for(int[] arr: intArr3) {
            for (int value : arr) {
                System.out.print(value + " | ");
            }
            System.out.println();
        }

        // 4. new 연산자 + new 연산자 이용
        int[][] intArr4 = {
                new int[]{1, 2, 3, 4},
                new int[]{5, 6}
        };

        for(int[] arr: intArr4) {
            for (int value : arr) {
                System.out.print(value + " | ");
            }
            System.out.println();
        }
    }
}
