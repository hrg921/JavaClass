/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.inheritance;

/**
 * Created by hangeonho on 15. 8. 31..
 */
public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car("BMW", 2000, new Tire(200, 300));
        Car car2 = new Car("람보르기니", 3000, new Tire(230, 400));

        System.out.println(car1);
        car1.start();
        car1.stop();

        System.out.println(car2);
        car2.start();
        car2.stop();

        // 타이어 교체
        Tire newTire = new Tire(240, 500);
        car2.setTire(newTire);

        System.out.println(car2);
    }
}
