package ex0514;

import java.util.Scanner;
//주석
public class ex0514_4_par {

	// 수정

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] name = new String[10];
		int[][] score = new int[10][4]; // 합계 포함
		String[] subject = { "국어", "영어", "수학" };
		double[] avg = new double[10];
		int count = 0; // 학생성적을 몇명 입력했는지 확인하는 변수
		String check = ""; // 0또는 학생이름 확인 변수
		int searchNum = 0; // 학생성적수정에 사용하는 변수

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

			int choice = scan.nextInt();

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
					System.out.println((i + 1) + "번째의 학생성적이 입력되었습니다");
				}

				break;
			case 2:// 프로그램 수정
				System.out.println("------->학생성적수정.");
				//먼저 누구를 수정하고싶은지 찾아야한다
				//그것을 학생이름으로 찾았다(보통 프라이머리키로 잡는다)
				System.out.println("수정할 학생이름을 입력하세요.(상위메뉴이동:0)>>");
				check = scan.next();
				//입력한 내용이 0번이라면 빠져 나온다
				if (check.equals("0")) {
					System.out.println("상위메뉴로 이동합니다.!");
					break;
				}
				searchNum = -1;// 해당학생이 있는지 없는지 확인 배열은 숫자 0부터 시작하기 떄문에 초깃값을 -1로준다.
				// 해당학생검색
				for (int i = 0; i < count; i++) {
					if (check.equals(name[i])) {
						searchNum = i; //배열에는 0도 포함이다 초깃값이 0으로 되어있어 0부터 시작을한다
					}
				}
				// 해당학생이 없을시 -1일 경우 값과 일치해서 학생이없다는 값을 나오고 break로 case문을 빠져나온다
				if (searchNum == -1) {
					System.out.println("해당학생이 없습니다");
					break; // 스위치문을 빠져나온다
				}
				// 해당학생이 있을시
				System.out.println(check + "해당학생을 찾았습니다.!");
				// 해당학생이 있으면 무슨과목을 수정할지 입력을하게 한다
				System.out.println("[ 수정할 과목 ]을 선택하세요");
				System.out.println("0.국어 1.영어 2.수학");//0,1,2로 설정을 해도된다 
				System.out.println("수정할 과목 번호를 입력하세요.>>");
				int sNum = scan.nextInt();
				// 1번이 입력됬을때 ->subject[0]=국어
				// System.out.println(subject[0]+"현재 점수: " +score[0][0]);
				// 국어현재점수 : score[0][0] -> 국어현재점수 100점
				System.out.println(subject[sNum - 1] + "현재 점수 : " + score[searchNum][sNum - 1]);// 현재점수를
																											// 알수있다.
																											// subject[]
																											// 과목 정보
																											// score[][]
																											// 점수 정보
				System.out.println("수정할 정수 입력: ");
				score[searchNum][sNum - 1] = scan.nextInt();// 점수가 들어있는 배열에다가 바로 입력값을 넣는다.
				// 단 합계는 변하지 않으니 합계를 다시 정해준다
				score[searchNum][3] = score[searchNum][0] + score[searchNum][1] + score[searchNum][2]; // 합계 수정 정보입력에 썻던
																										// 코드와 똑같다
				avg[searchNum] = score[searchNum][3] / 3.0;// 평균 수정
				System.out.println("수정이 완료되었습니다");

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
