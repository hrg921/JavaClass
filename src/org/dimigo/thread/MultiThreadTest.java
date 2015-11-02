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
public class MultiThreadTest {

    public static void main(String[] args) {
        System.out.println("main thread start");

        Thread[] threads = new Thread[100];
        for(int i = 0; i < threads.length ; i++) {
//            threads[i] = new TaskThread(i + "");
//            익명 클래스 방식
//
            threads[i] = new Thread() {
                String name = new Random().nextInt(10000) + "";
                int time = new Random().nextInt(10000);

                @Override
                public void run() {
                    super.run();
                    System.out.println(name + " start");
                    System.out.println(name + "'s sleep time : " + time);
                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name + " end");
                }
            };
        }

        // single thread 방식
//        for(Thread thread : threads) {
//            thread.run();
//        }

        for(Thread thread : threads) {
            thread.start();
        }

        System.out.println("main thread end");
    }

}
