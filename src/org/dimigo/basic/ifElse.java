package org.dimigo.basic;

public class ifElse {

	public static void main(String[] args) {
		// 발달단계에 따른 연령 구분
		// 0 ~ 6 : 유아기
		// 7 ~12 : 아동기
		// 13 ~ 15 : 사춘기
		// 16 ~ 24 : 청년기
		int age = 18;
		
		if (age < 0) {
			System.out.println("나이는 양수만 가능합니다.");
			return;
		}
		
		if (age >= 0 && age <= 6) {
			System.out.println("유아기입니다.");
		} else if (age <= 12) {
			System.out.println("아동기입니다.");
		} else if (age <= 15) {
			System.out.println("사춘기입니다.");
		} else if (age <= 24) {
			System.out.println("청년기입니다.");
		} else {
			System.out.println("성년기입니다.");
		}
		
		// if ~ else 문에서 주의할 사항
		int i = 5;
		
		if(i >10) {
			if (i < 100)
				System.out.println("10보다 크고 100보다 작다");
		} else
				System.out.println("10보다 작거나 같다");
		// else문은 가장 가까운 if 문과 짝을 이룬다.

	}

}
