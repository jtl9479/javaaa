package ex0518;

import java.util.Scanner;
//나의 답안
public class Ex0518_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 객체배열 주소 선언
		Student2[] s = new Student2[10];
		// 참조변수 주소만 생성 저장소는() 을 써야만 생성된다.

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

			case 3:// 학생정보수정
					// 이름을 입력받고 그 이름이 같은지를 확인한다
					// 같지 않다면 틀림니다 라는 문구를 보낸다.
					// 같다면 과목을 선택하고 점수를 입력받는다.
				System.out.println("학생이름을 입력하세요");
				String sea_name = scan.next();
				int sea_num = -1;// i
				int sea_num2 = 0;// j
				for (int i = 0; i < Student2.count; i++) {
					if (sea_name.equals(s[i].name)) {
						sea_num = i;
					}
				}
				if (sea_num == -1) {
					System.out.println("이름이 틀립니다. 다시입력해주세요");
					break;
				}
				System.out.println(s[sea_num].name + "의 성적을 수정합니다");
				System.out.println("과목을 선택해주세요");
				System.out.println("1.국어 2.영어 3.수학");
				sea_num2 = scan.nextInt();
				switch (sea_num2) {
				case 1:
					System.out.println("현재 국어점수는" + s[sea_num].kor + "입니다");
					System.out.println("수정할 점수를 입력해주세요");
					s[sea_num].kor = scan.nextInt();
					s[sea_num].total = s[sea_num].kor + s[sea_num].eng + s[sea_num].math;
					s[sea_num].avg = s[sea_num].total / 3.0;
					System.out.println("수정되었습니다");
					break;

				case 2:
					System.out.println("현재 영어점수는" + s[sea_num].eng + "입니다");
					System.out.println("수정할 점수를 입력해주세요");
					s[sea_num].eng = scan.nextInt();
					s[sea_num].total = s[sea_num].kor + s[sea_num].eng + s[sea_num].math;
					s[sea_num].avg = s[sea_num].total / 3.0;
					System.out.println("수정되었습니다");
					break;

				case 3:
					System.out.println("현재 수학점수는" + s[sea_num].math + "입니다");
					System.out.println("수정할 점수를 입력해주세요");
					s[sea_num].math = scan.nextInt();
					s[sea_num].total = s[sea_num].kor + s[sea_num].eng + s[sea_num].math;
					s[sea_num].avg = s[sea_num].total / 3.0;
					System.out.println("수정되었습니다");
					break;

				default:
					System.out.println("잘못입력하셨습니다");
					break;
				}
				break;

			case 4://학생검색
				
				System.out.println("검색할 학생이름을 입력하세요");
				sea_name= scan.next();
				int sea_num3 = -1;// i
				for(int i=0; i<Student2.count; i++) {
					if(sea_name.equals(s[i].name)) {
						sea_num3 = i;
					}
				}
				if(sea_num3 == -1) {
					System.out.println("일치하는 이름이 없습니다");
					break;
				}
				System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
				System.out.println("----------------------------------");
				System.out.println("일치하는 학생이 있습니다");
				System.out.print(s[sea_num3].stu_number + "\t");
				System.out.print(s[sea_num3].name + "\t");
				System.out.print(s[sea_num3].kor + "\t");
				System.out.print(s[sea_num3].eng + "\t");
				System.out.print(s[sea_num3].math + "\t");
				System.out.print(s[sea_num3].total + "\t");
				System.out.printf("%.2f\t", s[sea_num3].avg);
				System.out.print(s[sea_num3].rank + "\n");
				
				break;
			case 5:
				System.out.println("등수처리");
				//합계 2개를 비교한다. for문 2개를 사용한다.
				for(int i=0; i<Student2.count; i++) {
					int rankCount =1;
					for(int j=0; j<Student2.count; j++) {
						if(s[i].total<s[j].total) {
							rankCount++;
						}
					} s[i].rank=rankCount;
				}
				break;
			
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
