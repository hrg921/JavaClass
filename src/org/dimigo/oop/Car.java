/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Car
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 6.
 * </pre>
 *
 * @author hangeonho
 * @version 1.0.0
 * 
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public void forward() {
		System.out.println("전진합니다!!");
	}
	
	public void backward() {
		System.out.println("후진합니다!!");
	}
	
	public boolean stop() {
		System.out.println("정지합니다!!");
		return true;
	}
	
	public void turnLeft(int angle) {
		System.out.println(angle + "만큼 좌회전합니다!!");
	}
	
	public void turnRight(int angle) {
		System.out.println(angle + "만큼 우회전입니다!!");
	}
}
