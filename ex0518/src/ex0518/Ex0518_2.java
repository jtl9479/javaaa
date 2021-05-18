package ex0518;

import java.util.Scanner;

public class Ex0518_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 이제부터는 객체선언을 하지않는다.

		// 객체배열 선언 아직 데이터를 넣을수는 없다
		Student[] s = new Student[3];

		// 3명의 학생의 성적입력
		for (int i = 0; i < s.length; i++) {

			
			s[i] = new Student();
			System.out.println("이름을 입력하세요.>>");

			// 객체를 먼저 선언하고 데이터 입력
			s[i].name = scan.next();

			// (점수입력 국어 영어 수학)
			for (int j = 0; j < s[0].score.length; j++) {
				System.out.println("점수를 입력하세요.>>");
				s[i].score[j] = scan.nextInt();
				//합계
				s[i].total = s[i].score[0] + s[i].score[1] + s[i].score[2];
				//평균
				s[i].avg = s[i].total / 3.0;
			}
			
		}
			
			
			//출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균");
			for (int i = 0; i < s.length; i++) {
				System.out.print(s[i].tu_number+"\t");//카운트가자동으로된다
				System.out.print(s[i].name+"\t");
				// (점수입력 국어 영어 수학)
				for (int j = 0; j < s[0].score.length; j++) {
					System.out.print(s[i].score[j]+"\t");
				}
				System.out.print(s[i].total+"\t");
				System.out.print(s[i].avg+"\n");
			}
		}

	}

