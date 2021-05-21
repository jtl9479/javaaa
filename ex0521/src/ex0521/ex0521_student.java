package ex0521;

import java.util.Scanner;

public class ex0521_student {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 10명의 학생을 입력받음.

		// student3 s =new student3(); 이러면 1명밖에 받지 못한다
		student3[] s = new student3[10]; // 배열을 사용해서 10명의 값을 받는다.s를 10번 입력한다

		// 무한반복

		loop: while (true) {

			menu_print();
			int choice = scan.nextInt();

			switch (choice) {
			case 1:// 학생성적 추가
				student_insert(s);//저장공간을 입력한다 ->참조변수명
				break;

			case 0:// 프로그램종료
				System.out.println("[프로그램을 종료합니다]");
				break loop;
			default:// 잘못입력했을떄
				System.out.println("[잘못입력했습니다]");
				break;
			}// switch

		} // while
	}// main
	
	//메인메뉴
	static void menu_print() {
		System.out.println("[학생성적처리 프로그램]");
		System.out.println("1.학생성적추가");
		System.out.println("2.학생성적출력");
		System.out.println("3.학생성적수정");
		System.out.println("4.학생성적검색");
		System.out.println("5.등수처리");
		System.out.println("0.종료");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요");
		
	}
	
	//학생성적 추가 case1
	static void student_insert(student3[] s) {
		System.out.println("[학생성적입력]");
		//클래스명과 참조변수를 입력한다 그래야지 참조변수의 주소값을 받는다는 소리이다
		for (int i = student3.count; i < s.length; i++) {
			// 반복시작
			System.out.println("학생이름을 입력하세요.(0. 상위메뉴이동)");
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println("상위메뉴로 이동합니다");
				break;
			} else {
				// 0이 아닌 경우
				System.out.println("국어점수를 입력하세요");
				int kor = scan.nextInt();
				System.out.println("영어점수를 입력하세요");
				int eng = scan.nextInt();
				System.out.println("수학점수를 입력하세요");
				int math = scan.nextInt();
				s[i] = new student3(name, kor, eng, math);//생성자로 값을 보내는 역활
				System.out.println("1명의 학생이 등록되었습니다");
	
			} // 반복끝
		}
	}
	
	
	
	
	
}// class
