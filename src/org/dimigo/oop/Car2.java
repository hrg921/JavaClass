/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.oop;

/**
 * Created by hangeonho on 15. 6. 12..
 */
public class Car2 {

    /* Instance Field */
    private String name;

    /* Static Field */
    private static String company;

    public Car2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Car2.company = company;
    }

    // 1. 인스턴스 메소드에서 인스턴스 필드와 스태틱 필드 호출하기
    public void printCar() {
        System.out.println(name + ", " + company); // this.company도 가능하나 권장하지 않는다
        System.out.println(this.name + ", " + Car2.company);
    }

     // 2. 인스턴스 메소드에서 인스턴스 메소드와 스태틱 메소드 호출하기
    public void printCar2() {
        System.out.println(getName() + ", " + getCompany());
        System.out.println(this.getName() + ", " + Car2.getCompany());
    }

    // 3. 스태틱 메소드에서 인스턴스 필드와 스태틱 필드 호출하기
    public static void printCar3(Car2 car) {
        System.out.println(car.name + ", " + company);
    }

    // 4. 스태틱 메소드에서 인스턴스 메소드와 스태틱 메소드 호출하기
    public static void printCar4(Car2 car) {
        System.out.println(car.getName() + ", " + getCompany());
    }
}
