package ex0525;

public class Card {

	
	int kind; //SPADE,DIAMOND,HEART,CLOVER 이 있다.
	int number;
	
	Card(){
		this(1,1);
	}//기본생성자
	
	Card(int kind,int number){
		this.kind = kind;
		this.number = number;
	}
	
	//카드 출력

}
