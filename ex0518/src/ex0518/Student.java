package ex0518;

public class Student {
	
	
	static int count;//클래스변수 초깃값이 0이다

	int tu_number = ++count;//입력을 할때마다 자동으로 카운트가 된다.
//전위변수 static count의 초깃값이 0이기 떄문에 계산을 하고나서 값을 출력시켜주는 전위변수를 사용해야한다
	
//	static int count = 1;
//	int tu_number = count++;	
	String name;
	int[]score = new int[3];
	int total;
	double avg;
	int rank;

	
}
