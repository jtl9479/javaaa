package ex0517;

import java.util.Scanner;

public class ex0515_6_1 {

	public static void main(String[] args) { //(String[] args) 매개변수이다 return값은 1개이다.

		// 번호,시(0~23),분(0~59),초(0~59.999)를 입력받아 출력하시오
		// time[3][3], second[3]
		// int[] num, int[] hour, int[] minute, double[] second
		// 3개를 입력받아 출력을 해보세요
		// 시간은 수정이 가능하게 해보세요
		// 1.시간추가
		// 2.시간출려
		// 3.시간수정

		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		int[] hours = new int[3];
		int[] minute = new int[3];
		double[] second = new double[3];

		while (true) {

			System.out.println("[시간 프로그램]");
			System.out.println("[1.시간 입력]");
			System.out.println("[2.시간 출력]");
			System.out.println("[3.시간 수정]");
			System.out.println("[원하는 번호를 입력하세요]");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("[1.시간 입력]");
				for (int i = 0; i < hours.length; i++) {
					num[i] = i + 1;
					System.out.println("시를 입력하세요");
					hours[i] = scan.nextInt();
					System.out.println("분을 입력하세요");
					minute[i] = scan.nextInt();
					System.out.println("초를 입력하세요");
					second[i] = scan.nextInt();
				}

				break;

			case 2:
				for (int i = 0; i < hours.length; i++) {
					System.out.print(num[i] + " : ");
					System.out.print(hours[i] + " : ");
					System.out.print(minute[i] + " : ");
					System.out.print(second[i] + "\n");
				}
				break;

			case 3:

				break;

			default:
				break;
			}

		}
	}
}
