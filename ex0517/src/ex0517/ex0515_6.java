package ex0517;

import java.util.Scanner;

public class ex0515_6 {
	public static void main(String[] args) {
		// 시(0-23) 분(0-59), 초(0-59.999)를 입력받아 출력하시오
		// 3개를 입력받아 출력해보세요
		// 시간은 수정이 가능하게 해보세요
		// 1.시간추가
		// 2.시간출력
		// 3.시간입력
		Scanner scan = new Scanner(System.in);
		int hours = 0;
		int min = 0;
		int sec = 0;
		int select = 0;

		loop: while (true) {
			System.out.println("1.시간을 입력해보세요");
			System.out.println("2.시간을 출력해보세요");
			System.out.println("3.시간을 수정해보세요");
			System.out.println("0. 프로그램종료");
			int time = scan.nextInt();

			switch (time) {
			case 1:
				System.out.println("시간을 입력하세요");
				System.out.println("시를 입력하세요");
				hours = scan.nextInt();
				System.out.println("분을 입력하세요");
				min = scan.nextInt();
				System.out.println("초를 입력하세요");
				sec = scan.nextInt();
				break;

			case 2:
				System.out.println("시간을 출력하세요");
				System.out.println(hours + "시" + min + "분" + sec + "초");

				break;

			case 3:
				System.out.println("시간을 수정하세요");
				System.out.println("수정하고싶은 것을 선택하세요");
				System.out.println("1.시 2.분 3.초");
				select = scan.nextInt();

				switch (select) {
				case 1:
					System.out.println("시를 수정합니다");
					hours = scan.nextInt();
					System.out.println("수정되었습니다");
					System.out.println(hours + "시" + min + "분" + sec + "초");
					break;

				case 2:
					System.out.println("분을 수정합니다");
					min = scan.nextInt();
					System.out.println("수정되었습니다");
					System.out.println(hours + "시" + min + "분" + sec + "초");
					break;

				case 3:
					System.out.println("초를 수정합니다");
					sec = scan.nextInt();
					System.out.println("수정되었습니다");
					System.out.println(hours + "시" + min + "분" + sec + "초");
					break;

				default:
					System.out.println("잘못입력하셨습니다");
					break;
				}

				break;

			case 0:
				System.out.println("프로그램 종료");
				break loop;
			default:
				System.out.println("잘못입력하셨습니다");
				break;
			}

		}
	}
}
