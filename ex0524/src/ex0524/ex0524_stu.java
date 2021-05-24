package ex0524;

import java.util.Scanner;


public class ex0524_stu {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 객체배열 주소선언 - 참조변수주소만 생성됨.
		Student[] s = new Student[10];// 10명의 데이터 저장장소, 마지막에는 db랑 연결된다.
		Score_Process score = new Score_Process();//class에있는 메소드

		// 무한반복
		loop1: while (true) {

			score.mainPrint();// 메인 메뉴 출력메소드
			int choice = scan.nextInt();

			switch (choice) {
			case 1: // 학생성적추가
				score.student_insert(s);
				// 학생성적추가 메소드 메소드에게 주소를 보낸다.
				break;

			case 2: // 학생성적출력
				ex0524_stu ex = new ex0524_stu();
				ex.student_print(s);
	//static이 없을떄는 위에처럼 객체선언을 해주고나서 참조변수명.메소드명을 입력한다
				break;

			case 3: // 학생성적수정
				score.student_update(s);
				break;

			case 4: // 학생성적검색
				score.student_search(s); //학생성적검색 메소드
				break;

			case 5:
				// 등수처리
				score.rank_process(s);// 등수처리
				break;

			case 0:
				System.out.println("프로그램을 종료합니다.!");
				break loop1;
			}
		}
	}// main

		// 학생성적 상단 출력 메소드
	 void top_title() {

			System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
			System.out.println("---------------------------------------------------");
			// resturn의 필요가없다
		}

	 
	 void student_print(Student[] s) {// case2

			top_title();// 상단 출력부분 메소드
			// 다른곳에서 사용하는 기능은 따로 메소드를 만들어낸다
			// for문은 i값을 가지고 가야해서 불편하다
			for (int i = 0; i < Student.count; i++) {
				System.out.print(s[i].stu_number + "\t");
				System.out.print(s[i].name + "\t");
				System.out.print(s[i].kor + "\t");
				System.out.print(s[i].eng + "\t");
				System.out.print(s[i].math + "\t");
				System.out.print(s[i].total + "\t");
				System.out.printf("%.2f\t", s[i].avg);
				System.out.print(s[i].rank + "\n");
			}
		}// 학생성적 출력 메소드 case2

}
