package org.dimigo.basic;

public class ShortCircuit {

	public static void main(String[] args) {
		
		boolean flag = true;
		int a = 10;
		
		// OR 연산은 true 가 될 가능성이 높은 것을 먼저 작성하는 것이 실행속도를 높일 수 있다.
		if (flag || (a / 0 ==0))
			System.out.println("OR 연산");
		
		// AND 연산은 false 가 될 가능성이 높은 것을 먼저 작성하는 것이 실행속도를 높일 수 있다.
		if(!flag && (a / 0 == 0))
			System.out.println("AND 연산");
	}

}