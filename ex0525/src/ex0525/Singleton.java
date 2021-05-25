package ex0525;

public class Singleton {

	private static Singleton s = new Singleton();
	//객체를 한개 만들어 놓는다. 
	//왜냐하면 생성자에 private를 걸어놔서 main에서 선언을 할수가 없다.
	//static 메모리에 바로 올라가서 공용으로 사용할수가 있다.
	
	//클래스 참조변수 객체가 선언이 되어있다.
	static int count;
	private int stu_num;
	private String name;
	
	{
		count++;
		stu_num = count;
	}
	
	private Singleton() {}//기본 생성자
	//private를 사용하는 순간 
	//main에서 객체 생성을 할수가 없다.
	
	public static Singleton getInstance() {
		//리턴타입이 Singleton이다 클래스(객체)를 리턴한다
		//getInstance를 실행하면 객체를 준다는 뜻이다
		
		//private static Singleton s = new Singleton();
		//의 s를 넘겨준다.
		return s;
	}


	public int getStu_num() {
		return stu_num;
	}

	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
