package ex0524;

public class Deck {

	
	final int CARD_NUM =52; //FINAL 을 사용해서 상수만든다 상수는 대문자로 쓴다.
	Card[] c = new Card[CARD_NUM]; //카드 개수
	
	Deck() { 
		for(int i=0; i<4; i++) {//카드의 종류 4종류가 있다.
			for(int j=0; j<13; j++) { //숫자가 1부터 시작해서 1을 넣었다.
				c[13*i+j]= new Card(i+1,j+1);//c[0]=new Card(1,1) SPADE,1 이 들어간다.
			//52장의 카드 정보가 들어간다.
			}
		}
		
	}//기본생성자
	void shuffle() {
		for(int i=0; i<1000; i++) {
			int random_no = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[random_no];
			c[random_no] = temp; //섞는다
		}
		
	}
	
	
}
