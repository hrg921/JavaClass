/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ BicycleTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 29.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class BicycleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IBicycle bicycle = new SamchulyBicycle();		
		runBicycle(bicycle, 3, 30, 10);
		
		// 자전거 교체
		bicycle = new AltonBicycle();
		runBicycle(bicycle, 5, 40, 20);
	}

	private static void runBicycle(IBicycle bicycle, int gear, int upSpeed, int downSpeed) {
		bicycle.speedUp(upSpeed);
		bicycle.changeGear(gear);			
		System.out.println(bicycle);

		bicycle.speedDown(downSpeed);
		System.out.println(bicycle);
		System.out.println();
	}
}
