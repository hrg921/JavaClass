package org.dimigo.basic;

public class DoubleExample {

	public static void main(String[] args) {
		double d1 = 3.14;
		double d2 = 3.14d; // double타입을 명시해준다.
		
		float f1 = (float) 3.14; // float타입에 맞지 않은 내
		float f2 = 3.14f;
		
		System.out.printf("%.2f, %.2f, %.2f, %.2f\n", d1, d2, f1, f2);
		
		// 실수 정밀도 테스트
		double d3 = 0.12345678901234567890;
		float f3 = 0.12345678901234567890f;
		
		System.out.println(d3);
		System.out.println(f3);
	}

}