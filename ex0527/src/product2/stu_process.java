package product2;

import java.util.ArrayList;
import java.util.Scanner;

public class stu_process {

	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	
	// 메소드
	stu_process() {
	}

	void Main_Menu() {

		System.out.println("==========================");
		System.out.println("학생성적입력시스템");
		System.out.println("1.학생성적입력");
		System.out.println("2.학생성적출력");
		System.out.println("3.학생성적수정");
		System.out.println("4.학생성적검색");
		System.out.println("5.등수처리");
		System.out.println("0.프로그램종료");
		System.out.println("원하는 번호를 선택하세요");
		System.out.println("==========================");
	}// main

	void stu_Input(stu s) {
		System.out.println("학생성적 입력");
		String name;
		for (int i = stu.count; i < list.size(); i++) {
			System.out.println("학생이름을 입력해주세요.");
			System.out.println("0을 누르면 상위메뉴로 이동합니다");
			name = scan.next();
			if (name.equals("0")) {
				System.out.println("상위메뉴로 이동합니다");
				break;
			}
			System.out.println("국어점수를 입력해주세요");
			int kor = scan.nextInt();

			System.out.println("수학점수를 입력해주세요");
			int math = scan.nextInt();

			System.out.println("영어점수를 입력해주세요");
			int eng = scan.nextInt();

//			s[i] = new stu(name, kor, math, eng);
//			s[i] = new stu(name, kor, math);
			list.add( new stu(name, kor, math, eng));
			System.out.println(stu.count + "번째 입력되었습니다");
		}
	}// 입력

	void Out_top() {
		System.out.println("번호\t이름\t국어\t수학\t영어\t합계\t평균\t순위");
	}

	void stu_Output(stu s) {
		Out_top();
		for (int i = 0; i < stu.count; i++) {
			System.out.print(list.get(s.getStu_count())+ "\t");
			//System.out.print(list.get(s.getName()) + "\t");
			System.out.print(list.get(s.getKor()) + "\t");
			System.out.print(list.get(s.getMath())+ "\t");
			System.out.print(list.get(s.getEng())+ "\t");
			System.out.print(list.get(s.getSum())+ "\t");
			//System.out.printf("%.2f \t", list.get(s.getAvg()));
			System.out.print(list.get(s.getRank()) + "\n");

		}
	}// 출력

	// 수정
//	void stu_Update(stu s) {
//		//학생 홍길동 추가 100 100 99 자동으로 합계 평균이 들어간다.
//		//
//		System.out.println("수정할 학생 이름을 입력하세요.>>");
//		//홍길동
//		//있는지 없는지 검색
//		//있다 -> 수정할 과목 선택.>> 1.국어 2.수학 3.영아
//		//원하는 과목을 선택
//		//현제 점수 
//		//없다 -> 아웃
//		
//
//		// 이름검색
//		String name;
//		int num1 = -1;
//		int num2 = 0;
//		int num3 = 0;
//		int num4 = 0;
//		System.out.println("이름을 입력하세요");
//		name = scan.next();
//
//		for (int i = 0; i < stu.count; i++) {
//			if (s[i].getName().contains(name)) {
//				num1 = i;
//				System.out.println(i + ". " + s[i].getName());
//			}
//		}
//		if (num1 != -1) {
//			System.out.println("해당 이름 번호를 입력해주세요");
//			num2 = scan.nextInt();// i값
//			System.out.println(s[num2].getName() + "입니다");
//			System.out.println("수정할 과목을 선택하세요");
//			System.out.println("1.국어 2.수학 3. 영어");
//			num3 = scan.nextInt();
//
//			switch (num3) {
//			case 1:
//				System.out.println("현재 국어점수는 " + s[num2].getKor() + " 입니다");
//				System.out.println("수정할 점수를 입력하세요");
//				num4 = scan.nextInt();
//				s[num2].setKor(num4);
//				break;
//			case 2:
//				System.out.println("현재 수학점수는 " + s[num2].getMath() + " 입니다");
//				System.out.println("수정할 점수를 입력하세요");
//				num4 = scan.nextInt();
//				s[num2].setMath(num4);
//				break;
//			case 3:
//				System.out.println("현재 영어점수는 " + s[num2].getEng() + " 입니다");
//				System.out.println("수정할 점수를 입력하세요");
//				num4 = scan.nextInt();
//				s[num2].setEng(num4);
//				break;
//
//			default:
//				System.out.println("다른 번호입니다");
//				break;
//			}
//			s[num2].setSum(s[num2].getKor() + s[num2].getMath() + s[num2].getEng());
//			s[num2].setAvg(s[num2].getSum() / 3.0);
//			System.out.println("수정이 완료되었습니다");
//			Out_top();
//			System.out.print(s[num2].getStu_count() + "\t");
//			System.out.print(s[num2].getName() + "\t");
//			System.out.print(s[num2].getKor() + "\t");
//			System.out.print(s[num2].getMath() + "\t");
//			System.out.print(s[num2].getEng() + "\t");
//			System.out.print(s[num2].getSum() + "\t");
//			System.out.printf("%.2f \t", s[num2].getAvg());
//			System.out.print(s[num2].getRank() + "\n");
//		} else {
//			System.out.println("해당하는 번호가 없습니다");
//		}
//	}
//
//	void stu_Search(stu s) {
//		String name;
//		int num1 = -1;
//		int num2 = 0;
//		System.out.println("이름을 입력하세요");
//		name = scan.next();
//
//		for (int i = 0; i < stu.count; i++) {
//			if (s[i].getName().contains(name)) {
//				num1 = i;
//				System.out.println(i + ". " + s[i].getName());
//			}
//		}
//		if (num1 != -1) {
//			System.out.println("해당 이름 번호를 입력해주세요");
//			num2 = scan.nextInt();// i값
//			Out_top();
//			System.out.print(s[num2].getStu_count() + "\t");
//			System.out.print(s[num2].getName() + "\t");
//			System.out.print(s[num2].getKor() + "\t");
//			System.out.print(s[num2].getMath() + "\t");
//			System.out.print(s[num2].getEng() + "\t");
//			System.out.print(s[num2].getSum() + "\t");
//			System.out.printf("%.2f \t", s[num2].getAvg());
//			System.out.print(s[num2].getRank() + "\n");
//		} else {
//			System.out.println("해당하는 번호가 없습니다");
//		}
//	}
//
//	void stu_Rank(stu s) {
//		for(int i=0; i<stu.count; i++) {
//			int count = 1;
//			for(int j=0; j<stu.count; j++) {
//				if(s[i].getSum() < s[j].getSum()) {
//					count++;
//				}
//			}
//			s[i].setRank(count);
//		}
//		
//	}
	
	
	
	
}// class
