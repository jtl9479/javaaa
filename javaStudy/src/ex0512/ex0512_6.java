package ex0512;

public class ex0512_6 {
	public static void main(String[] args) {
		// 로또번호
		// 배열 생성
		// 배열공값 전달
		// 랜덤함수를 이용해서 섞는다
		// 출력

		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;// i의 값이 베열로 들어간다
		}
		int temp = 0;
		for (int i = 0; i < 200; i++) {
			int a = (int)(Math.random()*44)+1;// 1에서45까지 섞는다
			temp = ball[0];
			ball[0] = ball[a];
			ball[a] = temp;

		}
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}

	}

}
