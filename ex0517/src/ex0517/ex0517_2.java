package ex0517;

import java.util.Scanner;

public class ex0517_2 {
//contains 함수
//charAt(0),contains(0) 문자확인,문자출력
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 글자를 입력하세요");
		String search = scan.next();
		int count = 0;
		String[] boardTitle = { "새글이 등록되었습니다.", "홈페이지 오픈", "내일수업하나요?", "한국직업전문학교 소개", "우리반은 몇명학생이 있나요?",
				"언제까지 수업을 하나요?", "한국직업전문학교 위치가 어떻게 되나요?", "사이트 만드는 방법", "한국직업전문학교 사이트가 있나요?" };
		// 검색하여서 검색글이 포함된 것만 출력을 해보세요
		// 사이트,한국직업전문학교,수업

		for (int i = 0; i < boardTitle.length; i++) {
			if (boardTitle[i].contains(search)) {
				count++;
			} else {

			}
		}

		System.out.println("일치 갯수:" + count + "개\t");
		for (int j = 0; j < count; j++) {
			System.out.println("[" + boardTitle[j] + "]");
		}
		
	}
}

//		String[] str = { "홍길동", "홍길순", "길동스", "이순신", "강감찬", "이무동" };
//		for (int i = 0; i < str.length; i++) {
//			if (str[i].contains(search)) {//입력한 문자열 중에서 str배열안에있는 문자가 있는지 찾는 함수이다
//				System.out.println(str[i]+"이라는 문자가 있습니다.");
//			} else {
//				System.out.println("이라는 문자가 없습니다.");
//
//			}
//
//			// contains라는 함수는 해당문자가 있는지 없는지 파악하는 함수이다/ str 변수에 글자가 같은지 틀린지 확인해주는 변수이다
//		}
//	}//main
//}
// class
