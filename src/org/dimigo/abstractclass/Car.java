/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ Car
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 27.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Car {
	
	private String model;
	private Engine engine;

	public Car(String model, Engine engine) {
		this.model = model;
		this.engine = engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
        engine.startEngine();  
    }

    public void stop() {
        engine.stopEngine();  
    }

	@Override
	public String toString() {
		return "Car [model=" + model + ", engine=" + engine + "]";
	}
	
}
