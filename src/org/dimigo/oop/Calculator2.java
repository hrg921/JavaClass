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
public class Calculator2 {
    /* Instance Fields */
    private int num1;
    private int num2;
    private boolean power = false;

    /* Static Fields */
    public static double PI = 3.14;

    /* Constructor */
    public Calculator2() {}

    public Calculator2(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /* Instance Method*/
    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }

    private void checkPower() {
        if(!this.power)
            this.powerOn();
    }

    public void powerOn() {
        System.out.println("전원을 켭니다.");
        this.power = true;
    }

    public void powerOff() {
        System.out.println("전원을 끕니다.");
        this.power = false;
    }

    /* Static Method */

    public static int add (int num1, int num2) {
        //checkPower();
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        //checkPower();
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        //checkPower();
        return num1 * num2;
    }

    public static double div(int num1, int num2) {
        //checkPower();
        return (double)num1 / num2;
    }

    // Power가 자동으로 켜지도록 메소드 오버로딩
    public static int add (int num1, int num2, Calculator2 c) {
        c.checkPower();
        return num1 + num2;
    }

    public static double add (double num1, double num2, Calculator2 c) {
        c.checkPower();
        return num1 + num2;
    }

    public static int sub(int num1, int num2, Calculator2 c) {
        c.checkPower();
        return num1 - num2;
    }

    public static double sub (double num1, double num2, Calculator2 c) {
        c.checkPower();
        return num1 - num2;
    }

    public static int mul(int num1, int num2, Calculator2 c) {
        c.checkPower();
        return num1 * num2;
    }

    public static double mul (double num1, double num2, Calculator2 c) {
        c.checkPower();
        return num1 * num2;
    }

    public static double div(int num1, int num2, Calculator2 c) {
        c.checkPower();
        return (double)num1 / num2;
    }

    public static double div(double num1, double num2, Calculator2 c) {
        c.checkPower();
        return num1 / num2;
    }
}