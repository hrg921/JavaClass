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
public class Calculator {
    /* Fields */
    private int num1;
    private int num2;
    private boolean power = false;

    public Calculator() {}

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

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

    public int add () {
        this.checkPower();
        return this.num1 + this.num2;
    }

    public int sub() {
        this.checkPower();
        return this.num1 - this.num2;
    }

    public int mul() {
        this.checkPower();
        return this.num1 * this.num2;
    }

    public double div() {
        this.checkPower();
        return (double)this.num1 / this.num2;
    }
}