package ex0527;

import java.util.ArrayList;

public class Buyer {

	private String member_id;
	private String member_pwd;
	private String name;
	private int money = 2000;
	private int bonusPoint;
	private int count=0; //몇개 샀는지 확인
	
	Product[] cart = new Product[100]; // 구매목록 저장 변수 배열
	ArrayList list = new ArrayList(); //array list
	
	//구매 메소드 -> 물품가격 차감 , 보너스 포인트 추가 이름 등록

	void buy(Product p) {//void는 { } 나 void가 만나면 끊긴다
		
		if(money < p.getPrice()) {
			System.out.println("잔액이 부족합니다. 잔액을 보충해주세요");
			return ; //메소드 return;    for,which,switch ->break,continue
		}
		
		money = money - p.getPrice();
		bonusPoint = bonusPoint + p.getBonusPoint();
		//pro_name += (count+1)+"."+p.getPro_name()+"\n";
		System.out.println(p.getPro_name()+" 구매하였습니다");
		list.add(p); //arraylist 저장
		cart[count ++] =p;
	}
	
	void Main_Menu() {
		System.out.println("================================");
		System.out.println("[쇼핑몰 프로그램]");
		System.out.println("1.맥북 노트북 구매");
		System.out.println("2.아이폰 구매");
		System.out.println("3.OLEDTV 구매");
		System.out.println("4.구매목록 보기");
		System.out.println("5.현금 충전");
		System.out.println("0.프로그램 종료");
		System.out.println("구매할 상품을 고르새요");
		System.out.println("================================");
		
	}
	
	void My_Info() {
		System.out.println("현재 남은 금액 : "+getMoney());
		System.out.println("현재 보유보너스 : "+getBonusPoint());
	}
	
	
	void My_list() {
		String product_list="";
		if(list.isEmpty()) {
			System.out.println("구매한 물품이 없습니다");
			return;
		}
		int sum=0;
		for(int i=0; i<list.size(); i++) {//size 크기
//			list.get(0);//첫번째것을가지고온다
//			list.get(1);//두번째것을가지고온다
//			list.get(2);//세번째것을가지고온다
			Product p =(Product) list.get(i); //class가 object
			//Product로 보내는 이유는 object에는 pro_name의 변수가 존재하지 않아서
			//값에 대한 주소값을 가질수는 있지만 공간이 없어 출력해줄수가 없다
			//list의 class는 object로 product의 조상클래스이다 
			//조상클래스에서 자식클래스로 값을 보내기 위해서는  
			//조상클래스를 자식클래스로 형변환을 시켜줘야한다.
			//상품이름을 뽑아야하는데 pro_name
			//product_list = product_list + p.getPro_name();
			product_list = product_list + cart[i].getPro_name()+ " ";
			sum = sum + p.getPrice();
		
		}
		//System.out.println("총 구매 개수 : " + getCount());
		System.out.println("총구매 금액 : "+ sum);
		System.out.println("총구매 목록 개수 :"+list.size());
		System.out.println("구매 목록 : "+product_list);
		
		
		
//		for(int i=0; i<getCount(); i++) {
//			product_list = ""+product_list + cart[i].getPro_name()+ " ";
//		}
//		System.out.println("총 구매 개수 : " + getCount());
//		System.out.println("구매 목록 : " + product_list);
		My_Info();
	}
	
	public String getMember_id() {
		return member_id;
	}


	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}


	public String getMember_pwd() {
		return member_pwd;
	}


	public void setMember_pwd(String member_pwd) {
		this.member_pwd = member_pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		//this.money = this.money+money;
		this.money  = money;
	}


	public int getBonusPoint() {
		return bonusPoint;
	}


	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}


	
/*	 product p로 대체할수가 있다.
	void buy(Tv t) {//다형성
		
		money = money - t.getPrice(); //price가 리턴된다.
		
		bonusPoint = bonusPoint + t.getBonusPoint();
		
		cart[count++] = t;
//		cart[count] = t;
//		count ++;
	}
	
	
	void buy(SmartPhone s) {
		
		money = money - s.getPrice();
		bonusPoint = bonusPoint + s.getBonusPoint();
		
		cart[count ++] =s;
	}
	
	void buy(Computer c) {
		
		money = money - c.getPrice();
		bonusPoint = bonusPoint + c.getBonusPoint();
		
		cart[count ++] = c;
	}
	*/
	
//	//이렇게 받으면 낭비 니깐  다형성을 준다
//	//=============================
//	void buy(Computer p) {
//		
//		
//	}
//	
//	void buy(SmartPhone p) {
//		
//		
//	}
//	
//	void buy(Tv p) {
//		
//		
//	}
//	//==============================
	
}
