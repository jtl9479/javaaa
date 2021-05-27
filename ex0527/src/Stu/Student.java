
package Stu;

public class Student {


	static int count;  //클래스변수
	String stu_number; //학생번호 //문자 증가를 S001 S002로 바꾸고 싶다면
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{
		String str_number = "S" + String.format("%03d", ++count);
		//학생번호 String.format String으로 형변환을한다.
	}
	
	Student(){}  //기본생성자
	Student(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
}