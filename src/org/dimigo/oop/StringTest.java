/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ StringTest
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 8.
 * </pre>
 *
 * @author hangeonho
 * @version 1.0.0
 * 
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. 문자열 리터럴 방식 (Literal pool 생성, 동일 문자열은 공유함)
		String dog1 = "멍멍이";
		String dog2 = "멍멍이";
		
		// 2. new 객체 생성 방식 (매번 다른 객체를 생성함)
		String cat1 = new String("야옹이");
		String cat2 = new String("야옹이");
		
		System.out.println(dog1 == dog2);
		System.out.println(cat1 == cat2);
		System.out.println(dog1 == "멍멍이");
		
		// 문자열 비교 시에는 equals 메소드를 이용하자!!
		System.out.println(dog1.equals(dog2));
		System.out.println(cat1.equals(cat2));
		System.out.println(dog1.equals("멍멍이"));
		System.out.println(cat1.equals("야옹이"));
		
		// 문자열 비교시 주의사항!!
		String id = "Admin";
		
//		if(id != null && id.equals("admin")) {
//			System.out.println("관리자입니다!!");
//		} else {
//			System.out.println("일반 사용자입니다!!");
//		}
		
		if("admin".equals(id)) {
			System.out.println("관리자입니다!!");
		} else {
			System.out.println("일반 사용자입니다!!");
		}
		
		if("admin".equalsIgnoreCase(id)) {
			System.out.println("관리자입니다!!");
		} else {
			System.out.println("일반 사용자입니다!!");
		}
	}

}
