/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.exception;

/**
 * Created by hangeonho on 15. 9. 17..
 */
public class NumberException {

    public static void main(String[] args) {

        try {
            String str = "123";
            int i = Integer.parseInt(str);

            str = null;
            System.out.println(str.length());
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식이 아닙니다.");
        } catch (Exception e) {
            System.out.println("에러가 발생했습니다.");
            e.printStackTrace();
        }
    }
}
