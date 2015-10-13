package org.dimigo.basic;

public class ArithmeticOperator {
	public static void main(String[] args) {
		int a = 5, b = 2;
		
		double result =(double) a / b;
		System.out.println(result);		// 2.0 정수간의 연산은 정수
		
		//result = a/0; -> 에러
		
		// 다른 타입간의 연산
		double d = 3.14;
		int i = 10;
		
		int r = (int)(d + i);
		double r1 = d +i;
		
		System.out.println(r);
		System.out.println(r1);
		
		//	int 타입보다 작은 타입간의 연산
		short s1 = 1, s2 = 2;
		short r2 = (short)( s1 + s2); // int 보다 작은 타입간의 연산은 int이다.
		int r3 = s1 + s2;
		
		System.out.println(r2);
		System.out.println(r3);
	}
}
