package ex0512;
//배열
public class ex0512_4 {

	public static void main(String[] args) {
		//배열 선언
		
		int [] num = new int[5];
		num[0] = 10;
		num[1] = 10;
		num[2] = 20;
		num[3] = 30;
		num[4] = 40;
		
		int [] num1 = {1,2,3,4,5,6,7,8,9,0};
		for(int i=0; i<num1.length; i++) {
		System.out.print(num1[i]+" ");
	}System.out.println();
		System.out.println(num1.length);
	}
}
