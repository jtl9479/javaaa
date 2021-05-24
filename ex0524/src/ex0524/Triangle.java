package ex0524;

public class Triangle extends Shape {// class 생성할때 superclass에서 설정할수있다.
	Point1[] p;//삼각형의 3개의 좌표
	double[] point_length = new double[3]; //삼각형의 3개의 일이

	Triangle() {
	} // 기본생성자 만들어주는것이 좋다

	Triangle(Point1[] p) {
		this.p = p;
	}

	Triangle(Point1 p1, Point1 p2, Point1 p3) {
		p = new Point1[] { p1, p2, p3 };// 데이터를 넣는다 객체의 또 객체를 쓴다. 상속,포함 이 있다 이것은 포함이다. 
	}

	// 좌표 출력
	void triangle_point() {
		for(int i=0; i<p.length; i++) { //좌표 보여주기
			System.out.println((i+1)+"번째의 x,y 좌표 : " + p[i].x +" , "+ p[i].y);
		}
		
	}

	//길이 출력
	void triangle_length() {
	for(int i = 0;i<p.length;i++)
	{// 대각선값 구하기
		if (i < 2) {
			point_length[i] = Math.sqrt(Math.pow((p[i].x - p[i + 1].x), 2) + Math.pow((p[i].y - p[i + 1].y), 2));//
		} else {
			point_length[i] = Math.sqrt(Math.pow((p[i].x - p[i - 2].x), 2) + Math.pow((p[i].y - p[i - 2].y), 2));//
		}
		System.out.printf("%d번째 길이 : %.2f \n", (i + 1), point_length[i]);
	}
	}
	//삼각형 넓이 구하기
	void triangle_area() {
		//반둘레 구하는 공식 s=1/2(length1+length2+length3)
		double s = 0.5*(point_length[0]+point_length[1]+point_length[2]);
		
		double triangle_area = Math.sqrt(s*(s-point_length[0])*(s-point_length[1])*(s-point_length[2]));
		System.out.println(triangle_area);
	}

}
