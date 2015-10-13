/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.interfaces;

/**
 * Created by hangeonho on 15. 9. 7..
 */
public interface IBicycle {

    // 상수 선언 ( public static final이 자동으로 붙음 )
    public static final int MIN_GEAR = 1;
    int MIN_SPEED = 0;

    // 추상 메소드 선언 ( public atstract이 자동으로 붙음 )
    public abstract void changeGear(int gear);

    public void speedUp(int speed);

    abstract void speedDown(int speed);
}
