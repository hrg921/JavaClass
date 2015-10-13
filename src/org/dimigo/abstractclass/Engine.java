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
 *   |_ Engine
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 27.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public abstract class Engine {

	private String type;
	
	public Engine(String type) {
		this.type = type;
	}
	
	// 추상메소드 선언 : startEngine(), stopEngine()

	public abstract void startEngine();
	public abstract void stopEngine();
	
	@Override
	public String toString() {
		return "Engine [type=" + type + "]";
	}
	
}
