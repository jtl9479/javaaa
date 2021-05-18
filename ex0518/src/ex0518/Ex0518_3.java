package ex0518;

public class Ex0518_3 {

	public static void main(String[] args) {
		
		Card c1 = new Card();//객체를 선언해야지만.
		c1.kind = "Heart"; //인스턴스변수 사용가능
		c1.number = 7;
		
		Card c2 = new Card();//객체를 선언해야지만.
		c2.kind = "Spade"; //인스턴스변수 사용가능
		c2.number = 4;
		
		Card.width=50; //class변수는 객체 선언하지않아도 사용가능

		
		System.out.printf("카드종료:%s 숫자:%d \n",c1.kind,c1.number);
		System.out.printf("카드폭:%d 카드길이:%d \n",c1.width,c1.height);

		//c1을 변경했지만 c2의 값이 변경되는것을 확인할수있다.
		c1.width=200; 
		c1.height=200;
		
		System.out.println("---------------------------------------");
		System.out.printf("카드종료:%s 숫자:%d \n",c2.kind,c2.number);
		System.out.printf("카드폭:%d 카드길이:%d \n",c2.width,c2.height);
	
		//인스턴트변수는 각자 사용을 하지만
		//클래스변수는 공통으로 사용을한다는것을 확인할수있다.
		//왜냐하면 프로그램을 실행하지마자 메모리에 들어간다.
	}
}
