package ex0517;

import java.util.Scanner;

public class ex0517_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menuNumber = 0;
		String[] studentName = new String[5];
		int[][] studentScore = new int[5][4];
		double[] scoreAvg = new double[5];
		String[] subject = { "국어", "영어", "수학" };
		int studentCount = 0;
		String studentName1 = "";
		int checkNumber = -1;
		int checkNumber1 = 0;
		int[] rank = new int[5];

		loop: while (true) {
			System.out.println("---------------------------------");
			System.out.println("1.학생정보입력");
			System.out.println("2.학생정보출력");
			System.out.println("3.학생정보수정");
			System.out.println("4.학생정보검색");
			System.out.println("5.등수처리");
			System.out.println("0.프로그램 종료");
			System.out.println("------------------------------------");
			System.out.println("원하는 번호를 입력하세요");

			menuNumber = scan.nextInt();

			switch (menuNumber) {
			case 1:
				System.out.println("학생성적입력");
				for (int i = studentCount; i < studentName.length; i++) {
					System.out.println("학생이름을 입력하세요.0을 누르면 나가집니다");
					studentName[i] = scan.next();
					if (studentName[i].equals("0")) {
						System.out.println("상위메뉴로 나가집니다");
						break;
					}

					for (int j = 0; j < 3; j++) {
						System.out.println(subject[j] + "과목점수를 입력하세요");
						studentScore[i][j] = scan.nextInt();
						studentScore[i][3] += studentScore[i][j];
						scoreAvg[i] = studentScore[i][3] / 3.0;
					}
					studentCount++;
				}
				System.out.println("학생성적정보를 입력하였습니다");

				break;

			case 2:
				System.out.println("학생성적출력");
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t순번");
				for (int i = 0; i < studentCount; i++) {
					System.out.print(studentName[i] + "\t");
					for (int j = 0; j < 4; j++) {
						System.out.print(studentScore[i][j] + "\t");
					}
					System.out.printf("%.2f \t", scoreAvg[i]);
					System.out.print(rank[i] + "\n");
				}
				break;
			case 3:
				//수정
				System.out.println("학생성적수정");
				System.out.println("학생이름을 입력해주세요");
				studentName1 = scan.next();
				for (int i = 0; i < studentName.length; i++) {
					if (studentName1.equals(studentName[i])) {
						checkNumber = i; // score[i][]
						break;
					}
				}
				if (checkNumber == -1) {
					System.out.println("찾는 이름이 없습니다");
				}
				System.out.println("[수정할 과목 선택]");
				System.out.println("[0.국어 1.영어 2.수학]");
				System.out.println("[원하는 번호를 입력하세요]");
				checkNumber1 = scan.nextInt(); // score[][j]
				System.out.println(studentName[checkNumber] + "의" + subject[checkNumber1] + "점수:"
						+ studentScore[checkNumber][checkNumber1]);
				System.out.println("[수정할 점수를 입력하세요]");
				studentScore[checkNumber][checkNumber1] = scan.nextInt();
				studentScore[checkNumber][3] = studentScore[checkNumber][0] + studentScore[checkNumber][1]
						+ studentScore[checkNumber][2];
				scoreAvg[checkNumber] = studentScore[checkNumber][3] / 3.0;

				break;
			case 4:
				System.out.println("학생성적검색");
				System.out.println("학생이름을 입력해주세요");
				String searchName = scan.next();
				int count = 0;
				int[] search_num = new int[5];
				// 이름검색
				search_num[0] = -1;
				for (int i = 0; i < studentName.length; i++) {
					if (studentName[i].contains(searchName)) {
						search_num[i] = i;
						count++;
					} else {
					}
				}

				System.out.println("일치 갯수:" + count + "개\t");
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				for (int j = 0; j < count; j++) {
					System.out.print("[" + studentName[j] + "]\t");
					for (int a = 0; a < 4; a++) {
						System.out.print(studentScore[j][a] + "\t");
					}
					System.out.print(scoreAvg[j] + "\n");
				}

				break;
			case 5:
				System.out.println("등수처리");

				for (int i = 0; i < studentCount; i++) { // 2개를 비교하는것이기 때문에 배열의 크기는 똑같다
					int rankNum = 1;// 등수는 1부터 시작한다.
					for (int j = 0; j < studentCount; j++) {
						if (studentScore[i][3] < studentScore[j][3]) {// 합계를 비교한다
							rankNum++;// 1씩 추가한다
						}
					}
					rank[i] = rankNum;

				}

				System.out.println("[등수처리가 완료되었습니다]");
				break;
			case 0:
				System.out.println("프로그램 종료");
				break loop;

			default:
				System.out.println("잘못입력하셨습니다");
				break;
			}

		}
	}
}
