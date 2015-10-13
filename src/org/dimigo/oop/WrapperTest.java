/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.oop;

/**
 * Created by hangeonho on 15. 6. 1..
 */
public class WrapperTest {

    public static void main(String[] args) {
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));

        Integer num1 = new Integer(1000);
        Integer num2 = new Integer(1000);

        if(num1 == num2) {
            System.out.println("같은 객체");
        } else {
            System.out.println("다른 객체");
        }

        if(num1.equals(num2)) {
            System.out.println("같은 값");
        } else {
            System.out.println("다른 값");
        }

        // Boxing (Primitive -> Reference)
        Integer obj1 = new Integer(1000);
        Double obj2 = new Double(3.14);

        // valueOf 메소드 사용
        Integer obj3 = Integer.valueOf(2000);
        Double obj4 = Double.valueOf(3.14);


        // Unboxing - xxxValue() 메소드 사용하기
        int i1 = obj1.intValue();
        double d1 = obj2.doubleValue();

        // 문자열을 기본 자료형으로 바꾸기 - parseXXX()
        int i2 = Integer.parseInt("100");
        double d2 = Double.parseDouble("3.14");

        Integer result = obj1 + obj3;
        System.out.println(result);

        /*
        * ********************************************************************
        * AutoBoxing, AutoUnboxing
        *
        * Integer obj1 = 1000;                          // AutoBoxing
        * -> Integer obj1 = new Integer(1000);
        *
        * int i = obj1 + 100;                           // AutoUnboxing
        * -> int i = obj1.intValue() + 100;
        *
        * Double obj2 = 3.14;                           // AutoBoxing
        * -> Double obj2 = new Double(3.14);
        *
        * double d = obj2;                              // AutoUnboxing
        * -> double d = obj2.doubleValue();
        *
        * ********************************************************************/

    }
}