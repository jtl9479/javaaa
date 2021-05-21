package ex0518;

import java.util.Scanner;

public class ex0518_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("두수를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int result = add(num1, num2);

		System.out.println("데이터 : " + result);

	}// main메소드

	static int add(int num1, int num2) {//매개변수 타입 매개변수명 값1,값2 
		int result = num1 + num2;
		return result;//return타입 return 과 매개변수 타입을 맞춰야한다. 리턴타입이없을떄는 void를 사용한다 void는 안써도된다.
	}
	
}