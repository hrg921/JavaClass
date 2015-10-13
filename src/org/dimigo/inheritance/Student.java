/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.inheritance;

/**
 * Created by hangeonho on 15. 6. 26..
 */
public class Student extends Person{
    private String studentId;

    public Student(String name, int age, int height, int weight, String studentId) {
        super(name, age, height, weight);
//        this.name = name;
//        this.age = age;
//        this.height = height;
//        this.weight = weight;
        this.studentId = studentId;
    }

    public void study() {
        System.out.println(getName() + "이/가 공부를 한다.");
    }

    public void eatSnack() {
        System.out.println(getName() + "이/가 간식을 먹는다.");
    }

    public String toString() {
//        return super.toString() + "Student{" +
//                "studentId='" + studentId + '\'' +
//                '}';
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(age).append(height).append(weight);

        return sb.toString();
    }
}
