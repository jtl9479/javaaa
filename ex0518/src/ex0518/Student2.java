package ex0518;

public class Student2 {

	static int count;//static변수는 초기화를 하지않아도 된다. 자동으로 초기화해준다.
	

	int stu_number = ++count;//이것을 객체생성하지 않는 이상 생성되지 않는다.
	//메모리에 있는 숫자1이 stu_number로 들어간다. 객체를 만들때마다 자동으로 카운트가 된다.

	String name;
	
	int kor;
	int eng;
	int math;
	//int[] score = new int[3]; 와 같다
	int total;
	double avg;
	int rank;



}
