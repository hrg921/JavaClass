/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ ArrayBasic
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author hangeonho
 * @version 1.0.0
 * 
 */
public class ArrayBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 배열 선언
		int [] intArr = null;
		
		// 배열 생성
		intArr = new int[5];
		
//		for (int value : intArr){
//			System.out.println(value);
//		}
		
		for(int i=0; i<intArr.length ; i++) {
			System.out.print(intArr[i] + " | ");
		}
		
		System.out.println();
		
		// 배열 선언 및 생성
		String[] strArr = new String[3];
		
		strArr[0] = "EXO";
		strArr[1] = "EXID";
		
		for (String value : strArr) {
			System.out.print(value + " | ");
		}
		
		System.out.println();
		
//		for(int i=0; i<strArr.length ; i++) {
//			System.out.print(strArr[i] + " | ");
//		}
//		
//		System.out.println();
		
		// 길이가 3인 Book 배열을 선언하고 생성해보자
		Book[] bookArr = new Book[3];
		
		 bookArr[0] = new Book("모리와 함께한 화요일", "미치엘봄", 300);
		 bookArr[1] = new Book("자바의신", "나자바", 3000);
		 bookArr[2] = new Book("수학의정석", "홍성대", 2000);
		
		for (Book book : bookArr) {
			System.out.print(book.getTitle() + " | ");
		}
		System.out.println();
	}

}
