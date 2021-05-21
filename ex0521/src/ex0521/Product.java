package ex0521;

public class Product {

	static int count; //클래스변수
	int serialNo; //인스턴스변수
	String product_name; //제품명
	int price; //가격
	int bonusPoint; //보너스 포인트
	{//인스턴스 초기화 블럭
		//생성자와 결과값이 같다 그렇다면 굳이 사용할 필요가앖지만 왜사용하는 것일까.
		//
	 serialNo = ++count;//증가함수
	}
	
	Product() {
		//serialNo = ++count;//증가함수, 지금은 값이 0이 나온다
	}
	//생성자
	Product(String name,int price){ 
		this.product_name = name; //제품명
		this.price = price; //가격
		this.bonusPoint = price/100; //보너스 포인트 받아오는 값을 나눈다.
	}		
	//this를 안쓴다면 다시 생성자 Product(String product_name)로 값이 들어간다 그래서 this를 사용해서
	//class에 있는 product_name로 값을 보낸다
	//위 아래는 오버로딩이라고한다.
	Product(String name,int price,int bonusPoint){ 
		this.product_name = name; //제품명
		this.price = price; //가격
		this.bonusPoint = bonusPoint; 
		
	}//생성자
}
///serialNo = ++count;
//생성자에서 카운트는 해당 생성자가 돌아갈때만 돌아간다 
//초기화블록은 생성자의 공통으로 적용되어야될것을 뽑아서 사용한다.
//초기화블록이 실행되고 생정자돌아가고 초기화블록 실행되고 생성자가 돌아간다.
//카운터를 증가시키는것은 DB에서 사용한다.