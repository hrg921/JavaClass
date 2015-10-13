/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.exception;

/**
 * Created by hangeonho on 15. 9. 23..
 */
public class ThrowException2 {

    public static void main(String[] args) {
        try {
            methodA(null, 0);
        } catch (Exception e) {
            System.out.println("main catch절");
            e.printStackTrace();
        }
    }

    private static void methodA(String s, int i) throws Exception {
        methodB(s, i);
    }

    private static void methodB(String s, int i) throws Exception {
        try {
            if(s == null)
                throw new Exception("입력된 문자열이 없습니다.");

            if(i == 0)
                throw new Exception("0으로 나눌 수 없습니다.");
        } catch(Exception e) {
            System.out.println("methodB catch절");
            throw e;
        } finally {
            System.out.println("finally 절");
        }
    }
}
