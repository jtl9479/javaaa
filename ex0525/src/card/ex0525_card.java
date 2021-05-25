package card;

import java.util.Scanner;

public class ex0525_card {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Deck d = new Deck();//kind,number 입력완료
		
		//무한 반복
		loop : while(true) {
			
			d.main_print();
			int choice = scan.nextInt();
			
			
			switch (choice) {
			case 1://카드 1장 출력
				System.out.println("뽑고 싶은 카드번호를 입력하세요.(0-51)>>");
				int num = scan.nextInt();
				d.print_1card(num);/*번호를 한개 받는다.*/
				
				break;
			case 2://카드5장 출력
				d.print_5card();
				
				break;
			case 3:
				d.print_52card();
				
				break;
			case 4:
				d.shuffle();
				break;
				
			case 5:
				//카드 7장을 내것과 컴퓨터 것을  출력시키려는 메소드
				//내것과 컴퓨터갓 중복안되게
				d.print_7card();
				//d.handOut7card();
				break;
			case 0:
				if(choice == 0) {
					System.out.println("프로그램 종료합니다");
					break loop;
				}
			default:
				break;
			}
		}
		
		

		
		
	}
	//메인에는 메소드를 호출하기만 한다.
	
}
