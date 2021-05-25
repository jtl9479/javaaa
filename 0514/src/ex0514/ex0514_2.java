package ex0514;

import java.util.Scanner;

public class ex0514_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[][] score = new int[3][4];
		String[] subject = {"국어","영어","수학"};
		double[] avg = new double[3];
		
		loop1 : while(true) {
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
				System.out.println("------>학생성적추가.");
				//3명의 학생 국어,영어,수학 점수를 입력 받아 합계 평균을 출력하시오
				//프로그램 추가
				for(int i=0; i<3; i++) {
					System.out.println("학생이름을 입력하시오");
					name[i]=scan.next();
					for(int j=0; j<3;j++) {
						System.out.print(subject[j]+"과목점수를 입력하세요 \n");
						score[i][j] = scan.nextInt();
					}
					score[i][3] = score[i][0]+score[i][1]+score[i][2]; 
					avg[i] = score[i][3]/3.0;
				}
				break;

			case 2:
				System.out.println("------->학생성적수정.");
				//프로그램 추가
				
				break;
			
			case 3:
				System.out.println("------> 학생성적출력.");
				System.out.println("이름\t국어점수\t영어점수\t수학점수\t합계\t평균\t");
				for(int i=0; i<name.length; i++) {
					System.out.print(name[i]+"\t");
					for(int j=0; j<4; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.printf("%.2f",avg[i]);
					System.out.println();
				}
				//프로그램 추가
				break;

			case 4:
				System.out.println("----->학생성적검색.");
				//프로그램 추가
				
				break;
		
			case 0://이부분은 while문을 빠져 나와야한다
				System.out.println("프로그램종류.");
				//프로그램 추가
				
				break loop1;//loop1을 통해서 loop문을 벗어난다
				
			default:
				System.out.println("번호를 잘못입력했습니다 다시입력해주세요");
				break;
			}//swicth
		}//while
	}//main
}//class
