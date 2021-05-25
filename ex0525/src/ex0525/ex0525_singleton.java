package ex0525;

public class ex0525_singleton {

	public static void main(String[] args) {
		
		
		
	
		Singleton s = Singleton(getInstance);
		//Singleton s = new Singleton(); 
		//객체 생성은 생성자를 이야기한다.
		//생성자에 private를 사용하면 객체 생성이 불가능하다
		
		s.setName("홍길동");
		
		System.out.println("학번 : " + s.getStu_num());
		System.out.println("이름 : " + s.getName());
	}
}
