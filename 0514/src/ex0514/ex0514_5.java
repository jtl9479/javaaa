package ex0514;

import java.util.Scanner;

public class ex0514_5 {

	public static void main(String[] args) {
		// 1.학생추가
		// 각각의 배열에 값을 저장
		// 이름,국어,영어,수학의 값을 입력받음
		// 합계,평균 입력
		// 2.학생출력
		// 3.화면단 출력 while(), switch
		Scanner scan = new Scanner(System.in);

		loop1: while (true) {
			System.out.println("1.학생정보입력");
			System.out.println("2.학생정보출력");
			System.out.println("3.학생정보수정");
			System.out.println("4.학생정보검색");
			System.out.println("원하는 번호를 입력하세요");

			int page = scan.nextInt();
			String[] name = new String[10];
			String[] subject = { "국어", "영어", "수학" };
			int[][] score = new int[10][4];
			double[] avg = new double[10];
			String count = "";
			int number = 0;

			switch (page) {
			case 1:// 학생정보 입력
				System.out.println("[  학생성적추가 메뉴  ]");
				for (int i = number; i < name.length; i++) {
					System.out.println((i + 1) + "번째 이름을 입력해주세요(0을 입력하면 종료됩니다)");
					count = scan.next();
					if (count.equals("0")) {
						break;
					}
					name[i] = count;
					for (int j = 0; j < 3; j++) {
						System.out.println(subject[j] + "과목 점수를 입력하세요");
						score[i][j] = scan.nextInt();

					}
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
					avg[i] = score[i][3] / 3.0;
					number++;
					System.out.println((i + 1) + "번째의 학생성적이 입력되었습니다");
				}
				

				break;
			case 2:
				System.out.println("학생정보출력란");
				System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
				for(int i = 0; i < number; i++) {
					System.out.print(name[i] + "\t");
					for(int j = 0; j <  score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.printf("%.2f \n", avg[i]);
				}

				break;

			case 3:
				System.out.println("----->학생성적검색.");
				break;
			case 4:
				System.out.println("----->학생성적검색.");
				break;
			case 0:// 이부분은 while문을 빠져 나와야한다
				System.out.println("프로그램종류.");
				// 프로그램 추가

				break loop1;// loop1을 통해서 loop문을 벗어난다

			default:
				System.out.println("번호를 잘못입력했습니다 다시입력해주세요");
				break;

			}
		}
	}

}