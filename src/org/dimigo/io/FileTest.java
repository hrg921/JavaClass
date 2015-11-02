/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.io;

import java.io.*;

/**
 * Created by hangeonho on 15. 10. 26..
 */
public class FileTest {

    public static void main(String[] args) {
        File[] files = {
                new File("/Users/hangeonho/IdeaProjects/JavaLesson/JavaClass/files/output3.txt"),
                new File("/Users/hangeonho/IdeaProjects/JavaLesson/JavaClass/files/output4.txt")
        };

        try(BufferedWriter writer1 = new BufferedWriter(new FileWriter(files[0], false)); // 생략하면 false
            BufferedWriter writer2 = new BufferedWriter(new FileWriter(files[1], true));
            BufferedReader reader1 = new BufferedReader(new FileReader(files[0]));
            BufferedReader reader2 = new BufferedReader(new FileReader(files[1]))) { // true -> append 여부

            // 파일 쓰기
            writer1.write("첫번째 파일 ~~~");
            writer2.write("두번째 파일 !!!");

            writer1.flush();
            writer2.flush();
            // 파일 읽기
            String result;

            System.out.println("첫번째 파일 내용 -> ");
            while((result = reader1.readLine()) != null) {
                System.out.println(result);
            }

            System.out.println("두번째 파일 내용 -> ");
            while((result = reader2.readLine()) != null) {
                System.out.println(result);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
