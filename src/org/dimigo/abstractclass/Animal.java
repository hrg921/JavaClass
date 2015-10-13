/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.abstractclass;

/**
 * Created by hangeonho on 15. 8. 17..
 */
public abstract class Animal {
    // 나는 추상 클래스다.
    // 나 자신은 객체 생성을 할 수 없다.
    // 반드시 나를 상속받아서 자식객체를 생성해서 써라.

    private String name;

    public Animal() { }

    public Animal(String name) {
        this.name = name;
    }

    /*
    *
    * 자식 생성자에서 쓸 수 있으므로 만들어 둔다. 삭제 X
    *
    * */

    public void eat() {
        System.out.println("냠냠");
    }

    public void sleep() {
        System.out.println("쿨쿨");
    }

    // abstract method delcaration
    // no DESC
    // child class must override this method
    public abstract void bark();

    // Method overriding
    @Override
    public String toString() {
        return "제 이름은 " + name + "입니다.";
    }
}
