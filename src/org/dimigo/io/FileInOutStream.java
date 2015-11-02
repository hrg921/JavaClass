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
 * Created by hangeonho on 15. 10. 23..
 */
public class FileInOutStream {

    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("files/R750x0.png")) {
            OutputStream os = new FileOutputStream("files/copy.png");

            int result;

//            while((result = is.read()) != -1) {
//                os.write(result);
//            }

            byte[] buf = new byte[100];

            while((result = is.read(buf)) != -1) {
                os.write(buf, 0, result);
            }

            System.out.println("파일 생성 완료");

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
