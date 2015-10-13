/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ MultiArray
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 21.
 * </pre>
 *
 * @author hangeonho
 * @version 1.0.0
 * 
 */
public class MultiArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 이차원 배열 생성하기
		int[][] intArr = new int[2][3];
		
		// 이차원 배열 요소값 출력하기
		for(int i=0; i<intArr.length; i++) {
			for(int j=0;j<intArr[i].length;j++) {
				System.out.print(intArr[i][j]);
			}System.out.println();
		}System.out.println();
		
		intArr[0][0] = 100;
		intArr[1][2] = 90;
		
//		int[] arr = new int[3];
//		for(int value: arr) {
//			
//		}
		
		// for-each 문으로 출력해보자
		for(int[] arr : intArr) {
			for(int value: arr) {
				System.out.print(String.format("%15s",""+ value + "  |  "));
			}System.out.println();
		}System.out.println();
		
		// 먼저 일차원 배열을 생성한 후 다시 일차원 배열을 생성해서 연결하기
		String[][] strArr = new String[2][];
		
//		strArr[0] = new String[3];
//		strArr[1] = new String[2];
		
		strArr[0]= new String[] {"C", "Java", "C++", "Ruby"};
		strArr[1] = new String[] {"PHP", "JSP"};
		
		for(String[] arr : strArr) {
			for(String value: arr) {
				System.out.print(String.format("%10s", value + "  |  "));
			}System.out.println();
		}System.out.println();
		
		/*
		strArr[0][0] = "C";
		strArr[0][1] = "Java";
		strArr[0][2] = "C++";
		
		strArr[1][0] = "PHP";
		strArr[1][1] = "JSP";
//		strArr[1][2] = "ASP";
		*/
		
		for(String[] arr : strArr) {
			for(String value: arr) {
				System.out.print(String.format("%-15s", value + "  |  "));
			}System.out.println();
		}System.out.println();

	}

}
