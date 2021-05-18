package ex0515;

public class ex0515_1 {

	public static void main(String[] args) {
		// 1차원 30개짜리 배열 생성해서 랜덤으로 1~100까지 숫자를 넣어 만들어보세여.
		// 1차원 40개짜리 배열을 생성해서 배열 5번째 방부터20개만 복사해보셍ㅅ
		// for문,arraycopy메소드 2가지를 모두 사용하세요
		
		int[] num = new int[30];
		
		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*100);
		
			System.out.println(num[i]);
		}
		
		for(int i=0; i<100; i++) {
			int con=(int)(Math.random()*30);
			int temp = num[0];
			num[0] = num[con];
			num[con] = temp;
		//System.out.println(num[i]);
		}
		
		
		
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		
		//값을 넣었다
//		int[] num1 = new int[40];
//		int count =0;
//		System.arraycopy(num, 15, num1,0, 15);
//		for (int i = 0; i < num1.length; i++) {
//			count ++;
//			System.out.println(count+" "+ num1[i] + " ");
//		}
	}
	
}
