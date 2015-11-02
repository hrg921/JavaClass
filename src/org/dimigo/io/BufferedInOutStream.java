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
public class BufferedInOutStream {

    public static void main(String[] args) {

        try(InputStream is = new FileInputStream("/Users/hangeonho/IdeaProjects/JavaLesson/JavaClass/files/R750x0.png");
            OutputStream os = new FileOutputStream("/Users/hangeonho/IdeaProjects/JavaLesson/JavaClass/files/R750x0_copy.png");
            BufferedInputStream bis = new BufferedInputStream(is);
            BufferedOutputStream bos = new BufferedOutputStream(os);) {

            int result;

            long start = System.currentTimeMillis();

            while((result = bis.read()) != -1) {
                bos.write(result);
            }

            long end = System.currentTimeMillis();

            System.out.println("실행 속도 : " + (end-start));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
