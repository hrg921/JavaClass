package org.dimigo.basic;

public class StringConCat {
	
	public static void main(String[] args) {
		String school = "디미고";
		int grade = 2;
		int ban = 6;
		String name = "한건호";
		
		System.out.println(school + grade + ban + name);
		System.out.println(grade + ban + school + name);
		
		// 26디미고김자바를 출력하려면?
		System.out.println("" + grade + ban + school + name); // 연산이 왼쪽에서 오른쪽으로 진행됨을 이용 -> 빈 문자열 삽
		System.out.println(grade + (ban + school) + name); // 우선순위 부
	}
	
}
