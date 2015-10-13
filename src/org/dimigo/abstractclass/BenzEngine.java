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
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ BenzEngine
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 27.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class BenzEngine extends Engine {

	public BenzEngine(String type) {
		super(type);
	}
	
	// 메소드 오버라이딩 : startEngine(), stopEngine()

	@Override
	public void startEngine() {
		System.out.println("Benz Engine start");
	}

	@Override
	public void stopEngine() {
		System.out.println("Benz Engine stop");
	}
}
