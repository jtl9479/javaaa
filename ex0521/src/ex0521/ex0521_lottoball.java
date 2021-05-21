package ex0521;

public class ex0521_lottoball {

	public static void main(String[] args) {

		LottoBall b = new LottoBall();// 객체 생성

		for (int i = 0; i < b.ball.length; i++) {
			// System.out.println(b.ball[i]);
		}

		System.out.println("로또 번호");
		for (int i = 0; i < 6; i++) {
			System.out.print(b.ball[i] + " ");

		}
	}
}
