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
public class FileReaderWriter {

    public static void main(String[] args) {
        try(Reader reader = new FileReader("files/input.txt");
            Writer writer = new FileWriter("files/output.txt")) {

            char[] buf = new char[100];
            int result;

            while((result = reader.read(buf)) != -1) {
                writer.write(buf, 0, result);
            }

            writer.write("\n요것도 출력되겠지롱!!!");

            System.out.println("파일 생성 완료!!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
