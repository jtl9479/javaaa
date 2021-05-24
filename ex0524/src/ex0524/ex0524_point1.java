package ex0524;

public class ex0524_point1 {
	public static void main(String[] args) {
		//point에서 상속을 받아온다
		//3개의 점을 만듭니다.(0,0,0)(10,5,3)(5,40,20)
		
//		Point p1 = new Point();
//		p1.x=0;
//		p1.y=0;
//		
//		Point p2 = new Point();
//		p1.x=10;
//		p1.y=5;
//		
//		Point p3 = new Point();
//		p1.x=5;
//		p1.y=40;
		
		//상속을 사용하지 않고 point3d에 객체 선언을 사용했을때
		Point3D[] p1 = new Point3D[3];
		Point[] p2d = new Point[3];
		p1[0] = new Point3D();
		p1[0].p.x = 0;
		p1[0].p.y = 10;
		p1[0].z = 1;
		p1[1] = new Point3D();
		p1[1].p.x = 10;
		p1[1].p.y = 5;
		p1[1].z = 3;
		p1[2] = new Point3D();
		p1[2].p.x = 5;
		p1[2].p.y = 40;
		p1[2].z = 20;
		
		
		for(int i=0; i<p1.length; i++) {
			System.out.println(p1[i].p.x+" , "+p1[i].p.y+" , "+ p1[i].z );
		}
		
	}
}