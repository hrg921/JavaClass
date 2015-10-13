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
public class Person {
    private int age;
    private String name;

    /* final field*/
    private final String bloodType;
    private final String birthDt;
    // 필드 선언시 바로 초기화
    private final String type = "mammals";
    public static final String TYPE = "mammals"; // class 공유변수, 변경불가
    // 자바에서 상수는 static final로 만들 수 있다
    // 일반적으로 static final은 public으로 열어둔다
    // 대문자로 표기한다

    public Person(int age, String name, String bloodType, String birthDt) {
        this.age = age;
        this.name = name;
        this.bloodType = bloodType;
        this.birthDt = birthDt;
    }

    // 객체의 내용을 문자열로 만들어 리턴해주는 메소드
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", birthDt='" + birthDt + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
