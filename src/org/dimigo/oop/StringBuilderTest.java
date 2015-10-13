/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ StringBuilderTest
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author hangeonho
 * @version 1.0.0
 * 
 */
public class StringBuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. String으로 문자열 추가하기
		String str = "디미고 ";
		str += "2학년 ";
		str += "6반 ";
		str += "1번 ";
		str += "김자바";
		
		System.out.println(str);
		
		// 2. StringBuilder로 문자열 추가하기
		StringBuilder sb = new StringBuilder();
		sb.append("디미고 ");
		sb.append("2학년 ");
		sb.append("6반 ");
		sb.append("1번 ");
		sb.append("김자바 ");
		
		System.out.println(sb.toString());
		System.out.println(sb);
		
		// StringBuilder, StringBuffer -> 단일 스레드, 멀티 스레드
		
		// StringBuilder를 간단하게 사용하자 - Method Chaining
		String sb1 = new StringBuilder()
			.append("디미고 ")
			.append("2학년 ")
			.append("6반 ")
			.append("1번 ")
			.append("김자바").toString();
		
		System.out.println(sb1);
		
		// String, StringBuffer, StringBuilder 속도 차이 비교하기
		long start = System.currentTimeMillis();
		
		//String test = "abc";
		StringBuilder test1 = new StringBuilder("abc");
		
		for(int i = 0; i < 100000 ; i++) {
			//test += "def";
			test1.append("def");
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}

}
