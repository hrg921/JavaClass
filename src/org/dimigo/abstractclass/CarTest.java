/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ CarTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 27.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Car("벤츠", new BenzEngine("가솔린"));

		doAction(car);
		
		// 엔진 교체
		car.setEngine(new BMWEngine("디젤"));
		
		doAction(car);
	}

	private static void doAction(Car car) {
		System.out.println(car);
		car.start();
		car.stop();
		System.out.println();
	}
}
