package ex0512;

import java.util.Scanner;

public class ex0512_5 {

	public static void main(String[] args) {
		//성적표
		//3명에게서 이름 국어점수 영어점수 수학점수 사회점수 입력받아서 
		//이름 국어점수 영어점수 수학점수 사회점수 합계 평균을 출력하시오
		//1. 입력 scan
		//2.3명 배열이 3개이다 
		//3. 배열 3개를 입력하려면 for문을 쓴다
		//4.배열을 받은 것을 출력한다
		
		Scanner scan = new Scanner(System.in);//입력
		
		String [] name = new String[3];//배열선언
		int [] kor = new int[3];
		int [] eng = new int[3];
		int [] math = new int[3];
		int [] soci = new int[3];
		int [] sum = new int[3];
		double [] avg = new double[3];
		//입력
		for(int i=0; i<name.length; i++) {
			System.out.println("이름을 입력하시오");
			name[i] = scan.next();
			System.out.println("국어점수를 입력하시오");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력하시오");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력하시오");
			math[i] = scan.nextInt();
			System.out.println("사회점수를 입력하시오");
			soci[i] = scan.nextInt();
			
			sum[i] = kor[1] + eng[1] + math[i] + soci[i];
			avg[i] = sum[i]/4.0;
		}
		//출력
		for(int i=0; i<name.length;i++) {
			System.out.printf("이름은 : %s 국어점수는 %d점 영어점수는 %d점 수학점수는 %d점 사회점수는 %d점 합계는 %d 평균 %.2f \n",name[i],kor[i],eng[i],math[i],soci[i],sum[i],avg[i]);
		}
		
	
	}
}
