package ex0524;

public class Circle extends Shape {// 상속

	Point1 center;// 객체 생성이 아니라 Point에 있는 변수를 사용하는 역활이다 참조변수이다.
	int r;

	Circle() {
		this(new Point1(0,0),100);
	}
	
	Circle(Point1 center, int r) {
		this.center = center;
		this.r = r;
	}
	


	
}
