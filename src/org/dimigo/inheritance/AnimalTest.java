/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.inheritance;

/**
 * Created by hangeonho on 15. 8. 17..
 */
public class AnimalTest {
    public static void main(String[] args) {
        Dog d = new Dog("멍멍이");
        System.out.println(d.toString());
        d.bark();

        Cat c = new Cat("야옹이");
        System.out.println(c.toString());
        c.bark();

        Tiger t = new Tiger("호돌이");
        System.out.println(t.toString());
        t.bark();

        // Object 클래스의 메소드 호출
        System.out.println(d.equals(new Dog("ㅁㅇㄹ")));

        System.out.println("-----------------------------------");

        Animal[] animals = new Animal[] {
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("호돌이")
        };

        for(Animal member : animals) {
            doBark(member);
        }

        System.out.println("-----------------------------------");

        // 객체간 교체가 가능하다 (인터페이스에서 다룰 내용)
        Animal a = new Dog("멍멍이");
        a = new Cat("야옹이");
    }

    private static void doBark(Animal a) {
        System.out.println(a);
        a.bark();
    }
}
