package point;

public class Point extends Object {

	int x;
	int y;
	
	//기본생성자 자동생성안됨
	Point(){}
	
	Point(int x, int y){//매개변수가 있는 생성자.
		super(); //자동으로 붙여준다 object로 가서 기본생성자 호출
		this.x = x; //인스턴스를 가르킨다
		this.y = y;
	}
	
	String getLocation() {
		
		return "x"+x+","+"y"+y;
	}
}
