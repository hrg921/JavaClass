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
public class Engine {

    private int engineCapacity;     // 배기량

    public Engine(int engineCapacity) {
        super();
        this.engineCapacity = engineCapacity;
    }

    public void startEngine() {
        System.out.println("엔진을 켭니다.");
    }

    public void stopEngine() {
        System.out.println("엔진을 끕니다.");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineCapacity=" + engineCapacity +
                '}';
    }
}
