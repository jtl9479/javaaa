package point;

public class Point3D extends Point{ //자동으로 생성자를 한개 받아야한다.
	
	int z;
	
	Point3D(){}
	//기본생성자가 생성되지 않음
	Point3D(int x,int y,int z){//매개변수가 있는 생성자
		super(); //자동으로 붙여준다 object로 가서 기본생성자 호출
		this.x =x;
		this.y =y;
		this.z =z;
	}
	
	String getLocation() {
		return "X"+x+","+"Y"+y+","+"Z"+z;
	}
	
	

	
}
