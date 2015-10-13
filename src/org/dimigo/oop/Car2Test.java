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
public class Car2Test {
    public static void main(String[] args) {
        Car2.setCompany("현대");

        Car2[] cars = {
                new Car2("제네시스"),
                new Car2("아슬란"),
                new Car2("그랜저")
        };

        for(Car2 car : cars) {
            car.printCar();
        }
        System.out.println();

        Car2.setCompany("기아");

        for(Car2 car : cars) {
            car.printCar2();
        }
        System.out.println();

        Car2.setCompany("현대");

        for(Car2 car : cars) {
            Car2.printCar3(car);
        }
        System.out.println();

        for(Car2 car : cars) {
            Car2.printCar4(car);
        }
        System.out.println();

        System.out.println(Math.PI);
        System.out.println(Math.abs(-3.1234));
        System.out.println(Math.addExact(10, 20));
        System.out.println(Math.subtractExact(10, 20));
    }
}
