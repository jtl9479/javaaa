package ex0512;

import java.util.Scanner;

public class ex0512_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[6];
		int[] luk = new int[45];
		
		for(int i=0; i<num.length; i++) {
			System.out.println((i+1)+"번쨰의 숫자를 입력하세요");
			num[i] = scan.nextInt();
		}//숫자 입력
		
		System.out.println("[ 입력한 숫자 ]");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}//숫자 출력
		
		for(int i=0; i<luk.length; i++) {
			luk[i] = i+1;
			//System.out.println(luk[i]);
		}//복권공 배열 생성 , 값 입력
		
		int temp;//임시저장소
		int val;//값
		for(int i=0; i<200; i++) {
			val = (int)(Math.random()*15);//값을 섞음
			
			temp = luk[0];
			luk[0] = luk[val];
			luk[val] = temp;
		}//값 랜덤기능 완료
		System.out.println();
		System.out.println("[ 로또 번호 ]");
		for(int i=0; i<num.length; i++) {
			System.out.print(luk[i]+" ");
		}System.out.println();
		int count = 0;
		int[] con = new int[6];
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				if(num[i] == luk[j]) {
					con[count] = num[i];
					count++;
				}
			}
		}
		System.out.printf("맞은 숫자의 개수는 %d개 \n",count);
		for(int i=0; i<count; i++) {
			System.out.print(con[i]+ " ");
		}
		
		
		
	}
}
