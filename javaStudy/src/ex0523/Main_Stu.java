package ex0523;

import java.util.Scanner;

public class Main_Stu {

	static Scanner scan = new Scanner(System.in);

	static String chk_Name;
	static int chk_num ;
	static int chk_num1 ;
	static int chk_num2 ;
	
	public static void main(String[] args) {
		Stu[] s = new Stu[10];

		loop : while (true) {

			Main_Menu();// 메인메뉴
			int Menu_Number = scan.nextInt();

			switch (Menu_Number) {
			case 1:// 학생성적입력
					// 사용변수

				Stu_Input(s);
				break;

			case 2:
				Stu_Output(s);
				break;

			case 3:
				Stu_Update(s);
				break;

			case 4:
				Stu_Search(s); 
				break;

			case 5:
				Stu_Rank(s);
				break;

			case 0:
				System.out.println("프로그램을 종료합니다");
				break loop;
			default:
				System.out.println("잘못입력헀습니다");
				break;
			}// switch
		} // while
	}// main
		// 여기다 메소드 작성

	// 메인메뉴
	static void Main_Menu() {
		System.out.println("------------------------------------");
		System.out.println("학생성적입력시스템");
		System.out.println("1.학생정보입력");
		System.out.println("2.학생정보출력");
		System.out.println("3.학생정보수정");
		System.out.println("4.학생정보검색");
		System.out.println("5.등수처리");
		System.out.println("0.프로그램종료");
		System.out.println("원하는 번호를 입력하세요");
		System.out.println("------------------------------------");
	}

	static void Stu_Input(Stu[] s) {// 이제 Stu 변수를 사용할수있다.
		// 이 메소드는 메인밖에 있는 메소드로 변수에 값을 보낼수는 있다.
		// 하지만 s.Stu_Kor 이란 변수를 직접적으로는 사용할수가 없어서 임의로 변수를 설정해야한다.
		System.out.println("학생정보입력");

		for (int i = Stu.count; i < s.length; i++) {
			System.out.println("이름을 입력하세요,0을 누르면 상위메뉴로 이동합니다");
			String name = scan.next();
			
			if(name.equals("0")) {
				System.out.println("상위 메뉴로 이동합니다");
				break;
			}
			
			System.out.println("국어점수를 입력하세요");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			int math = scan.nextInt();
			
			s[i] = new Stu(name,kor,eng,math);
			System.out.println(Stu.count+"명의 학생이 등록되었습니다");
		}
	}//Input
	
	//출력 메소드
	
	
	static void top() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t순위");
	}
	
	static void Stu_Output(Stu[] s) {//리턴값 없음
		//화면 출력
		top();
		for(int i=0; i<Stu.count; i++) {
			System.out.print(s[i].stu_number+"\t");
			System.out.print(s[i].Stu_Name+"\t");
			System.out.print(s[i].Stu_Kor+"\t");
			System.out.print(s[i].Stu_eng+"\t");
			System.out.print(s[i].Stu_Math+"\t");
			System.out.print(s[i].Stu_Sum+"\t");
			System.out.print(s[i].Stu_Avg+"\t");
			System.out.print(s[i].Stu_rank+"\n");
		}
	}//Output
	
	//수정
	static void Stu_Update(Stu[] s) {
		//이름검색
		System.out.println("학생성적 수정");
		System.out.println("이름을 입력하세요");
		chk_Name=scan.next();
		chk_num = -1;
		chk_num1 = 0;
		chk_num2 = 0;
		for(int i=0; i<Stu.count; i++) {
			if(s[i].Stu_Name.contains(chk_Name)) {
				chk_num = i;
				System.out.println(s[i].stu_number+" : "+s[i].Stu_Name);
			}
		}
		if(chk_num != -1) {
			System.out.println("해당번호를 입력하세요");
			chk_num1 = scan.nextInt();
			System.out.println("수정할 과목을 선택하세요");
			System.out.println("1.국어 2.영어 3.수학");
			chk_num2 = scan.nextInt();
			
			switch (chk_num2) {
			case 1:
				System.out.println("현재 국어점수 : "+s[chk_num1-1].Stu_Kor);
				System.out.println("수정할 점수를 입력하세요");
				s[chk_num1-1].Stu_Kor = scan.nextInt();
				break;

			case 2:
				System.out.println("현재 영어점수 : "+s[chk_num1-1].Stu_eng);
				System.out.println("수정할 점수를 입력하세요");
				s[chk_num1-1].Stu_eng = scan.nextInt();
				
				break;
				
			case 3:
				System.out.println("현재 수학점수 : "+s[chk_num1-1].Stu_Math);
				System.out.println("수정할 점수를 입력하세요");
				s[chk_num1-1].Stu_Math = scan.nextInt();
				
				break;
			default:
				System.out.println("잘못입력하셨습니다");
				break;
				
			}
			s[chk_num1-1].Stu_Sum = s[chk_num1-1].Stu_Kor+s[chk_num1-1].Stu_eng+s[chk_num1-1].Stu_Math;
			s[chk_num1-1].Stu_Avg= s[chk_num1-1].Stu_Sum/3.0; 
			
			
			top();
			System.out.print(s[chk_num1-1].stu_number+"\t");
			System.out.print(s[chk_num1-1].Stu_Name+"\t");
			System.out.print(s[chk_num1-1].Stu_Kor+"\t");
			System.out.print(s[chk_num1-1].Stu_eng+"\t");
			System.out.print(s[chk_num1-1].Stu_Math+"\t");
			System.out.print(s[chk_num1-1].Stu_Sum+"\t");
			System.out.print(s[chk_num1-1].Stu_Avg+"\t");
			System.out.print(s[chk_num1-1].Stu_rank+"\n");
		}else {
			System.out.println("해당하는 이름이 없습니다");
		}
	}//case3 학생 정보 수정
	
	//학생정보 검색 
	static void Stu_Search(Stu[] s) {
		
		System.out.println("이름을 검색하세요");
		chk_Name = scan.next();
		chk_num = -1;
		for(int i=0; i<Stu.count; i++) {
			if(s[i].Stu_Name.equals(chk_Name)) {
				chk_num = i;
				System.out.println(s[i].stu_number+" , "+s[i].Stu_Name);
				chk_num1 = scan.nextInt();
			}
		}
		if(chk_num != -1) {
			top();
			System.out.print(s[chk_num1-1].stu_number+"\t");
			System.out.print(s[chk_num1-1].Stu_Name+"\t");
			System.out.print(s[chk_num1-1].Stu_Kor+"\t");
			System.out.print(s[chk_num1-1].Stu_eng+"\t");
			System.out.print(s[chk_num1-1].Stu_Math+"\t");
			System.out.print(s[chk_num1-1].Stu_Sum+"\t");
			System.out.print(s[chk_num1-1].Stu_Avg+"\t");
			System.out.print(s[chk_num1-1].Stu_rank+"\n");
		}else {
			System.out.println("해당하는 이름이 없습니다");
		}
	}//case 4 학생성적 검색

		//등수처리 case 5
	static void Stu_Rank(Stu[] s) {
		for(int i=0; i<Stu.count; i++) {
			int rank_Count=1;
			for(int j=0; j<Stu.count; j++) {
				if(s[i].Stu_Sum < s[j].Stu_Sum) {
					rank_Count++;
				}
			}
			s[i].Stu_rank = rank_Count;
		}
		System.out.println("등수처리가 되었습니다");
	}
	
}// class
