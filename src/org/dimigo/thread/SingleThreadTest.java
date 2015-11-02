/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.thread;

import java.util.Random;

/**
 * Created by hangeonho on 15. 11. 2..
 */
public class SingleThreadTest {

    public static void main(String[] args) {
        System.out.println("main thread start");

        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getId());
        System.out.println(t.isAlive());
        System.out.println(t);

        // 특정 시간동안 실행을 중지시킴
        // 실행 상태 -> 실행 대기 상태로 빠지기
        int time = new Random().nextInt(10000);
        System.out.println("first sleep time : " + time);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 특정 시간동안 실행을 중지시킴
        // 실행 상태 -> 실행 대기 상태로 빠지기
        time = new Random().nextInt(10000);
        System.out.println("second sleep time : " + time);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
