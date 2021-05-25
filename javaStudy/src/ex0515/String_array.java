package ex0515;
//String으로 값을 입력받으면 배열 String에 저장을하고 출력하는것을 확인하는 코드이다
import java.util.Scanner;

public class String_array {

	public static void main(String[] args) {
		
		String str = "";
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("과목의 수를 입력하세요");
		int number = scan.nextInt();
		String[] str1 = new String[number];
		
		
		for(int i=0; i<number; i++) {
			System.out.println("과목을 입력하세요");
			str = scan.next();
			str1[i] = str;
		
		
		}
		for(int i=0; i<str1.length; i++) {
			System.out.println(str1[i]);
		}
	}
	}

