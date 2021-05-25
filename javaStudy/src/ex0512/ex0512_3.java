package ex0512;

public class ex0512_3 {
	public static void main(String[] args) {
		//1부터 더했을때 500이 넘는 자연수는 얼마인가요
		//1. 1부터 더한다 for문
		//2. 500이 넘는다 if문
		
		int i =0;
		int j = 0;
		for(i=0; ;i++) {
			//무한루프 조건이 없으면 계속해서 증가한다
			//if문에서 조건을 걸어서 멈추게한다.
			j +=i;//i의 값을 j에 계속 더한다.
			if(j>500) {
				break;//500이 넘었을때 계산을 멈춘다
			}
			
		}System.out.printf("마지막 숫자는 %d 이고 합은 %d 이다",i,j);
	}
}
