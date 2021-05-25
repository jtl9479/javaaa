package card;

import java.awt.Container;

public class Deck {

	// 52장 카드 생성
	// 52장의 카드에 kind,number를 넣어준다.(카드종류) --> for문을 2번돌린다. kind는 4개 number은 13개
	// 4*13하는 수만큼 카드가 나온다 52개 for(4번) for(13번)
	// 52장을 섞는 메소드
	// 52장의 카드를 출력하는 메소드
	// 메소드를 만든다.
	Card []myCard = new Card[7];
	Card []comCard =new Card[7];
	String[] kinds = { "SPADE", "DIAMOND", "HEART", "CLOVER" };
	String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	Card[] c = new Card[52]; // 52장의 카드가 만들어진다.

	Deck() {// 기본생성자 모양과 숫자 넣기 기본생성자에 넣은 이유는 Deck를 실행함과 동시에 값을 넣기 위해서이다 기본생성자는 값이 실행되는동시에
			// 실행이된다.
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				c[13 * i + j] = new Card(kinds[i], numbers[j]);// class card
				// c[0]-SPADE,1 SPADE,2

			}
		}
	}// 기본생성자

	void main_print() {
		System.out.println("[카드 프로그램]");
		System.out.println("[1.카드 1장출력]");
		System.out.println("[2.카드 5장 출력]");
		System.out.println("[3.카드 52장 출력]");
		System.out.println("[4.카드 섞기]");
		System.out.println("[5.카드 7장뽑기]");
		System.out.println("[0.프로그램종료]");
		System.out.println("[=========================]");
		System.out.println("[원하는 번호를 입력하세요]");
	}

	// 섞기 메소드
	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int random_no = (int) (Math.random() * 52);// 0부터51까지 랜덤이 된다.
			Card temp = c[0];// c[0]에는 (1,2) 이러한 값들이 존재한다.
			c[0] = c[random_no];
			c[random_no] = temp;
		}

//		for(int i=0; i<52; i++) {
//			System.out.printf("랜덤 %s, %s \n", c[i].kind,c[i].number);
//		}
	}

	// 1장출력 입력을 받아서 출력한다
	void print_1card(int index) {//위 c[13 * i + j] = new Card(kinds[i], numbers[j]); 로넘어간다.
		System.out.printf("카드 : %s,%s \n", c[index].kind, c[index].number);
	}

	void print_5card() {// 5장의 카드를 출력하는 메소드
		System.out.println("5장 출력하기");
		for (int j = 0; j < 5; j++) {
			System.out.printf("카드 :%s %s \n", c[j].kind, c[j].kind);
		}

	}

	void print_52card() {// 52장의 카드를 출력하는 메소드
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				System.out.printf("카드 : %s, %s \n", c[13 * i + j].kind, c[13 * i + j].number);
			}
		}
	}

	void print_7card() {
		int i = 0;
		int j = 0;
		int count = 0;
		int count1 = 0;
		for (i = 0; i < 52; i++) {
			System.out.println("나의 카드 : " + c[i].kind + "," + c[i].number + "\n");
			if (count == 6) {
				break;
			}
			count++;
		}
		
		for (j = 0; j < 52; j++) {
			if((c[i].kind == c[j].kind)  ) {
				continue;
			}else if((c[j].number == c[i].number)){
				continue;
			}
			
			System.out.println("컴퓨터 카드 : " + c[j].kind + "," + c[j].number + "\n");
			if (count1 == 6) {
				break;
			}
			count1++;
		}
		

	}

	
	//7장카드 배분
//	void handOut7card() {
//		System.out.println("카드 7장씩 배분");
//			for (int j = 0; j < 14; j++) {
//				if(j<=6) {
//					
//				myCard[j] = new Card(c[j].kind,c[j].number);
//				System.out.printf("마이카드 : %s, %s \n", c[j].kind, c[j].number);
//			}else {
//				comCard[j-7] = new Card(c[j].kind,c[j].number);
//				System.out.printf("컴카드 : %s, %s \n", c[j].kind, c[j].number);
//			}
//		}
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
