package ex0521;

public class LottoBall {

	static int[] ball = new int[45];
	
	LottoBall() {//생성자블록
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1;//볼에 값을 넣는다.
		}
		
			int temp = 0;
			int con = 0;
			for(int i=0; i<200; i++) {
				con= (int) (Math.random()*44)+1;
				temp = ball[0];
				ball[0] = ball[con];
				ball[con] = temp;
			}
			
		}
	
	
	
	
	
	
	
	static { //초기화 블록
		//생성자가 공통적으로 여러명일때 사용한다.
		
		
		
//		for(int i=0; i<ball.length; i++) {
//			ball[i]=i+1;//볼에 값을 넣는다.
//		}
//		
//			int temp = 0;
//			int con = 0;
//			for(int i=0; i<200; i++) {
//				con= (int) (Math.random()*44)+1;
//				temp = ball[0];
//				ball[0] = ball[con];
//				ball[con] = temp;
//			}
//			
//		}
//	
		
	}
	}


