package card;

public class ex0525_1 {

	public static void main(String[] args) {
		
		Card[] c1 = new Card[52];
		c1[15] = new Card();
		
		Deck d = new Deck();
		System.out.println(c1[15].kind +","+c1[15].number);//주소값이 나온다.
		//toString을 사용한다면 기본값이 나온다.객체를 프린트 하고싶다면 toString를 사용하면 된다.
		//System.out.println(c.kind+","+c.number);//spade 1.
		System.out.println(d.c[20].kind +"," + d.c[20].number );//주소값이 나온다.
		
	}
}
