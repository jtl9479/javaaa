package ex0524;

import java.util.Scanner;

//삼각형 길이구하기
public class ex0524_Circle2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
//		int [] x = new  int[3];
//		int [] y = new  int[3];  Point1로 대체할수가 있다
		
		Point1[] in_point = new Point1[3];
		
		
		//입력 좌표 3개릴 입력받음
		for(int i =0; i<in_point.length; i++) {
			in_point[i] = new Point1(); //객체 생성
			System.out.println((i+1)+"x좌표를 입력하세요.");
			in_point[i].x = scan.nextInt();
			System.out.println((i+1)+" y좌표를 입력하세요.");
			in_point[i].y = scan.nextInt();
		}

		Point1 [] p = {new Point1(in_point[0].x,in_point[0].y)
						,new Point1(in_point[1].x,in_point[1].y)
						,new Point1(in_point[2].x,in_point[2].y)};//좌표
		//Point1 [] p = {new Point1(x1,y1),new Point1(x2,y2),new Point1(x3,y3)};//좌표
		Triangle t1 = new Triangle(p);//좌표겂 넣음
	
		double[] point_length = new double[3]; 
	
		
		
		for(int i=0; i<p.length; i++) {
			System.out.printf("[ %d 번째 x,y 좌표 : %d, %d ] \n",(i+1),t1.p[i].x,t1.p[i].y);
//			//double xx = Math.pow((t1.p[0].x-t1.p[1].x),2); //제곱
//			//double yy = Math.pow((t1.p[0].y-t1.p[1].y),2); //제곱
//			//x1,y1에서 x2,y2까지의 길이
//			point_length[i] = Math.sqrt(Math.pow((t1.p[i].x-t1.p[i+1].x),2)+Math.pow((t1.p[i].y-t1.p[i+1].y),2));//대각선 길이
//			System.out.printf("%d번째 길이 : %.2f \n",(i+1),point_length[i]);
		}
		
		
		
		
		
		
		
		
		
		
		for(int i=0; i<p.length; i++) {
			//제곱(p[0].x,p[0].y)(p[1].x,p[1].y)(p[2].x,p[2].y)
		if(i<2) {
			point_length[i] = Math.sqrt(Math.pow((t1.p[i].x-t1.p[i+1].x),2)+Math.pow((t1.p[i].y-t1.p[i+1].y),2));//
		}
		else {
			point_length[i] = Math.sqrt(Math.pow((t1.p[i].x-t1.p[i-2].x),2)+Math.pow((t1.p[i].y-t1.p[i-2].y),2));//
		}
			
			
		//point_length[i] = Math.sqrt(Math.pow((t1.p[i].x-t1.p[i+1].x),2)+Math.pow((t1.p[i].y-t1.p[i+1].y),2));//대각선 길이
		System.out.printf("%d번째 길이 : %.2f \n",(i+1),point_length[i]);
	}
		
		
		
		
		
	}//main
}//class
	
//		System.out.println("첫번째 X좌표를 입력하세요.");
//		int x1 = scan.nextInt();
//		System.out.println("첫번째 Y좌표를 입력하세요.");
//		int y1 = scan.nextInt();
//		
//		System.out.println("두번째 X좌표를 입력하세요.");
//		int x2 = scan.nextInt();
//		System.out.println("두번째 Y좌표를 입력하세요");
//		int y2 = scan.nextInt();
//		
//		System.out.println("세번째 X좌표를 입력하세요");
//		int x3 = scan.nextInt();
//		System.out.println("세번째 Y좌표를 입력하세요");
//		int y3 = scan.nextInt();
