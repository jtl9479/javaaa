package ex0517;



	import java.util.Scanner;

	public class studentSocre {
	

		public static void main(String[] args) {
			// 학생정보 입력 홈페이지 만들기
			// 뼈대 해당하는 번호를 누르면 해당하는 입력란으로 이동한다(case문)
			Scanner scan = new Scanner(System.in);
			while (true) {
				System.out.println("[몇명을 입력할것인지 사람수를 입력하시오]");
				int people = scan.nextInt();
				System.out.println("[과목수를 입력하세요.0을 입력하면 메뉴로이동합니다]");
				int subNumber = scan.nextInt();
				int subCount = 0;
				String[] name = new String[people];
				int[][] score = new int[people][subNumber];
				int[] sum = new int[people];
				double[] avg = new double[people];
				String[] subject = new String[subNumber];
				String out = "";
				int incre = 0;
				int[] inc = new int[people];
				String subString = "";
				switch (subNumber) {
				case 0:
					System.out.println("[다시 입력합니다]");
					break;

				default:
					for (int i = subCount; i < subNumber; i++) {
						System.out.println("["+(subNumber - i) + "개 남았습니다.0을 누르면 메뉴로 이동합니다]");
						System.out.println("[과목을 입력해주세요]");
						subString = scan.next();
						if (subString.equals("0")) {// check가 0이랑 같으묜
							System.out.println("[메뉴로 이동합니다]");
							break;
						}
						subject[i] = subString;
						subCount++;
					}
					break;
				}
			

				loop1:while (true) {
					System.out.println("[해당하는 번호를 입력해주세요]");
					System.out.println("[1= 학생정보 입력]");
					System.out.println("[2= 학생정보 출력]");
					System.out.println("[3= 학생정보 수정]");
					System.out.println("[4= 학생정보 검색]");
					System.out.println("[5= 학생성적 정렬]");
					System.out.println("[0=프로그램을 초기화합니다]");
					int menu = scan.nextInt();
					switch (menu) {
					case 1: // 학생정보 입력
						System.out.println("[학생정보 입력란 입니다 0.을 누르면 메뉴로 나가집니다]");

						for (int i = incre; i < people; i++) {
							inc[i] = incre + 1;//카운트 번호에 대한 카운트 값이다
							System.out.println("["+(i + 1) + "번쨰 학생이름을 입력하세요.0을 누르면 나가집니다]");
							out = scan.next();
							if (out.equals("0")) {// check가 0이랑 같으묜
								System.out.println("[상위 매뉴로 이동합니다]");
								break;
							}
							name[i] = out; //out을 통해 이름이 저장되고 out에 저장되어있던 값이 name[i]에게 전달된다
							for (int j = 0; j < subCount; j++) {
								System.out.println("["+subject[j] + "점수를 입력하세요]");
								int subjectScore = scan.nextInt();
								score[i][j] = subjectScore;
								sum[i] += score[i][j];

							}
							avg[i] = sum[i] / subCount;
							incre++;
							if ((people - i - 1) != 0) {
								System.out.println("[" + (people - i - 1) + "명을 더 입력할수있습니다]");
							} else {
								System.out.println("[더이상 입력할수없습니다]");
							}
						}

						break;

					case 2: // 학생정보 출력
						System.out.println("[학생정보 출력란 입니다.]");
						System.out.print("번호\t이름\t");
						for (int a = 0; a < subCount; a++) {
							System.out.print(subject[a] + "\t");
						}
						System.out.print("합계\t평균\t\n");
						for (int i = 0; i < incre; i++) {
							System.out.print("[" + (inc[i]) + "]" + "\t" + name[i] + "\t");

							for (int j = 0; j < subCount; j++) {
								System.out.print(score[i][j] + "\t");
							}
							System.out.print(sum[i] + "\t");
							System.out.printf("%.2f \n", avg[i]);
						}

						break;
					case 3: // 학생정보 수정
							// 아이디 비교를한다 for문을 통해 반복적해서 입력한것을 비교한다
							// 일치하는것이 있으면 if문을 통해서 해당과목으로 넘어간다
							// 일치하는것이 없으면 잘못입력했습니다 출력
						int correct = 0;

						System.out.println("[학생정보 수정란 입니다.]");
						System.out.println("[학생이름을 입력해주세요 . 0을 누르면 나가집니다]");// 배열의 앞자리 배열 i를 담당한다
						String name2 = scan.next();
						if (name2.equals("0")) {
							System.out.println("[상위 메뉴로 이동합니다]");
							break;
						}

						for (int i = 0; i < people; i++) {
							if (name2.equals(name[i])) {
								correct = i;
							}
						}

						if (correct == -1) {
							System.out.println("[해당학생은없습니다]");
							break;
						}

						System.out.println("[" + "'" + name[correct] + "'" + " 학생을 찾았습니다" + "]");
						System.out.println("[수정할 과목을 선택해주세요]");
						for (int i = 0; i < subCount; i++) {
							System.out.printf("[" + (i + 1) + "." + subject[i] + "]");
						}
						System.out.println();
						int subjectNuber = scan.nextInt();
						System.out
								.println("[" + subject[subjectNuber - 1] + "점수는" + score[correct][subjectNuber - 1] + "]");
						System.out.println(subject[subjectNuber - 1] + "[점수를 입력하세요]");
						score[correct][subjectNuber - 1] = scan.nextInt();

						sum[correct] += score[correct][subjectNuber - 1];
						avg[correct] = sum[correct] / subCount;
						break;
					case 4: // 학생정보 검색
						// count 숫자를 입력하면 해당하는 숫자만 출력이 된다
						System.out.println("[학생정보 검색란 입니다.]");
						System.out.println("[이름을 입력해주세요]");
						String name3 = scan.next();
						System.out.print("번호\t이름\t");
						for (int a = 0; a < subCount; a++) {
							System.out.print(subject[a] + "\t");
						}
						System.out.print("합계\t평균\n");

						for (int i = 0; i < people; i++) {
							if (name3.equals(name[i])) {
								System.out.print((inc[i]) + "\t" + name[i] + "\t");
								for (int j = 0; j < subCount; j++) {
									System.out.print(score[i][j] + "\t");
									sum[i] += score[i][j];
								}
								System.out.print(sum[i] + "\t");
								System.out.printf("%.2f \n", avg[i]);
							}
						}
						break;

					case 5: // 정렬
						System.out.println("[정렬을 하고싶은 과목을 선택하세요]");
						for (int i = 0; i < subCount; i++) {
							System.out.printf("[" + (i + 1) + "." + subject[i] + "]");
						}
						System.out.println("[" + (subCount + 1) + ".합계]");
						System.out.println();
						int scoreUp = scan.nextInt();
						if ((subCount + 1) != scoreUp) { //과목 점수 정렬
							int[] score1 = new int[people];
							for (int i = 0; i < people; i++) {
								score1[i] = score[i][scoreUp - 1];
							}
							//-------------------------------------------------------------
							for (int i = 0; i < people; i++) {
								for (int j = 0; j < people; j++) {
									if (score1[i] > score1[j]) { // 오름차순
										int tmp = score1[i];
										score1[i] = score1[j];
										score1[j] = tmp;
									}
								}
							}

							System.out.print("이름\t" + subject[scoreUp - 1] + "\n");
							for (int i = 0; i < incre; i++) {
								System.out.print(name[i] + "\t" + score1[i] + "\n");
							}
						}
						//-----------------------------------------------------------------------------
						if ((subCount + 1) == scoreUp) { //합계 정렬
							for (int i = 0; i < people; i++) {
								for (int j = 0; j < people; j++) {
									if (sum[i] > sum[j]) { // 오름차순
										int tmp = sum[i];
										sum[i] = sum[j];
										sum[j] = tmp;
									}
								}
							}
							System.out.print("이름\t합계\t평균\n");
							for (int i = 0; i < incre; i++) {
								System.out.print(name[i] + "\t" + sum[i] + "\t" + avg[i] + "\n");
							}
						}
						//----------------------------------------------------------------------------------
						break;
					case 0: // 메뉴를 나온다
						System.out.println("[종류됩니다]");
						break loop1;
					default:
						// 해당하는 번호는 없습니다
						System.out.println("[잘못 입력하셨습니다]");
						break;
					}
				}
			}
		}
	}