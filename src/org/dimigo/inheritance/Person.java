/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.inheritance;

/**
 * Created by hangeonho on 15. 6. 25..
 *
 * @author hangeonho
 * @version 0.0.1
 * @name Person
 */

public class Person {
    /**
     * Fields
     *
     * -private-
     * String name
     * int age
     * int height
     * int weight
     */

    public String name;
    protected int age;
    int height;             // default 접근 제어자
    protected int weight;

    /**
     * 기본생성자
     */
    public Person() {}

    /**
     *
     * 매개변수 네개의 생성자
     * @param name
     * @param age
     * @param height
     * @param weight
     */
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    /**
     *
     */
    public void eat() {
        System.out.println(name + "이/가 밥을 먹는다.");
    }

    /**
     *
     */
    public void sleep() {
        System.out.println(name + "이/가 잠을 잔다.");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayBye() {
        System.out.println("Bye~");
    }

    /**
     *
     * @return
     */
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }
}
