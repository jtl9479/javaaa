package ex0525;

public class ex0524_card {

	public static void main(String[] args) {
		
		Deck d = new Deck();
		d.shuffle(); //카드 섞기 섞여서 나온다
		//52장의 카드가 만들어진다.
		
		//5장 출력
		System.out.println("[5장 출력]");
			for(int j=0; j<5; j++) {
				//if(j<6 && i<1) {
				//System.out.println(13*i+j); 카드개수 확인 	
				d.card_print(d.c[j]);//C[0],C[1]....C[51]
			}

		
		
		//전체 출력
			System.out.println("[52 장 출력]");
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<13; j++) {
//				//if(j<6 && i<1) {
//				//System.out.println(13*i+j); 카드개수 확인 	
//				d.card_print(d.c[13*i+j]);//C[0],C[1]....C[51]
				//[13*i+j] 52까지 나열한다.	
				
//				}else {
//					break;
//				}
			}
		
		
		
	}

