package ex0518;

import java.util.Scanner;

//선생님이 해주신 답
public class Ex0518_4_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 객체배열 주소 선언
		Student2[] s = new Student2[10];
		// 참조변수 주소만 생성 저장소는() 을 써야만 생성된다.
		int search_num = -1;
		String search_name = "";
		// 무한반복
		while (true) {
			System.out.println("[학생성적 프로그램]");
			System.out.println("[1. 학생성적 입력]");
			System.out.println("[2. 학생성적 출력]");
			System.out.println("[3. 학생성적 수정]");
			System.out.println("[4. 학생성적 검색]");
			System.out.println("[5. 등수처리]");
			System.out.println("[0.프로그램 종료]");
			System.out.println("------------------------------------");
			System.out.println("[원하는 번호를 입력하세요]");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:// 학생성적입력
				System.out.println("학생성적 입력하세요");
				for (int i = Student2.count; i < s.length; i++) {
					System.out.println("이름을 입력하세요.0을 누르면 나가집니다>>");
					String check = scan.next();

					if (check.equals("0")) {
						System.out.println("상위메뉴로 갑니다");
						break;
					}
					s[i] = new Student2();// s[i]의 객체선언 ->저장소생성된다.
					s[i].name = check;
					System.out.println("국어점수를 입력하세요.>>");
					s[i].kor = scan.nextInt();
					System.out.println("영어점수를 입력하세요.>>");
					s[i].eng = scan.nextInt();
					System.out.println("수학점수를 입력하세요.>>");
					s[i].math = scan.nextInt();
					s[i].total = s[i].kor + s[i].eng + s[i].math;
					s[i].avg = s[i].total / 3.0;

				}
				break;

			case 2:// 학생성적출력

				System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
				System.out.println("----------------------------------");
				for (int i = 0; i < Student2.count; i++) {// 클래스변수를 사용하는방법 클래스이름.클래스변수명
					System.out.print(s[i].stu_number + "\t");
					System.out.print(s[i].name + "\t");
					System.out.print(s[i].kor + "\t");
					System.out.print(s[i].eng + "\t");
					System.out.print(s[i].math + "\t");
					System.out.print(s[i].total + "\t");
					System.out.printf("%.2f\t", s[i].avg);
					System.out.print(s[i].rank + "\n");

				}

				break;

			case 3:// 학생성적 수정
				System.out.println("수정할 학생의 이름을 입력하세요");
				search_name = scan.next();

				search_num = -1;// 검색 데이터가 있는지 확인하는변수
				System.out.println("[검색된 학생 이름]");
				for (int i = 0; i < Student2.count; i++) {// 학생수만큼 돈다.
					if (s[i].name.contains(search_name)) {// 이름이 조금이라도 비슷한것이 있으면 출력한다.
						System.out.println(i + s[i].name + "\t");
						// 현재데이터 0.홍길동 1.이순신 2.홍길자 3.김구
						// 0.홍길자
						// 2.홍길순

						search_num = 0;// 검색한 데이터가 있을경우 0, 없을 경우 -1
					}
				}
				// 없을 경우
				if (search_num == -1) {
					System.out.println("찾을 데이터가 없습니다");
					break;
				}
				// 있을 경우
				System.out.println("수정하고자하는 학생번호를 입력하세요");
				int tmep_num = scan.nextInt(); // 원하는 학생번호

				// 수정할 과목을 선택하세요
				System.out.println("[수정할 과목 선택]");
				System.out.println("0.국어 1.영어 2.수학");
				System.out.println("[수정할 과목 번호를 입력하세요]");
				int temp_num2 = scan.nextInt();

				switch (temp_num2) {

				case 0:
					System.out.println("현재 국어점수는" + s[tmep_num].kor + "입니다");
					System.out.println("수정할 점수를 입력해주세요");
					s[tmep_num].kor = scan.nextInt();
					break;

				case 1:
					System.out.println("현재 영어점수는" + s[tmep_num].eng + "입니다");
					System.out.println("수정할 점수를 입력해주세요");
					s[tmep_num].eng = scan.nextInt();
					break;

				case 2:
					System.out.println("현재 수학점수는" + s[tmep_num].math + "입니다");
					System.out.println("수정할 점수를 입력해주세요");
					s[tmep_num].math = scan.nextInt();
					break;
				}
				s[tmep_num].total = s[tmep_num].kor + s[tmep_num].eng + s[tmep_num].math;
				s[tmep_num].avg = s[tmep_num].total / 3.0;
				System.out.println("수정되었습니다");
				break;

			case 4:// 학생성적섬색

				System.out.println("검색할 학생의 이름을 입력하세요");
				search_name = scan.next();

				System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
				System.out.println("----------------------------------");

				search_num = -1;// 검색 데이터가 있는지 확인하는변수
				for (int i = 0; i < Student2.count; i++) {
					if (s[i].name.contains(search_name)) {// 이름이 조금이라도 비슷한것이 있으면 출력한다.
						// 출력 이름이 같은사람이 있으면 출력한다
						System.out.print(s[i].stu_number + "\t");
						System.out.print(s[i].name + "\t");
						System.out.print(s[i].kor + "\t");
						System.out.print(s[i].eng + "\t");
						System.out.print(s[i].math + "\t");
						System.out.print(s[i].total + "\t");
						System.out.printf("%.2f\t", s[i].avg);
						System.out.print(s[i].rank + "\t");
						search_num = 0;// 데이터가 있을 경우 0으로 변경 데이터가 없을 경우 -1
					}
				}
				// 없을 경우
				if (search_num == -1) {
					System.out.println("찾을 데이터가 없습니다");
					break;
				}
				break;
				
				
			case 5:
				for(int i=0; i<Student2.count; i++) {
					int rankCount=1;
					for(int j=0; j<Student2.count; j++) {
						if(s[i].total<s[j].total) {
							rankCount++;
						}
					}s[i].rank = rankCount;
				}
			case 0:// 프로그램 종료
				System.out.println("프로그램을 종료합니다");
				break;
			default:
				System.out.println("[잘못입력하셨습니다]");
				break;
			}
		}
	}
}
