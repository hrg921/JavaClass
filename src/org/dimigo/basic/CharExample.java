package org.dimigo.basic;

public class CharExample {
	
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 65;					// 10진수
		char ch3 = '\u0041';		// 16진수
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		char ch4 = '가';
		System.out.println(ch4);
		
		int unicode = '가';
		System.out.println(unicode);
		
		char ch5 = (char)unicode;
		System.out.println(ch5);
		
		// 문자열
		String name = "김자바";
		System.out.println("My name is " + name );
		System.out.println("123" + (10 + 3.14) + name);
		
		System.out.print("abc");
		System.out.print("def\n");
		
		System.out.printf("%d, %.2f, %c, %s\n", 100, 3.14, 'A', "JAVA");
	}

}
