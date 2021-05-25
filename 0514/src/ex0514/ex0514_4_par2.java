package ex0514;

import java.util.Scanner;

public class ex0514_4_par2 {

	public static void main(String[] args) {
		// 3명의 배열 생성
		// 학생이름 국어,영어,수학 성적을 입력받아 -> 합계 평균을 출력하시오

		Scanner scan = new Scanner(System.in);

		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		String[] subject = { "국어", "영어", "수학" };
		int count = 0;
		String check =""; //0인지 확인하는 변수
		loop1:while (true) {
			System.out.println("[ 성적처리프로그램]");
			System.out.println("1.학생성적추가");
			System.out.println("2.학생성적수정");
			System.out.println("3.학생성적출력");
			System.out.println("원하는 번호를 입력하세요");
			int choice = scan.nextInt();
			String check_name="";//학생이름 검색변수
			int findnum = 0; //수정할 데이터 위치변수

			switch (choice) {
			case 1:
				System.out.println("[ 학생성적 추가 메뉴 ]");
				// 학생3명을 입력받아 바로 출력하세요
				for (int i = count; i < name.length; i++) {
					System.out.println((i + 1) + "번째학생의 이름을 입력해주세요.(0.상위메뉴이동)");
					check = scan.next();
					//0인지 아닌지확인
					if(check.equals("0")) {
						break;
					}
					name[i] = check; //원래는 name[i] = scan.next();였다 check를 넣은 이유는 0이면 상위메뉴로 보내기위한것을 if로 확인하기 위해서이다

					for (int j = 0; j < score[i].length - 1; j++) {
						System.out.println(subject[j] + "점수를 입력하세요.>>");
						score[i][j] = scan.nextInt();
						score[i][3] = score[i][1] + score[i][2] + score[i][0];
						avg[i] = score[i][3] / 3.0;
					}
					count++;
					System.out.println("입력칸이 " + (3 - count) + "번 남았습니다");
				}
				break;
				
			case 2:
				System.out.println("[ 학생성적수정 ]");
				System.out.println("수정할 학생이름을 입력하세요");
				check_name = scan.next();
				
				findnum=-1;
				for(int i=0; i<count;i++) {//name[i]와 check_name 비교
					if(check_name.equals(name[i])) {
						findnum = 1;
					}
				}
				if(findnum==-1) {
					System.out.println("데이터가 없습니다");
					break;
				}
				System.out.println("[ 수정과목 선택 ]");
				System.out.println("0.국어 1.영어 2.수학"); //선택할때 이름에서 i값을 구하고 여기서 j값을 구한다
				System.out.println("수정과목을 선택하세요.>>>");
				int subname = scan.nextInt();
				//score[findnum][subname]에 있는 값을 가지고온다.
				
				System.out.println("수정점수 입력: ");
				score[findnum][subname]=scan.nextInt();
				score[findnum][3]=score[findnum][1]+score[findnum][2]+score[findnum][0];
				avg[findnum] = score[findnum][3]/3.0; 
				
				break;
				
				

			case 3:
				System.out.println("[ 학생성적출력 메뉴 ]");
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t");
				for (int i = 0; i < count; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.printf("%.2f \n", avg[i]);
				}
				break;
			case 0:
				break loop1;

			default:
				break;
			}
		}
	}

}
