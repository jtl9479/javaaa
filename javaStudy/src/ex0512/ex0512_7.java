package ex0512;

public class ex0512_7 {

	public static void main(String[] args) {
		
		int[] ball = new int[45];
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		int temp =0;
		int a =0;
		for(int i=0; i<200; i++) {
			a =(int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[a];
			ball[a] = temp;
		}
		System.out.println("[ 로또 번호 ]");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
	}
}
