package ex0524;

import java.util.Scanner;

public class ex0524_1 {
	static Scanner scan = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		Stu[] s = new Stu[10];//객체 선언자체가 코드의 재사용이다
		
		loop : while(true) {

			main_menu(); 
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1://학생성적입력
				main_input(s);
				
				break;
			case 2://학생성적 출력
				
				break;
			case 3://학생성적 수정
				
				break;
			case 4://학생성적 검색
				
				break;
			case 5://등수처리
				
				break;
			case 0://프로그램 종료
				
				break loop;

			default:
				break;
			}//switch
		}//while
	}//class
	
	
	static void main_menu() {
		System.out.println("성적입력 시스템");
		System.out.println("1.학생성적입력");
		System.out.println("2.학생성적출력");
		System.out.println("3.학생성적수정");
		System.out.println("4.학생성적검색");
		System.out.println("5.등수처리");
		System.out.println("프로그램 종료");
	}//main menu

	static void main_input(Stu[] s){
		
	}



}//main

