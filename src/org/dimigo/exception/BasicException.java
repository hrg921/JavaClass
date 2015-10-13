/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by hangeonho on 15. 9. 17..
 */
public class BasicException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("첫번째 숫자 입력 => ");
            int n1 = scanner.nextInt();

            System.out.println("두번째 숫자 입력 => ");
            int n2 = scanner.nextInt();

            System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);

        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력하세요 !!");
            e.printStackTrace();
        } finally {
            System.out.println("finally 실행");
            if(scanner != null)
                scanner.close();
        }
    }

}
