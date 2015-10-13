/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Student
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 17.
 * </pre>
 *
 * @author hangeonho
 * @version 1.0.0
 * 
 */
public class Student {
	int gisu;						// 기수
	int grade;					// 학년
	int ban;						// 반
	int number;				// 번
	String name;				// 이름
	String address;			// 주소
	String phone;			// 휴대폰번호
	
	/**
	 * @param gisu
	 * @param grade
	 * @param ban
	 * @param number
	 * @param name
	 * @param address
	 * @param phone
	 */
	public Student(int gisu, int grade, int ban, int number, String name,
			String address, String phone) {
		this.gisu = gisu;
		this.grade = grade;
		this.ban = ban;
		this.number = number;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public Student(int gisu, int grade, int ban, int number, String name, String address) {
		this(gisu, grade, ban, number, name, address, "휴대폰없음");
	}
	
	public Student(int gisu, int grade, int ban, int number, String name) {
		this(gisu, grade, ban, number, name, "주소없음");
	}
	
	public Student(int gisu, int grade, int ban, int number) {
		this(gisu, grade, ban, number, "이름없음");
	}
	
	/**
	 * @return the gisu
	 */
	public int getGisu() {
		return gisu;
	}

	/**
	 * @param gisu the gisu to set
	 */
	public void setGisu(int gisu) {
		this.gisu = gisu;
	}

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the ban
	 */
	public int getBan() {
		return ban;
	}

	/**
	 * @param ban the ban to set
	 */
	public void setBan(int ban) {
		this.ban = ban;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	private String getHakBeon() {
		return "" + gisu + grade + ban + String.format("%02d", number);
	}
	
	public void printStudent() {
		System.out.println("<< 학생 정보 출력 >>");
		System.out.println("1. 학번 : " + getHakBeon());
		System.out.println("2. 이름 : " + name);
		System.out.println("3. 주소 : " + address);
		System.out.println("4. 휴대폰번호 : " + phone);
		System.out.println();
	}
}
