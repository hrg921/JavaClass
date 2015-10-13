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
public class Tire {

    private int size;       // 타이어 규격
    private int maxSpeed;   // 최대 속도

    public Tire(int size, int maxSpeed) {
        super();
        this.size = size;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "size=" + size +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
