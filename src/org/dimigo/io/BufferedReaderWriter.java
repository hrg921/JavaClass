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
public class BufferedReaderWriter {

    public static void main(String[] args) {
        try(Reader reader = new FileReader("/Users/hangeonho/IdeaProjects/JavaLesson/JavaClass/files/input.txt");
            Writer writer = new FileWriter("/Users/hangeonho/IdeaProjects/JavaLesson/JavaClass/files/output.txt");) {

            int result;

            long start = System.currentTimeMillis();

            while((result = reader.read()) != -1) {
                writer.write(result);
            }

            long end = System.currentTimeMillis();

            System.out.println("실행 속도 : " + (end-start));
        } catch(Exception e) {
            e.printStackTrace();
        }

        try(Reader reader = new FileReader("/Users/hangeonho/IdeaProjects/JavaLesson/JavaClass/files/input.txt");
            Writer writer = new FileWriter("/Users/hangeonho/IdeaProjects/JavaLesson/JavaClass/files/output.txt");
            BufferedReader br = new BufferedReader(reader);
            BufferedWriter bw = new BufferedWriter(writer)) {

            int result;

            long start = System.currentTimeMillis();

            while((result = br.read()) != -1) {
                bw.write(result);
            }

            long end = System.currentTimeMillis();

            System.out.println("실행 속도 : " + (end-start));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
