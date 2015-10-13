/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.oop;

/**
 * Created by hangeonho on 15. 6. 18..
 */
public final class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() { }

    // Thread safe 함
    // 필요한 시점에 메소드를 호출해서 객체를 생성하는 방식
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance2() {
        return instance;
    }
}