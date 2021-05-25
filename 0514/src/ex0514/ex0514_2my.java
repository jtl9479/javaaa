package ex0514;

import java.util.Scanner;

public class ex0514_2my {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇명의 정보를 입력할것입니까?");
		
		int person = scan.nextInt();
		
			
		loop1: while (true) {
			System.out.println("---------------------------------");
			System.out.println("[학생성적처리 프로그램 ]");
			System.out.println("---------------------------------");
			System.out.println("1.학생성적추가");
			System.out.println("2.학생성적수정");
			System.out.println("3.학생성적출력");
			System.out.println("4.학생성적검색");
			System.out.println("0.프로그램종류");
			System.out.println("-----------------------------------");
			System.out.println("원하는 번호를 입력하세요");

			String[] name = new String[person];
			int[][] score = new int[person][4]; // 합계 포함
			String[] subject = { "국어", "영어", "수학" };
			double[] avg = new double[person];
			int count = 0; // 학생성적을 몇명 입력했는지 확인하는 변수
			int choice = scan.nextInt();
			String check = "";
			

			switch (choice) {
			case 1:
				System.out.println("[  학생성적추가 메뉴  ]");
				// 3명의 학생 국어,영어,수학 점수를 입력 받아 합계 평균을 출력하시오
				// 프로그램 추가
				for (int i = count; i < name.length; i++) {// 초기값을 0이 아니라 count로 주는 이유가 1명을 검색하고 나갔을때 초깃값이 0이면 다시 처음부터
															// 입력을하게 된다 그래서 카운터로 주면 갯수가 카운터에 ㅓ장되 그 이후부터 값이 저장된더
					System.out.println("학생이름을 입력하세요..(상위메뉴이동:0)>>");
					check = scan.next();
					// 0이 입력되었는지 확인
					if (check.equals("0")) {// check가 0이랑 같으묜
						System.out.println("상위 매뉴로 이동합니다");
						break;
					}
					name[i] = check;

					for (int j = 0; j < 3; j++) {
						System.out.println(subject[j] + "과목점수를 입력하세요..-->");
						score[i][j] = scan.nextInt();
					}
					score[i][3] = score[i][0] + score[i][1] + score[i][2];// 합계
					avg[i] = score[i][3] / 3.0;// 평균
					count++; // 학생정보를 입력할때마다 1명씩 추가된다.
					if((person-i-1) == 0) {
						System.out.println("입력할수 있는 칸이 없습니다");
					}else {
						System.out.println((i + 1) + "번째의 학생성적이 입력되었습니다 \n"+(person-i-1)+"번을 입력할수있습니다");
					}
				}
				
				break;
			case 2:
				System.out.println("------->학생성적수정.");
				// 프로그램 추가

				break;
			case 3:
				System.out.println("------> 학생성적출력.");
				// 프로그램 추가
				System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("---------------------------------");
				for (int i = 0; i < count; i++) {// 입력에서의 이유과 같다
					System.out.print(name[i] + "\t"); // 이름출력
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.printf("%.2f \n", avg[i]);// 평균
				}

				break;
			case 4:
				System.out.println("----->학생성적검색.");
				System.out.println("학생이름을 입력하세요");
				String name2 = scan.next();
				
			for(int a=0; a<name.length; a++) {
				if(name[a] ==name2) {
					System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
					System.out.println("---------------------------------");
					for (int i = 0; i < count; i++) {// 입력에서의 이유과 같다
						System.out.print(name[i] + "\t"); // 이름출력
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						System.out.printf("%.2f \n", avg[i]);// 평균
					}

				}else {
					System.out.println("잘못입력했습니다");
				}
			}
				// 프로그램 추가

				break;
			case 0:// 이부분은 while문을 빠져 나와야한다
				System.out.println("프로그램종류.");
				// 프로그램 추가

				break loop1;// loop1을 통해서 loop문을 벗어난다

			default:
				System.out.println("번호를 잘못입력했습니다 다시입력해주세요");
				break;
			}// swicth
		} // while
	}// main
}// class
