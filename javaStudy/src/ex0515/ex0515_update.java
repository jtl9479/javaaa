package ex0515;

import java.util.Scanner;

public class ex0515_update {
	public static void main(String[] args) {
		// 뼈대를 잡기
		// while문을 무한 루프 시켜서 메뉴창이 작동되게한다
		// 메뉴창은 case문을 이동해서 해당 메뉴창으로 이동을 할수있게만든다.
		// case1학생입력 case2 정보 출력
		// 변수는 scanner 아래에 작성해서 전역변수로써 활용한다
		Scanner scan = new Scanner(System.in);
		int menuNumber = 0; // 메뉴창 이동변수
		String[] name = new String[5];// 이름배열
		int[][] score = new int[5][4];// 과목,합겨 점수 배열
		double[] avg = new double[5];// 평균 배열
		String[] subject = { "국어", "영어", "수학" };
		int count = 0;
		String nameUpdate = ""; //수정할 이름을 받는 변수
		loop: while (true) {// 메뉴창
			System.out.println("[1.학생정보입력란]");
			System.out.println("[2.학생정보출력란]");
			System.out.println("[0.프로그램 종료]");
			menuNumber = scan.nextInt(); // 해당하는 숫자를 누르면 이동한다

			switch (menuNumber) {
			case 1:// 학생정보입력란
				System.out.println("[학생정보입력란 입니다]");
				System.out.println("[학생정보를 입력해주세요]");

				for (int i = count; i < 5; i++) {
					System.out.println((i + 1) + "번째 이름을 입력해주세요.0을 누르면 나가집니다");
					name[i] = scan.next();
					if (name[i].equals("0")) {
						break;
					}
					for (int j = 0; j < 3; j++) {
						System.out.println(subject[j] + "점수를 입력하세요");
						score[i][j] = scan.nextInt();
						score[i][3] += score[i][j];
						avg[i] = score[i][3] / 3.0;
					}count++;
				}
				
				break;

			case 2:// 학생정보출력란
				System.out.println("[학생정보출력란 입니다]");
				System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
				for (int i = 0; i < count; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < 4; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.println(avg[i]);
				}

				break;
				
			case 3://학생정보 수정
				System.out.println("[학생정보 수정란 입니다]");
				System.out.println("[수정할 학생이름을 입력하세요.0을 누르면 종료됩니다]");
				nameUpdate = scan.next();
				for(int i=0; i<5; i++) {
					name[i] = nameUpdate;
					if(nameUpdate.equals("0")) {
						break;
					}
					for(int j=0; j<3; j++) {
						System.out.printf("");
					}
				}
				

			case 0:// 메뉴창으로 이동
				System.out.println("[종료합니다]");
				break loop;// loop를 사용하면 while문이 종료된다
			default:// 잘못입력되었을경우의 경고창
				System.out.println("[잘못입력하셨습니다]");
				break;
			}

		}
	}
}

