/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.oop;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by hangeonho on 15. 6. 18..
 */
public class StaticBlockTest {
    private static String date = ""; // "" == NULL String

    static {
        System.out.println("static block started");

        /* Calendar c = Calendar.getInstance();

        date += c.get(Calendar.YEAR);
        date += (c.get(Calendar.MONTH) + 1);
        date += c.get(Calendar.DATE); */

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        date = sdf.format(new Date());
    }

    public static void main(String[] args) {
        System.out.println(date);
    }
}
