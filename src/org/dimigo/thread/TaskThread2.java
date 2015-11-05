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
 * Created by hangeonho on 15. 11. 5..
 */
public class TaskThread2 implements Runnable{
    private String name;
    private int time;

    public TaskThread2(String name) {
        this.name = name;
        time = new Random().nextInt(10000);     // 0 ~ 9999
    }

    @Override
    public void run() {
        System.out.println(name + " start");
        System.out.println(name + "'s sleep time : " + time);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " end");
    }
}
