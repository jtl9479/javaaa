package ex0512;

public class ex0512_1 {

	public static void main(String[] args) {
		// 구구단 출력을 할때
		// 홀수번만 출력을 하시오
		int i = 0;
		int j = 0;

		for (i = 2; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.printf("구구단 %d 단 \n", i);
				for (j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %d ,", i, j, i * j);
				}
				System.out.println();
			}
		}
	}
}
