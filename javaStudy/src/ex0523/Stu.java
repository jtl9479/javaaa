package ex0523;

public class Stu {
	
	static int count ;
	String stu_number; //인스턴스 변수 객체생성해야 사용가능
	String Stu_Name;
	int Stu_Kor;
	int Stu_eng;
	int Stu_Math;
	int Stu_Sum;
	double Stu_Avg;
	int Stu_rank;
	
	
	{//생성자의 공통부분이 존재하기 때문에 초기화 블럭을 사용한다
		count++;
		stu_number = "S"+count; //S1 S2...... 보통 DB에서 사용한다 굳이 여기서 사용안한다.
	}
	
	Stu() {}//생성자
	
	Stu(String Stu_Name, int Stu_Kor,int Stu_eng, int Stu_Math) {//모든정보는 생성자를 통해서 들어왔다가 나간다.
		
		this.Stu_Name = Stu_Name;
		this.Stu_Kor = Stu_Kor;
		this.Stu_eng = Stu_eng;
		this.Stu_Math = Stu_Math; 
		this.Stu_Sum =Stu_Kor+Stu_eng+Stu_Math;
		this.Stu_Avg = Stu_Sum/3.0; 
		
	}
}
