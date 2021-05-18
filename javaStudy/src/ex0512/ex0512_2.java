package ex0512;

public class ex0512_2 {

	public static void main(String[] args) {
		//1부터 100까지 수 중에서 3의 배수만 출력하는 코드를 만드시오
		//1. 1부터 100까지 출력되는 증가 함수를 만든다(FOR)
		//2. 3의배수를 찾는 조건을 만든다(IF)
		//3. 3의배수를 출력한다.
			
		System.out.println("3의 배수는");
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				System.out.printf("%d, ",i);
			}
		}
		
	}
}
