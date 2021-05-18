package ex0517;

import java.util.Scanner;

public class ex0517_1 {

	public static void main(String[] args) {
		// 1.배열 선언,화면글자 출력
		// 2.학생성적추가,학생정적출력,학생성적수정,학생성적검색,등수처리,종류 순으로 진행
		// 먼저 큰틀부터 만든다
		// 변수 학생이름,국어,영어,수학,합계,평균,등수 를 만든다

		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[5][4];// 과목,합계 포함
		double[] avg = new double[5];// 평균
		int[] rank = new int[5];// 등수
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" }; // 출력햐여할것
		int choice = 0; // 선택번호변수
		int count = 0; // 학생입력수 카운트 기능
		String checkName = ""; // 찾고자하는 이름의 변수
		int checkNumber = 0; // 찾는 변호의 변수
		int checkNumber1 = 0;

		loop: while (true) {// 무한반복문을 벗어나고 싶을때
			System.out.println("----------------------------");
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("----------------------------");
			System.out.println("[1.학생성적입력]");
			System.out.println("[2.학생성적출력]");
			System.out.println("[3.학생성적수정]");
			System.out.println("[4.학생성적검색]");
			System.out.println("[5.학생성적등수정렬]");
			System.out.println("[6.종료]");
			System.out.println("-----------------------------");
			System.out.println("[원하는 번호를 입력하세요]");
			choice = scan.nextInt(); // 메뉴 목록

			switch (choice) {

			case 1:// 학생정보입력
				System.out.println("[1.학생성적입력 메뉴]");
				// 1.이름,국어,영어,수학 ->합계,평균
				for (int i = count; i < 5; i++) {
					System.out.println("[이름을 입력하세요.(0을 누르면 상위메뉴이동)>>]");
					name[i] = scan.next();
					if (name[i].equals("0")) {
						System.out.println("[상위메뉴로 이동합니다]");
						break;
					}
					for (int j = 0; j < score[i].length - 1; j++) {
						System.out.println("[" + title[j + 1] + "점수를 입력하세요.>>]");
						score[i][j] = scan.nextInt();
					}

					score[i][3] = score[i][0] + score[i][1] + score[i][2];// 합계
					avg[i] = score[i][3] / 3.0; // 평균
					count++;// 학생 1명씩 증가
				}

				break;

			case 2:// 학생정보출력
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");// 이름,과목,합계,평균 출력
				}
				System.out.println("-----------------------------------------");// 이름 출력
				for (int i = 0; i < count; i++) {// 학생의 인원수만큼 돌아간다.
					System.out.print(name[i] + "\t");
					// 이름 츨력
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					// 평균
					System.out.printf("%.2f \t", avg[i]);
					// 등수
					System.out.print(rank[i] + "\n");
				}

				break;

			case 3:// 학생정보수정
					// 수정할 학생의 이름을 입력하세요.>어떤 과목을 수정>점수 수정
				System.out.println("[수정할 학생의 이름을 입력하세요.>>]");
				checkName = scan.next();
				// 이름검색
				checkNumber = -1;//
				for (int i = 0; i < name.length; i++) {
					if (checkName.equals(name[i])) {
						checkNumber = i;
						break;// 찾으면 for문 종료
					}
				}
				if (checkNumber == -1) {// 찾고자하는 이름이 없을시
					System.out.println("[찾고자 하는 이름이 없습니다]");
					break;
				}
				System.out.println("[수정할 과목 선택]");
				System.out.println("[0.국어 1.영어 2.수학]");
				System.out.println("[원하는 번호를 입력하세요]");
				checkNumber1 = scan.nextInt();
				System.out.println("[현재 점수]");
				System.out.println(title[checkNumber1 + 1] + ":" + score[checkNumber][checkNumber1] + "");
				System.out.println("[수정정수 입력 : ]");
				score[checkNumber][checkNumber1] = scan.nextInt();

				score[checkNumber][3] = score[checkNumber][0] + score[checkNumber][1] + score[checkNumber][2];
				avg[checkNumber] = score[checkNumber][3] / 3.0;
				System.out.println("[수정이 완료되었습니다]");

				break;

			case 4:// 학생정보검색
				System.out.println("[검색할 학생의 이름을 입력하세요.>>]");
				checkName = scan.next();
				// 이름검색
				checkNumber = -1;//
				for (int i = 0; i < name.length; i++) {
					if (checkName.equals(name[i])) {
						checkNumber = i;
						break;// 찾으면 for문 종료
					}
				}
				if (checkNumber == -1) {// 찾고자하는 이름이 없을시
					System.out.println("[찾고자 하는 학생이 없습니다]");
					break;
				} // case 3의 학생이름 찾기 구문과 같다.

				// 찾은 학생 출력
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");// 이름,과목,합계,평균 출력
				}
				System.out.println("-----------------------------------------");// 이름 출력
				// 이름 츨력
				for (int i = checkNumber; i < checkNumber + 1; i++) {// 학생의 인원수만큼 돌아간다.
					System.out.print(name[i] + "\t");
					// 점수 출력
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					// 평균
					System.out.printf("%.2f \t", avg[i]);
					// 등수
					System.out.print(rank[i] + "\n");
				}
				break;

			case 5:// 학생등수처리
					// 등수처리를 분리하는이유는
					// 등수처리할 인원수가 작을때는 괜찮지만 수가 늘어나면 프로그래밍 처리 속도가 오래걸려서이다.

				for (int i = 0; i < count; i++) { // 2개를 비교하는것이기 때문에 배열의 크기는 똑같다
					int rankNum = 1;// 등수는 1부터 시작한다.
					for (int j = 0; j < count; j++) {
						if (score[i][3] < score[j][3]) {// 합계를 비교한다
							rankNum++;// 1씩 추가한다
						}
					}
					rank[i] = rankNum;

				}
				System.out.println("[등수처리가 완료되었습니다]");

				break;

			case 6:// 종류
				System.out.println("< 프로그램종류 메뉴>");
				break loop;// case6이 선택되면 무한반복문while문을 벗어나게 된다

			default:// 해당하는값이없습니다

				break;

			}

		}

	}
}
