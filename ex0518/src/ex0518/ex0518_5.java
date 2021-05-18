package ex0518;

import java.util.Scanner;

public class ex0518_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("두수를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		max(num1, num2);//num1,num2가 각각 입력되 max(int a,int b)에 각각 저장된다
		
		System.out.println("데이터 : "+ max(num1,num2));
	
	}//main메소드

	static int max(int num1,int num2) { //같은 class에서도  객체선언을해서 사용을 해야한다
		//매게변수는 왠만하면 main의 이름과 맞춰서 쓴다.
		int result = 0; //결과값
		
		if(num1>num2) {
			result = num1;
		}else {
			result = num2;
		}
		return result; //리턴값이 System.out.println("데이터 : "+ max(num1,num2));로 가서 값을 출력한다.
	}
}