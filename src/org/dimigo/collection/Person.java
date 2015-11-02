/**
 * 
 */
package org.dimigo.collection;

import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ Person
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 13.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Person {
	private String name;
	private int age;
	private String sido;
	private String dong;
	private String detailAddress;
	private List<Phone> phoneNumbers;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return the sido
	 */
	public String getSido() {
		return sido;
	}
	
	/**
	 * @param sido the sido to set
	 */
	public void setSido(String sido) {
		this.sido = sido;
	}
	
	/**
	 * @return the dong
	 */
	public String getDong() {
		return dong;
	}
	
	/**
	 * @param dong the dong to set
	 */
	public void setDong(String dong) {
		this.dong = dong;
	}
	
	/**
	 * @return the detailAddress
	 */
	public String getDetailAddress() {
		return detailAddress;
	}
	
	/**
	 * @param detailAddress the detailAddress to set
	 */
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	
	/**
	 * @return the phoneNumbers
	 */
	public List<Phone> getPhoneNumbers() {
		return phoneNumbers;
	}
	
	/**
	 * @param phoneNumbers the phoneNumbers to set
	 */
	public void setPhoneNumbers(List<Phone> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sido=" + sido
				+ ", dong=" + dong + ", detailAddress=" + detailAddress
				+ ", phoneNumbers=" + phoneNumbers + "]";
	}
	
}
