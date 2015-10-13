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
public class CommandLine {

    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("프로그램 사용법");
            System.out.println("java CommandLine arg1 arg2");
            System.exit(0);
        }

        System.out.println(Arrays.toString(args));

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        System.out.println(Arrays.toString(args));
    }
}