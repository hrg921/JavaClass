/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ SamchulyBicycle
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 29.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class SamchulyBicycle implements IBicycle{

	private int gear;
	private int speed;
	
	public static final int MAX_GEAR = 10;
	public static final int MAX_SPEED = 80;
	
	@Override
	public void changeGear(int gear) {
		// 삼천리 자전거 기능 구현
		if(gear < IBicycle.MIN_GEAR || gear > MAX_GEAR) {
			System.out.println("기어 값 오류");
			return;
		}
		this.gear = gear;
	}

	@Override
	public void speedUp(int speed) {
		// 삼천리 자전거 기능 구현
		int _speed = this.speed + speed;
		if(_speed > MAX_SPEED) {
			System.out.println("스피드 업 불가");
			return;
		}
		this.speed = _speed;
	}

	@Override
	public void speedDown(int speed) {
		// 삼천리 자전거 기능 구현
		int _speed = this.speed - speed;
		if(_speed < IBicycle.MIN_SPEED) {
			System.out.println("스피드 다운 불가");
			return;
		}
		this.speed = _speed;
	}

	@Override
	public String toString() {
		return "SamchulyBicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
}
