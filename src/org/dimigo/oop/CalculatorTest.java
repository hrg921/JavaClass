/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.oop;

/**
 * Created by hangeonho on 15. 6. 8..
 */
public class CalculatorTest {

    public static void main(String[] args) {
        Calculator c1 = new Calculator(10, 20);

        System.out.println("<< 실행결과 >>\n");

        System.out.println(c1.getNum1() + " + " + c1.getNum2() + " = " + c1.add());
        System.out.println(c1.getNum1() + " - " + c1.getNum2() + " = " + c1.sub());
        System.out.println(c1.getNum1() + " * " + c1.getNum2() + " = " + c1.mul());
        System.out.println(c1.getNum1() + " / " + c1.getNum2() + " = " + c1.div());
        c1.powerOff();
    }
}
