package ex0517;

public class Ex0517_7 {
//붕어빵
	public static void main(String[] args) {
		
		String str = new String();
		Tv t; //참조변수 주소생성
		t = new Tv(); //주소를 저장할수있는 공간 생상
		Tv t3 = new Tv();//객체 생성		
		
		
		Tv t1 = new Tv();//객체 선언 또는 객체 생성 이래야지만 사용할수있다.
		Tv t2 = new Tv();//객체 선언 또는 객체 생성
		//t1 과 t2는 모양은 같을지라도 제품자체는 다르다.
		//객체는 같은 class에서 가지고와도 각자 다른 객체들이다. 
		//public class Tv에 있는것들을 모두 사용할수있다.
		
		t1.channel = 7;
		t2.channel = 6;
		System.out.println(t2.channel);
		System.out.println(t1.channel); //7을 출력한다
		System.out.println(t1.power);//기본값이 false로 되어있다.
	
	
		t1.power();
		t1.channelDown();
		System.out.println(t1.power);//true가 찍힌다. 
		System.out.println(t1.channel); //6이 출력된다.
		
		t1.channelUp();
		System.out.println(t1.channel);
	}
}
