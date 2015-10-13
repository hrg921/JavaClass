/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.abstractclass;

/**
 * Created by hangeonho on 15. 8. 31..
 */
public class AnimalTest {

    public static void main(String[] args) {
        // Animal a = new Animal();
        Animal[] animals = {
                new Duck(),
                new Pig(),
                new Cow()
        };

        System.out.println("== 평온한 동물농장 ==");
        for(Animal animal : animals) {
            animal.eat();
        }

        System.out.println();

        System.out.println("== 늑대가 나타났다!! ==");
        for(Animal animal : animals) {
            animal.bark();
        }
    }
}
