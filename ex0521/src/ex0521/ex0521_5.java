package ex0521;

public class ex0521_5 {

	public static void main(String[] args) {

		String num = "";
		int count = 0;

		for (int i = 0; i < 5; i++) {

			String str_number = "S" + String.format("%04d", ++count);
			System.out.println(str_number);
		}

		// S001,S002
//		System.out.printf("%d \n",5);
//		System.out.printf("%,07d \n",123456789); //12,345,678
//		System.out.printf("%07.2f \n",123456789.123456);
//		System.out.printf("%10s \n","더좋은");
		// 칸 뛰기 남으면 0을 출력하고 안남으면 출력을 안한다.
		// String str_number = "S" + String.format("%04d", ++count);//
//		System.out.println(str_number);
	}
}
