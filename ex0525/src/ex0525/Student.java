package ex0525;
//객체 변수만드는변
public class Student {

	
	static int count;
	{//초기화 블럭
		count++;
		this.stu_num = count; 
	}
	Student() {}
	Student(String name,int kor,int eng,int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor+eng+math;
		this.avg = sum/3.0;
	}
	
	
	private int stu_num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private int rank;
//마우스 오른쪽버튼 누르고 소스에 들어건다
//그리고 getter,setter에 들ㅇ간다. 
//get 과 set 을 이용해서 접근을 막을수가 있다.
//get은 출력 set은 불러오기
	public int getStu_num() {
		return stu_num;
	}
//	public void setStu_num(int stu_num) {
//		this.stu_num = stu_num;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	

	
	
}
