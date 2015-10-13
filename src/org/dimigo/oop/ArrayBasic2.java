/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ ArrayBasic2
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 15.
 * </pre>
 *
 * @author hangeonho
 * @version 1.0.0
 * 
 */
public class ArrayBasic2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArr1 = {1, 2, 3, 4, 5};
		int[] intArr2 = new int[] {1, 2, 3, 4, 5};
		
		for(int value: intArr1) {
			System.out.print(value + " | ");
		}
		System.out.println();
		
		String[] strArr1 = {"조성모	", "소찬휘", "김건모", "김광석"};
		String[] strArr2 = new String[] {"조성모", "소찬휘", "김건모", "김광석"};
		
		for(String value: strArr1) {
			System.out.print(value + " | ");
		}
		
		System.out.println();
		
		// Book 타입 배열 생성과 동시에 초기화 해보자
		
		Book[] strBook1 =  new Book[] {
				new Book("미생", "윤태호", 150),
				new Book("모리와 함께한 화요일", "미치앨봄", 300),
				new Book("자바의 신", "나자바", 2000)
		}; // new Book[] 삭제가능
		
		for(Book value: strBook1) {
			System.out.println(value.getTitle() + " | " + value.getAuthor() + " | " + value.getPage());
		}
		System.out.println();
		
		String[] cities = null;
		
//		cities = {"서울", "뉴욕", "파리"}; -> 컴파일 오
		cities = new String[]{"서울", "뉴욕", "파리"};
		
		for(String value: cities) {
			System.out.print(value + " | ");
		}

		// ArrayIndexOutOfBoundsException 테스트하기
		int[] test = new int[5];

		System.out.println(test[0]);
	}

}
