/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.inheritance;

/**
 * Created by hangeonho on 15. 8. 31..
 */
public class Car {
    private String model;

    // Has - a 관계 ( 전체와 부분과의 관계 )
    private Engine engine;
    private Tire tire;

    public Car(String model, int engineCapacity, Tire tire) {
        super();
        this.model = model;
        // Car 객체가 생성될 때 Engine 객체도 같이 생성 (lifecycle을 같이 함)
        this.engine = new Engine(engineCapacity);
        // Tire 객체는 Car 객체와 무관하게 생성함
        this.tire = tire;
    }

    public void start() {
        System.out.println(model + " 시동을 걸다.");
        if(engine != null) engine.startEngine();
    }

    public void stop() {
        System.out.println(model + " 시동을 끄다.");
        if(engine != null) engine.startEngine();
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", tire=" + tire +
                '}';
    }
}
