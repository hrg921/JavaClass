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
public class SystemInOutStream {

    public static void main(String[] args) {

        try(PrintStream os = System.out;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // 표준 출력 스트림에 출력하기
            os.print("문자열을 입력하세요 => ");

            // 바이트 기반 표준 입력 스트림으로부터 입력받기
            int result;
//          while((result = is.read()) != '\n') {
//              System.out.println(result + " : " + (char)result);
//          }

            // 문자 처리를 위해 문자 기반 스트림으로 변환하기
//          while((result = reader.read()) != '\n') {
//              System.out.println(result + " : " + (char)result);
//          }

            // 라인 단위 읽기를 위해 BufferedReader 사용
            System.out.println(br.readLine());
        } catch(IOException e) {
            e.printStackTrace();
        }

    }

}
