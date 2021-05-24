package ex0524;

public class ex0524_point {

	public static void main(String[] args) {
		//point에서 상속을 받아온다
		//3개의 점을 만듭니다.(0,0,0)(10,5,3)(5,40,20)
		
		
//만약에 Point를 상속안받았을경우는
//		Point2D p2 = new Point2D();라고 객체선언을 또해줘야한다.
//		Point p1 = new Point();
//		p1.x=0;
//		p1.y=0;
//		P2.z=0;
// 이렇게 일일히 객체선언을 따로 해줘야한다.
// 그것을 상속을 통해서 줄일수 있다.
		
		

//		Point p2 = new Point();
//		p1.x=10;
//		p1.y=5;
//		
//		Point p3 = new Point();
//		p1.x=5;
//		p1.y=40;
		
		
		Point2D[] p1 = new Point2D[3];
		p1[0] = new Point2D();
		p1[0].x = 0;
		p1[0].y = 0;
		p1[0].z = 0;
		p1[1] = new Point2D();
		p1[1].x = 10;
		p1[1].y = 5;
		p1[1].z = 3;
		p1[2] = new Point2D();
		p1[2].x = 5;
		p1[2].y = 40;
		p1[2].z = 20;
		
		
		for(int i=0; i<p1.length; i++) {
			System.out.println(p1[i].x+" , "+p1[i].y+" , "+ p1[i].z );
		}
		
	}
}
