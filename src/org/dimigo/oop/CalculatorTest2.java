/*
 * Copyright (c) num215. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.oop;

/**
 * Created by hangeonho on 15. 6. 8..
 */
public class CalculatorTest2 {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        Calculator2 calc = new Calculator2();

        System.out.println("<< 실행결과 >>\n");

        System.out.println(num1 + " + " + num2 + " = " + Calculator2.add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + Calculator2.sub(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + Calculator2.mul(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + Calculator2.div(num1, num2));

        System.out.println();
        System.out.println();

        // static 메소드 호출 시 ref 변수명.메소드명 으로 호출해도 되지만
        // 올바른 방법은 아님 -> 클래스명.메소드명

        System.out.println("<< 실행결과 >>\n");

        System.out.println(calc.add(num1, num2));

        calc.powerOff();

        // power를 켜지 않고 연산했을 시 자동으로 켜지게

        System.out.println(calc.add(num1, num2, calc));
        System.out.println(calc.sub(num1, num2, calc));
        System.out.println(calc.mul(num1, num2, calc));
        System.out.println(calc.div(num1, num2, calc));

        double d1 = 1.2, d2 = 3.4;

        System.out.println(calc.add(d1, d2, calc));
        System.out.println(calc.sub(d1, d2, calc));
        System.out.println(calc.mul(d1, d2, calc));
        System.out.println(calc.div(d1, d2, calc));
    }
}
