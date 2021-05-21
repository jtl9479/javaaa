package ex0521;

public class student3 {

	static int count; //클래스변수 객체생성없이 사용가능 

	String stu_number; //인스턴스 변수 객체생성해야 사용가능
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	//초기화 블럭은 거의 사용안한다 스테틱변수도 잘사용안한다.
	{//생성자의 공통부분이 존재하기 때문에 초기화 블럭을 사용한다
		count++;
		stu_number = "S"+count; //S1 S2...... 보통 DB에서 사용한다 굳이 여기서 사용안한다.
	}
	
	student3(){}
	student3(String name,int kor,int eng,int math){//이름이 달라도 되지만 헷갈리지 않게 이름을 같게 사용한다
		this.name = name;//this.변수는 class의 것이다 =변수명은 지역변수 생성자의 것이다 this를 안써도 class의 것이 아니라 생성자의 것이다
		//생성자에서 값이 들어온것을 this를 통해서 class로 값이넘어간다. 
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total =kor+eng+math;
		//값이 들어오면 자동으로 값을 더한다 최대한 자동화하는것이 유리하다
		this.avg = this.total/3.0;//그냥 total도 사용해도 된다 하지만 헷갈릴수있으니 this를 붙인다.

	}
}
