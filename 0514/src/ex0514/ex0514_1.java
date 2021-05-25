package ex0514;

public class ex0514_1 {

	public static void main(String[] args) {
		// 1차원 30개짜리 배열 생성해서 랜덤으로 1~100까지 숫자를 넣어 만들어보세여.
		// 1차원 40개짜리 배열을 생성해서 배열 5번째 방부터20개만 복사해보셍ㅅ
		// for문,arraycopy메소드 2가지를 모두 사용하세요

		int[] number = new int[30];
		int[] number1 = new int[40];

		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}
		int temp = 0;
		int con = 0;
		for (int i = 0; i < number.length; i++) {
			con = (int) (Math.random() * 30);
			temp = number[0];
			number[0] = number[con];
			number[con] = temp;
		}

		System.arraycopy(number, 4, number1, 0, 20);
		
//		for (int i = 4; i < 24; i++) {
//			number1[i] = number[i-4];
//		}

		for (int i = 0; i < number1.length; i++) {
			System.out.print(number1[i] + " ");
		}

//		//배열 복사 
//		int [] number = {1,2,3,4,5};
//		int [] newnumber = new int[10];
//		
//		//System.arraycopy() 메소드 사용해서 배열 복사.
//		System.arraycopy(number, 1, newnumber, 3,2);
//		
//		//for문을 사용한 배열 복사
////		for(int i=0; i<number.length; i++) {
////			newnumber[i] = number[i];
////		}
////		
//		for(int i=0; i<newnumber.length; i++) {
//			System.out.print(newnumber[i]+" ");
//		}//number에 값이 newnumber로 복사하는방법 단 새로운객체가 더 커야한다

	}
}
