/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.oop;

/**
 * Created by hangeonho on 15. 6. 19..
 */
public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person(18, "김병학", "AB형", "19981128");
        Person p2 = new Person(18, "김제곤", "A형", "19980320");

        // p1.toString() == p1
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(Person.TYPE);
    }
}
