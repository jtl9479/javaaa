package ex0521;

//앞으로 이렇게 구현을 해야한다.
import java.util.Scanner;

//public class Ex0518_04 변형
public class ex0521 {
	static Scanner scan = new Scanner(System.in);
	// scaner문을 메인메소드밖으로 뺀다 그럼 해당클래스에 있는 모든 메소드에서 사용할수가 있다.

	public static void main(String[] args) {
		// 객체배열 주소선언 - 참조변수주소만 생성됨.
		Student[] s = new Student[10];// 10명의 데이터 저장장소, 마지막에는 db랑 연결된다.
//		String search_name = ""; // 찾을 이름변수
//		int search_num = -1; // 데이터검색 있는지 확인하는 변수
//		String name;
//		int stu_number=0, kor=0, eng=0, math=0, total=0, rank=0;//임시 사용
//		double avg =0;

		// 무한반복
		loop1: while (true) {

			mainPrint();// 메인 메뉴 출력메소드
			int choice = scan.nextInt();

			switch (choice) {
			case 1: // 학생성적추가
				student_insert(s);
				// 학생성적추가 메소드 메소드에게 주소를 보낸다.
				break;

			case 2: // 학생성적출력
				student_print(s);// 학생성적에대한 부분을 보여준다
				break;

			case 3: // 학생성적수정
				student_update(s);
				break;

			case 4: // 학생성적검색
				student_search(s); //학생성적검색 메소드
				break;

			case 5:
				// 등수처리
				rank_process(s);// 등수처리
				break;

			case 0:
				System.out.println("프로그램을 종료합니다.!");
				break loop1;
			}
		}
	}// main

	
	
	
	
	
	
	
	
	
	
	
	
	// 메인 메뉴 출력메소드
	static void mainPrint() {

		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 학생성적추가");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램종료");
		System.out.println("------------------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
	}

	static void student_insert(Student[] s) {// case1
//주소가 담겨져있다. 메인에서 사용하는 저장공간을 공유한다. 메소드에 생기는 독립적인 저장공간
//Student[] s = new Student[10];의 클래스명과 참조변수명을 쓴다. 이유는 주소를 받아오기때문이다.	
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		int count = 0;
		for (int i = Student.count; i < s.length; i++) {
			// 번호는 자동으로 입력됨. s.length의 오류 무조건 main에서 컨트롤한다
			System.out.println("이름을 입력하세요.>>(0.상위메뉴이동)");
			String check = scan.next();

			if (check.equals("0")) {
				System.out.println("상위메뉴로 이동합니다.");
				break;
			}

			name = check;// 메소드에서 변수를 선언해줘야한다
			System.out.println("국어점수를 입력하세요.>>");
			kor = scan.nextInt();// scan에러 잡는방법
			System.out.println("영어점수를 입력하세요.>>");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			math = scan.nextInt();
//			// 합계
//			s[i].total = s[i].kor + s[i].eng + s[i].math;
//			// 평균
//			s[i].avg = s[i].total / 3.0;
			// s[i]객체선언
			s[i] = new Student(name, kor, eng, math);
			// 메인에있는
			// Student[] s = new Student[10];에 저장이된다. 주소를 공유하고 입력한 값들은 전달된다.
			
			
		}
	}// 학생성적추가 메소드 case1
		// 학생성적 상단 출력 메소드

	static void top_title() {

		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("---------------------------------------------------");
		// resturn의 필요가없다
	}

	// 학생성적 출력 메소드
	static void student_print(Student[] s) {// case2

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

	
	
	
	
	
	
	
	
	
	
	// 학생성적 수정 메소드 case3
	static void student_update(Student[] s) {
		String search_name = "";
		int search_num = 0;
		System.out.println("수정할 학생의 이름을 입력하세요.>>");
		search_name = scan.next(); // 홍

		search_num = -1; // 검색데이터가 있는지 확인하는 변수
		System.out.println("[ 검색된 학생 이름 ]");
		for (int i = 0; i < Student.count; i++) { // 학생수만큼 검색
			if (s[i].name.contains(search_name)) {
				System.out.println(i + ". " + s[i].name);
				// 현재데이터 0.홍길동, 1.이순신,2.홍길자,3.김구
				// 0. 홍길동
				// 2. 홍길자
				search_num = 0; // 검색한 데이터가 있을경우 0, 없을경우 -1
			}
		}
		// 없을경우
		if (search_num == -1) {
			System.out.println("찾을 데이터가 없습니다.");
			// break; 는 사용을 못한다 그러면 else를 사용한다.
		} else {
			
			
			
			
			// 있을경우
			System.out.println("수정하고 하는 학생의 번호를 입력하세요.>>");
			int temp_num = scan.nextInt(); // 원하는 학생번호

			// 수정할 과목을 선택
			System.out.println("[ 수정할 과목 선택 ]");
			System.out.println("0.국어  1.영어  2.수학");
			System.out.println("수정할 과목번호를 입력하세요.>>");
			int temp_num2 = scan.nextInt();

			// 과목별 수정
			switch (temp_num2) {
			case 0:
				System.out.println("현재점수 : " + s[temp_num].kor);
				System.out.println("수정할 점수를 입력하세요.>>");
				// 점수수정
				s[temp_num].kor = scan.nextInt();
				break;
			case 1:
				System.out.println("현재점수 : " + s[temp_num].eng);
				System.out.println("수정할 점수를 입력하세요.>>");
				// 점수수정
				s[temp_num].eng = scan.nextInt();
				break;
			case 2:
				System.out.println("현재점수 : " + s[temp_num].math);
				System.out.println("수정할 점수를 입력하세요.>>");
				// 점수수정
				s[temp_num].math = scan.nextInt();
				break;
			}
			// 합계수정
			s[temp_num].total = s[temp_num].kor + s[temp_num].eng + s[temp_num].math;
			// 평균수정
			s[temp_num].avg = s[temp_num].total / 3.0;
			System.out.println("수정이 완료되었습니다.!");
		}
	}// 3.학생정보 수정

//학생검색 case4	
	static void student_search(Student[] s) {
		String search_name = "";
		int search_num = 0;
		
		
		System.out.println("검색할 학생의 이름을 입력하세요.>>");
		search_name = scan.next(); // 홍

		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("---------------------------------------------------");

		search_num = -1; // 검색데이터가 있는지 확인하는 변수
		for (int i = 0; i < Student.count; i++) {
			if (s[i].name.contains(search_name)) {
				// 출력
				System.out.print(s[i].stu_number + "\t");
				System.out.print(s[i].name + "\t");
				System.out.print(s[i].kor + "\t");
				System.out.print(s[i].eng + "\t");
				System.out.print(s[i].math + "\t");
				System.out.print(s[i].total + "\t");
				System.out.printf("%.2f\t", s[i].avg);
				System.out.print(s[i].rank + "\n");
				search_num = 0; // 데이터가 있을경우 0으로 변경,없을경우 -1
			}
		}

		// 없을경우
		if (search_num == -1) {
			System.out.println("찾을 데이터가 없습니다.");
		}

	}
	//학생검색 case4	
	
	// 학생등수처리 case5
	static void rank_process(Student[] s) {// 매개변수만 무엇을 사용하는지 알면 쉽다

		for (int i = 0; i < Student.count; i++) {
			int rankNum = 1; // 등수count
			for (int j = 0; j < Student.count; j++) {
				if (s[i].total < s[j].total) {
					rankNum++;
				}
			}
			s[i].rank = rankNum;
		}
		System.out.println("등수처리가 완료되었습니다.!");

	}

}// class