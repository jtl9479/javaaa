package ex0524;

import java.util.Scanner;

public class ex0524_Triangle {
	// Triangle
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Point1[] p1 = new Point1[3];//저장소 3개를 저장할수있는 배열을 만든다

		for (int i = 0; i < p1.length; i++) {
			p1[i] = new Point1();// 객체 선언 배열을 만들기만하고 선언을 안했다 여기서 선언을한다.
			System.out.println((i + 1) + "번째 x좌표를 입력하시요");
			//10,0 이란 형태로 넣기
			String input = scan.next();
			String [] str = input.split(","); // , 를 기준으로 잘른다.
			p1[i].x = Integer.parseInt(str[0]); //형변환 메소드 string을 int로 바꾸는 법
			p1[i].y = Integer.parseInt(str[1]);
			//String -> int, 0+"" ->String
			//'5' - '0' -> 5 char을 int로 변환하는법 0 +""="0" int를 string으로 바꾸는법
			
//			System.out.println((i + 1) + "번째 y좌표를 입력하시요");
//			p1[i].y = scan.nextInt();
		}

		Point1[] p = { new Point1(p1[0].x, p1[0].y), 
				new Point1(p1[1].x, p1[1].y), 
				new Point1(p1[2].x, p1[2].y) };
		//위에서 p1[i] = new Point1();객체를 선언했기 때문에
		//p1[0],p1[1],p1[2] 이라고 해도된다.

		Triangle t1 = new Triangle(p);
		
		t1.triangle_point();
		
		
		t1.triangle_length();
		
		t1.triangle_area();
		
		//좌표 출력

	}

}
