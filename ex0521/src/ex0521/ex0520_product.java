package ex0521;

public class ex0520_product {

	public static void main(String[] args) {
		
		
		
		Product p1 = new Product("OLED TV", 700, 100);
		Product p2 = new Product("냉장고",500);
		Product p3 = new Product("세탁기",200,2);
		//Product[] p4 = new Product[4];
		
		System.out.println("p1 = "+p1.product_name);
		System.out.println("p1 = "+p1.price);
		System.out.println("p1 = "+p1.bonusPoint);
		System.out.println();
		System.out.println("p2 = "+p2.product_name);
		System.out.println("p2 = "+p2.price);
		System.out.println("p2 = "+p2.bonusPoint);
		System.out.println();
		System.out.println("p3 = "+p3.product_name);
		System.out.println("p3 = "+p3.price);
		System.out.println("p3 = "+p3.bonusPoint);
		System.out.println();
		System.out.println("p1 = "+p1.serialNo);
		System.out.println("p2 = "+p2.serialNo);
		System.out.println("p3 = "+p3.serialNo);
		
		System.out.println("전체 count : "+Product.count);
	}
}


//
//Product p1 = new Product("OLED TV", 700, 100);에서 입력한 값들이
//생성자로 값이 들어간다 그리고 class Product로 값이 전달된 다음에
//System.out.println("p1 = "+p1.serialNo);로 찍혀서 나오게 된다