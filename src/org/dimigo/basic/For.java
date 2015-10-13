package org.dimigo.basic;

public class For {

	public static void main(String[] args) {
		// for문
		System.out.println("<< 번호 출력 하기 >>");
		for (int i = 1; i <= 37; i++) {
			System.out.print(i + "번");
			if(i % 10 == 0) System.out.println();
		}
	
	// 구구단 출력하기
	// 2 * 1 = 2 .. 2 * 9 = 18
	// 3 * 1 = 3 .. 3 * 9 = 27
	// ..
	// 9 * 1 = 9 .. 9 * 9 = 81
		System.out.println("구구단 출력하기");
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "   ");
			}
			System.out.println();
		}
		
		// 배열 선언
		int[] intArr = {10, 20, 30};
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		// for - each 문
		for(int value : intArr) {
			System.out.println(value);
		}
		
		System.out.println("<< 무한도전 멤버 >>");
		String[] member = {"유재석", "정준하", "박명수", "하하", "정형돈", "식스맨"};
		
		// 멤버 출력하기
		for(String value: member) {
			System.out.println(value);
		}
	}
}