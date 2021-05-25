package card;

public class Card {

	//카드는 종류와 숫자가 필요하다
	String kind; //스페이드,다이아몬드,하트,클로버 4개 인스턴스 변수
	String number; //1,2,3,4,5,6,7,8,9,10,j,q,k 가 있다
	
	Card(){//기본생성자
		this("SPADE","1");
	}
	Card(String kind,String number){
		this.kind = kind;  //this.kind = kind; 각각 인스턴스 변수 그리고 지역변수를 가르킨다
		this.number = number;
	}
	
	public String toString() {//리턴 타입 String  tostring에서 "카드"+kind+","+number 을 리턴해준다
		//object 꺼이다.

		return "카드"+kind+","+number;//이것을 return 해준다.
	}
	
}
