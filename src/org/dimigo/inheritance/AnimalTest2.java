/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.inheritance;

/**
 * Created by hangeonho on 15. 8. 27..
 */
public class AnimalTest2 {

    public static void main(String[] args) {

        Animal a = new Cat("야옹이");
//      a.dig();      // 컴파일 시에는 타입 기준으로 체크한다!!!

        a.bark();       // 오버라이딩한 경우에는 오버라이딩된 메소드가 실행된다!!!

        // 실제 생성한 객체 타입으로 형변환해보자!!
        Cat c = (Cat)a;
        c.dig();

        ((Cat)a).dig();

//      Dog d = (Dog)a;

        // instanceof 연산자
        Animal a1 = new Dog("멍멍이");
        Animal a2 = new Cat("야옹이");

        System.out.println(a1 instanceof Dog);
        System.out.println(a2 instanceof Cat);
        System.out.println(a1 instanceof Cat);
        System.out.println(a2 instanceof Dog);
        System.out.println(a1 instanceof Animal);
        System.out.println(a2 instanceof Animal);
    }

}
