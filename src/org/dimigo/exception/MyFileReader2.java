/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by hangeonho on 15. 9. 21..
 */
public class MyFileReader2 {

    public static void main(String[] args) {

        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader("/Users/hangeonho/IdeaProjects/JavaClass/src/org/dimigo/exception/input.txt"))) {

            while(true) {
                String line = br.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
            e.printStackTrace();
        }

        // try - catch - resources 구문
        // JAVA 7 에 도입

    }
}
