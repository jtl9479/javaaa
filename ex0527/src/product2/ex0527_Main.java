package product2;

import java.util.Scanner;

public class ex0527_Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		stu_process p = new stu_process();
		stu s = new stu();
		
		
		loop :while(true) {
			//메뉴
			p.Main_Menu();
			int menu = scan.nextInt();
			
			
			switch (menu) {
			case 1://성적입력
				p.stu_Input(s);
				break;
			case 2://출력
				p.stu_Output(s);
				break;
//			case 3://수정
//				p.stu_Update(s);
//				
//				break;
//			case 4:
//				p.stu_Search(s);
//				
//				break;
//			case 5:
//				p.stu_Rank(s);
//				break;
			case 0:
				System.out.println("프로그램 종료합니다");
				break loop;
		
			default:
				System.out.println("번호를 다시 선택해주세요");
				break;
			}
		}
		
		
		
	}//main
}//class
