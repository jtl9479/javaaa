package ex0517;

public class Tv {//class를 사용하고싶으면 객체 생성해야한다.
//붕어빵틀 기계
	String color;
	boolean power; //기능이 on off 만을 가지고 있기 때문에 boolean를 사용한다
	int channel; //3-tvn 5-sbs 7-kbs 9-kbs1 11-mbs
	///////변수
	void power() {
		power = !power; // true, false 
	}
	
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	//////////메소드
}
