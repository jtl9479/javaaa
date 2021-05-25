package ex0525;

public class ex0525_stu {

	public static void main(String[] args) {

		
		//학생이름 : 홍길동,100,100,99
		Student s = new Student("홍길동",100,100,99);
		
		// private 직접적으로 접근이 불가능  s.kor =90;
		
		System.out.println("번호 :" + s.getStu_num());//불러올때
		System.out.println("이름 :" + s.getName());//불러올때
		System.out.println("국어점수:" + s.getKor());//불러올때
		System.out.println("영어점수:" + s.getEng());//불러올때
		System.out.println("수학점수:" + s.getMath());//불러올때
		s.setKor(90);// 값을 넣을때
		//s.setStu_num(5);
		System.out.println();
		System.out.println("번호 :" + s.getStu_num());//불러올때
		System.out.println("수정 국어점수 : " + s.getKor());
	}
}
