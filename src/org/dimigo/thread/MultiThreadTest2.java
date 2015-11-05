package org.dimigo.thread;

import java.util.Random;

/**
 * Created by hangeonho on 15. 11. 5..
 */
public class MultiThreadTest2 {

    public static void main(String[] args) {

        System.out.println("main thread start");

        Thread t1 = new Thread(new TaskThread("one"));
        Thread t2 = new Thread(new TaskThread("two"));

        // 익명클래스 : 이름이 없는 클래스
        // 한번 쓰고 버리는 일회용 클래스

        Thread t3 = new Thread(new Runnable() {
            String name = "three";
            int time = new Random().nextInt(10000);
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
        });

        t1.start();
        t2.start();
        t3.start();
    }

}
