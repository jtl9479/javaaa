package ex0524;

public class ex0524_card {

	public static void main(String[] args) {
		
		Deck d = new Deck();
		d.shuffle(); //카드 섞기 섞여서 나온다
		//52장의 카드가 만들어진다.
		
//		d.c[0].card_print(1, 1);
//		d.c[0].card_print(1, 11);
//		d.c[0].card_print(2, 13);
//		d.c[0].card_print(2, 5);
//		d.c[0].card_print(3, 12);
//		d.c[0].card_print(3, 3);
//		d.c[0].card_print(4, 10);
//		d.c[0].card_print(4, 12);
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				if(j<6 && i<1) {
				//System.out.println(13*i+j); 카드개수 확인 	
				d.c[13*i+j].card_print(i+1, j+1);//[13*i+j] 52까지 나열한다.	
				
				}else {
					break;
				}
			}
		}
		
		
	}
}
