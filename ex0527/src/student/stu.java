package student;

public class stu {

	//변수
	//번호 이름 국어 수학 영어 합계 평균 랭크
	
	static int count;
	private int stu_count;
	private String name;
	private int kor;
	private int math;
	private int eng;
	private int sum;
	private double  avg;
	private int rank;
	
	{
		count++;
		stu_count = count;
	}
	
	stu(){}
	
	
	
	stu(String name,int kor, int math){
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.sum = kor+math;
		this.avg = sum/3.0;
		this.rank = rank;
	}
	
	stu(String name,int kor, int math,int eng ){
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.sum = kor+math+eng;
		this.avg = sum/3.0;
		this.rank = rank;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		stu.count = count;
	}

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

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
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

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getStu_count() {
		return stu_count;
	}

	public void setStu_count(int stu_count) {
		this.stu_count = stu_count;
	}
	
	
	
	
}
