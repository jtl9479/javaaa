package ex0524;

public class ex0524_Circle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		//c1.center.x = 100;//circle을 안에있는 참조변수명 center을 쓰고 변수명을 작성한다.
		System.out.println("c1의 좌표 : " + c1.center.x + " , " + c1.center.y);
		System.out.println("c1의 반지름 : " + c1.r);
		//이렇게 출력하면 입력한것이 없어서 기본값이 출력된다
		System.out.println("c1의 넓이 : " + (3.14*Math.pow(c1.r, 2)));
		//Math.pow(c1.r, 2) c1.r을 제곱한다.
		//math round, ceil, floor, random pow(제곱) sqrt(루트=제곱근)
		System.out.println();
		
		
		
		
		Circle c2 = new Circle(new Point1(150,100),50);//좌표를 안에다가 넣었을때
		//x,y 좌표 반지름 넓이를 구하시오
		System.out.println("c2의 좌표 : " + c2.center.x + " , " + c2.center.y);
		System.out.println("c2의 반지름 : " + c2.r);
		//이렇게 출력하면 입력한것이 없어서 기본값이 출력된다
		System.out.println("c2의 넓이 : " + (3.14*Math.pow(c2.r, 2)));
		System.out.println("================================================");
		
		Point1[] p = {new Point1(0,0),new Point1(100,0),new Point1(100,100) };
		//int[] arr = {1,2,3};//배열3개가 만들어진다. 배열로 선언
		
		Triangle t1 = new Triangle(p);//Point1[] p의 정보가 Triangle로 들어간다.
		System.out.println("t1의 1번째 좌표"+t1.p[0].x +","+ t1.p[0].y);
		System.out.println("t1의 2번째 좌표"+t1.p[1].x +","+ t1.p[1].y);
		System.out.println("t1의 3번째 좌표"+t1.p[2].x +","+ t1.p[2].y);
		System.out.println("-----------------------------------------");
		int x_length = (t1.p[1].x-t1.p[0].y);
		int y_length =(t1.p[2].y-t1.p[0].y);
		double side = Math.sqrt(Math.pow(x_length,2)+Math.pow(y_length, 2));
		System.out.println("x좌표의 길이 : " + x_length);
		System.out.println("y좌표의 길이 : " + y_length);
		//대각선길이 공식 = 제곱근(x제곱 + y제곱)
		System.out.printf("대각선 길이 %.2f ",side);
		
		
		
	}
}
