package ex0527;

import java.util.Scanner;

public class ex0527_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Buyer b = new Buyer();//객체 선언 바이어에 있는것을 사용할수가 있다.
		
		while(true) {
			b.Main_Menu();
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				b.buy(new Computer());
				b.My_Info();
				break;
			case 2:
				b.buy(new SmartPhone());
				b.My_Info();
				break;
			case 3:
				b.buy(new Tv());
				b.My_Info();
				break;

			case 4:
				//구매목록 보기
			
				b.My_list();
				break;
			case 5://현금 충전
				//private int money = 2000; 에 값을 넣어준다
				//얼마 충전할꺼야? 결제는 카드로? 현금으로?
				System.out.println(" 금액 충전 ");
				System.out.println("얼마를 충전할지 입력하세요?(0.상위메뉴 이동");
				int money1 = scan.nextInt();
				if(money1 == 0) {
					System.out.println("상위메뉴로 이동합니다");
					break;
				}
				
				b.setMoney(b.getMoney()+money1);
				System.out.println("충전되어진 금액");
				System.out.println(b.getMoney()+"원이 되었습니다");
				break;

			case 0:
				System.out.println("프로그램 종료");
				break;

			default:
				System.out.println("잘못입력하셨습니다");
				break;
			}
			
		
			
			
			
			
		}//while
		

	}//main
}//class
