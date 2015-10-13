/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ StudentTest
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 17.
 * </pre>
 *
 * @author hangeonho
 * @version 1.0.0
 * 
 */
public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student(13, 2, 3, 1);
		Student s2 = new Student(13, 2, 3, 2, "박명수");
		Student s3 = new Student(13, 2, 3, 3, "정준하", "안산시");
		Student s4 = new Student(13, 2, 3, 4, "정형돈", "서울시", "010-444-4444");
		
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();
		s4.printStudent();
		
		// 비어있는 학생정보 입력
		s1.setName("유재석");
		s1.setAddress("압구정동");
		s1.setPhone("010-111-1111");
		
		s2.setAddress("서래마을");
		s2.setPhone("010-222-2222");
		
		s3.setPhone("010-333-3333");
		
		System.out.println("---------------------------------");
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();
		s4.printStudent();
	}

}
