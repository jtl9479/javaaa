package ex0524;

public class Stu {

	static int count;
	
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;	
	
	Stu() {} //생성자. 초기화 메소드 
	
	Stu(String name,int kor, int eng, int math) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor+eng+math;
		this.avg = sum/3.0;
		
	} 
	
}
