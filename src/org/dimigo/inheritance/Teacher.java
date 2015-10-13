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
public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, int height, int weight, String subject) {
        super(name, age, height, weight);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(getName() + "쌤이 공부를 가르친다.");
    }

    public void doTask() {
        System.out.println(getName() + "쌤이 업무를 본다.");
    }

    public String toString() {
        return super.toString() + "Teacher{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
