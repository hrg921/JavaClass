/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.inheritance;
import static java.lang.System.out;

/**
 * Created by hangeonho on 15. 6. 26..
 */
public class PersonTest {

    public static void main(String[] args) {
        Person p = new Person("아이유", 23, 162, 44);

        p.eat();
        p.sleep();
        System.out.println();
        out.println();

        Student s = new Student("김제곤", 18, 189, 65, "2606");

        s.eat();
        s.study();
        s.sleep();
        s.eatSnack();
        System.out.println();

        Teacher t = new Teacher("양재덕", 35, 176, 72, "영어");

        t.eat();
        t.teach();
        t.doTask();
        t.sleep();
        System.out.println();

        System.out.println(p);
        System.out.println(s);
        System.out.println(t);

        System.out.println();

        Korean k = new Korean();
        Chinese c = new Chinese();
        Japanese j = new Japanese();

        k.sayHello();
        k.sayBye();

        c.sayHello();
        c.sayBye();

        j.sayHello();
        j.sayBye();

        System.out.println("---------------------------------------");

        Person[] persons = {
                new Korean(),
                new Chinese(),
                new Japanese()
        };

        for(Person person : persons) {
            greeting(person);
        }
    }

    private static void greeting(Person p) {
        p.sayHello();
        p.sayBye();
    }
}
