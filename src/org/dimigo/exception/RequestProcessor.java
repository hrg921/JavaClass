/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.exception;

import org.dimigo.interfaces.Action;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by hangeonho on 15. 9. 3..
 */
public class RequestProcessor {

    public static void main(String[] args) {

        try {
            RequestProcessor p = new RequestProcessor();
            InputStream is = p.getClass().getResourceAsStream("map.properties");

            if (is == null) {
                System.out.println("file load 실패");
            } else {
                Properties prop = new Properties();
                prop.load(is);
                String actionName = prop.getProperty("delete");

                if (actionName == null) {
                    System.out.println("등록된 action 정보가 없습니다.");
                    return;
                }
                // 클래스로부터 객체를 생성해서 호출
                Class cls = Class.forName(actionName);
                Action action = (Action) cls.newInstance();
                action.execute();
            }
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//            return;
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//            return;
//        } catch(IOException e){
//            e.printStackTrace();
//            return;
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            return;
//        }
        } catch (Exception e) {
            if(e instanceof InstantiationException) {
                System.out.println("InstantiationException!!");
            } else if (e instanceof IllegalAccessException) {
                System.out.println("IllegalAccessException!!");
            } else if (e instanceof  IOException) {
                System.out.println("IOException");
            } else if (e instanceof ClassCastException) {
                System.out.println("ClassCastException");
            }
        }
    }
}

