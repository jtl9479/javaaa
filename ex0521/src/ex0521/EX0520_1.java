package ex0521;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class EX0520_1 {

	public static void main(String[] args) {

//		Product p1 = new Product("OLED TV", 700, 100);
//		Product p2 = new Product("냉장고",500,5);
//		Product p3 = new Product("세탁기",200,2);
		Scanner scan = new Scanner(System.in);
		
		Product[] p = new Product[4];

		for (int i = 0; i < p.length; i++) {

			System.out.println("제품명을 입력하세요");
			p[i].product_name = scan.next();

		}

		for (int i = 0; i < p.length; i++) {

			System.out.println(p[i].product_name);

		}

		System.out.println("전체 count : " + Product.count);
	}
}
