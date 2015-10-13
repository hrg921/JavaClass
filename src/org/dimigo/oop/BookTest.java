/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ BookTest
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 10.
 * </pre>
 *
 * @author hangeonho
 * @version 1.0.0
 * 
 */
public class BookTest {

	/**
	 * @param args
	 */

	private void methodA(Book book) {
		book.setTitle("자바를 잡아라!!");
		System.out.println(book.getTitle());
	}
	
	public static void main(String[] args) {
		
//		Book book = new Book("미생", "윤태호", 1000);
//		Book book2 = new Book("자바를 잡아라", "나자바");
//		
//		System.out.println("책제목 : " + book.getTitle());
//		System.out.println("저자명 : " + book.getAuthor());
//		System.out.println("페이지수 : " + book.getPage());
//		System.out.println();
//		
////		book.setTitle("자바를 잡아라");
//		
//		System.out.println("책제목 : " + book2.getTitle());
//		System.out.println("저자명 : " + book2.getAuthor());
//		System.out.println("페이지수 : " + book2.getPage());
		
		Book book = new Book();
		
		System.out.println(book.getTitle().length());
		}
}