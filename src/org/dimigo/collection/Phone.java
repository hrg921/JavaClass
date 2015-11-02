/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ Phone
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 13.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Phone {
	private String type;
	private String number;
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone [type=" + type + ", number=" + number + "]";
	}
	
}
