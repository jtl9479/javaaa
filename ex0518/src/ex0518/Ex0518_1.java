package ex0518;

public class Ex0518_1 {
	public static void main(String[] args) {
		
		//객체 배열 선언
		Time[] t = new Time[3];//데이터공간이만들어지진않는다.참조변수3개만 만들어진다
		//() 괄호 열고닫기가 있어야지만 데이터 저장공간이 만들어진다
		
		
		for(int i=0; i<t.length; i++) {
			t[i] = new Time();//객체 선언
			t[i].hour = i+1;
			t[i].minute= i+1;
			t[i].secound= i+1;
		}
		
		for(int i=0; i<t.length; i++) {
			System.out.printf("%d시%d분%d초 \n",t[i].hour,t[i].minute,t[i].secound);
		}
		
		//Time t = new Time();
		//		t.hour = 1;
//		t.minute = 1;
//		t.secound = 1;
//		
//		System.out.println(t.hour+"시"+t.minute+"분"+t.secound+"초");
//	}
}
}
