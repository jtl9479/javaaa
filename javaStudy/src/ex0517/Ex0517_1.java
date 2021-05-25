package ex0517;

import java.util.Scanner;

public class Ex0517_1 {

	public static void main(String[] args) {
		// 1.배열 선언,화면글자 출력
		// 2.학생성적추가,학생정적출력,학생성적수정,학생성적검색,등수처리,종류 순으로 진행
		// 먼저 큰틀부터 만든다
		// 변수 학생이름,국어,영어,수학,합계,평균,등수 를 만든다

		// 1.글자 출력

		Scanner scan = new Scanner(System.in);
		int menu = 0;// 메뉴 번호 입력 함수
		String[] name = new String[5]; // 학생이름에 대한배열
		int[][] score = new int[5][3];// 학생성적에 대한 배열
		String[] subject = { "국어", "영어", "수학" };// 과목
		int[] sum = new int[5];// 합계
		double[] avg = new double[5];// 평균
		int count = 0;
		int[] rank = new int[5];
		
		loop: while (true) {
			System.out.println("학생성적 정보 시스템");
			System.out.println("------------------------");
			System.out.println("1.학생성적 입력");
			System.out.println("2.학생성적 출력");
			System.out.println("3.학생성적 수정");
			System.out.println("4.학생성적 검색");
			System.out.println("5.등수처리");
			System.out.println("0.시스템 종료");
			System.out.println("------------------------");
			menu = scan.nextInt();

			switch (menu) {
			case 1:// 학생정보 입력
				System.out.println("학생정보를 입력하세요");
				// 먼저 이름을 입력하고 이름에대한 배열을 생성한다.
				// 과목 성적을 입력한다.과목에대한 배열도 생성한다.
				// 여러번을 입력해야할때는 반복문을 사용한다.

				for (int i = count; i < name.length; i++) {
					System.out.println("학생이름을 입력하세요,0을 입력하면 상위메뉴로 이동합니다");
					name[i] = scan.next();// 학생이름을 scan으로 받는다
					if (name[i].equals("0")) {// 학생수를 그만 입력하고 싶을때
						System.out.println("상위 메뉴로 이동합니다");
						break;
					}
					for (int j = 0; j < score[i].length; j++) {// score의 length는 i값이라면 score[i]의 length는 j이다
						System.out.println(subject[j] + "과목점수를 입력하세요");
						score[i][j] = scan.nextInt();// 과목 점수의 값을 가진다.
						sum[i] += score[i][j];// 합계
						avg[i] = sum[i] / 3.0;// 평균
					}
					count++;// count를 사용하는 이유는 중간에 정보를 입력하다 중단하고 나갔다가 다시 입력할떄 이어서 사용하기 위헤서이다
				}
				break;

			case 2:
				System.out.println("학생정보를 출력하세요");
				// 학생정보를 출력할때는
				// 배열안에 있는 모든 값을 출력해야하기 때문에 for문을 통해서 출력을 시킨다.

				System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
				for (int i = 0; i < count; i++) {
					System.out.print(count + "\t" + name[i] + "\t");// 이름과 번호를 출력한다
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.print(sum[i] + "\t");
					System.out.printf("%.2f\t",avg[i]);
					System.out.println(rank[i]);

				}

				break;

			case 3:
				System.out.println("학생정보를 수정하세요");
				//이름을가지고 검색을한다.
				//검색한것을가지고 비교해서 있으면 과목을 선택해서 정보를 바꾼다
				//만약에 정보가 없으면 일치하지 않는다는 알림을 출력한다.
				System.out.println("학생이름을 입력하세요");
				String Search_Name = scan.next();
				int Search_Number = -1;  //score[i][j] 중 score[i]에 해당
				int Search_Number1 = 0; //score[i][j] 중 score[j]에 해당

				for(int i=0; i<count; i++) {
					if(Search_Name.equals(name[i])) {
						Search_Number=i;//score[i][j]중 score[i]에 해당한다
					}
				}
				
				if(Search_Number == -1) {
					System.out.println("맞는 이름이 없습니다. 다시입력해주세요");
					break;
				}
				System.out.println(name[Search_Number]+"님의 성적을 수정합니다");
				System.out.println("수정할 과목을 선택해 주세요");
				System.out.println("1.국어 2.영어 3.수학");
				Search_Number1 = scan.nextInt();//과목배열을 받는다
				System.out.println("현재 "+subject[Search_Number1-1]+"점수는" +score[Search_Number][Search_Number1-1]+"입니다");
				System.out.println("수정할 점수를 입력해주세요");
				score[Search_Number][Search_Number1-1] = scan.nextInt();//수정할 점수를 받는다.
				sum[Search_Number] =score[Search_Number][0]+score[Search_Number][1]+score[Search_Number][2];//합계
				avg[Search_Number] = sum[Search_Number]/3.0; //평균
				System.out.println("정보가 수정되었습니다");
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println(name[Search_Number]+"\t"+score[Search_Number][0]+"\t"+score[Search_Number][1]+"\t"+score[Search_Number][2]+"\t"+sum[Search_Number]+"\t"+avg[Search_Number]);

				break;

			case 4:
				System.out.println("학생정보를 검색하세요");
				//이름을가지고 검색을 진행한다.
				//이름을 입력받고 반복문으로 이름이 같은것이 있나확인한다.
				//같은이름이 없다면 없어요 라고 말을한다.
				//있다면 그것에 해당하는 정보만 출력 시킨다.
				int Search_Number2 = -1;  //score[i][j] 중 score[i]에 해당
				System.out.println("검색하고싶은 학생이름을 입력하세요");
				Search_Name=scan.next();
				
				for(int i=0; i<count; i++) {
					if(Search_Name.equals(name[i])) {
						Search_Number2=i;
					}
				}
				if(Search_Number2==-1) {
					System.out.println("정보에 일치하는 이름이 없습니다");
					break;
				}
				
				
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
					System.out.print(name[Search_Number2]+"\t");
					for(int j=0; j<3; j++) {
						System.out.print(score[Search_Number2][j]+"\t");
				}
					System.out.print(sum[Search_Number2]+"\t");
					System.out.println(avg[Search_Number2]);
			

				break;

			case 5:
				System.out.println("학생정보를 등수처리하세요");
				//등수 처리 평균을 가지고 비교한다.
				//비교할떄는 for문 2개를 써서 서로 비교한다.
				//로또 할때 한것
				for(int i=0; i<count; i++) {
					int rankCount = 1;
					for(int j=0; j<count; j++) {
						if(avg[i]<avg[j]) {
							rankCount++;
						}
					}rank[i]=rankCount;
				}
				System.out.println("등수처리 되었습니다");
				
				
				
				break;

			case 0:
				System.out.println("시스템을 종료합니다");
				break loop;

			default:
				System.out.println("잘못입력하셨습니다");
				break;
			}

		}

}}
