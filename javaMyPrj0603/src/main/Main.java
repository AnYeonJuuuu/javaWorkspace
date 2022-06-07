package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== ㅇㅇ몰 예약 확인 시스템입니다. ===== \n* 이름, 나이, 예약번호를 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("↓↓ 이름을 입력해주세요 ↓↓");
		String name = sc.nextLine();
		
		System.out.println("↓↓ 나이를 입력해주세요. ↓↓");
		int age = sc.nextInt();
		sc.nextLine();
		                                                                                                                                                                                                                                                                                                                                                                                                                          

		for(;;) {
			System.out.println("↓↓ 예약번호를 입력해주세요. ↓↓");
			int res = sc.nextInt();
			
			System.out.println("");
			if(res>=100 && res<200 ) {
				System.out.println("▣ "+ name + "(" +  age + ")" + "님," 
						+ "\n[No.]" + " " + res 
						+ "\n[위치] \"파란머리 미용실\" 블루동 203호 "
						+ "\n[일시] 22.03.22(화) 10:30 "
						+ "\n[항목] 디자이너커트 "
						+ " \n***** 예약입니다. *****");
				break;
			}else if(res>=200 && res<300) {
				System.out.println("▣ "+ name + "(" +  age + ")" + "님,"
						+ "\n[No.]" + " " + res 
						+ "\n[위치] \"Green & Flower\" 그린동 305호 "
						+ "\n[일시] 23.04.23(금) 19:00 "
						+ "\n[항목] 식물 가드닝 클래스 "
						+ " \n***** 예약입니다. *****");
				break;
			}else if(res>=300 && res<400) {
				System.out.println("▣ "+ name + "(" +  age + ")" + "님,"
						+ "\n[No.]" + " " + res 
						+ "\n[위치] \"옐로 카페\" 옐로우동 104호 "
						+ "\n[일시] 25.11.03(월) 13:00 "
						+ "\n[항목] 아이스아메리카노2잔 + 브런치 set"
						+ " \n***** 예약입니다. *****");
				break;
			}else if(res>=400 && res<500) {
				System.out.println("▣ "+ name + "(" +  age + ")" + "님,"
						+ "\n[No.]" + " " + res 
						+ "\n[위치] \"Orange Gallery\" 오렌지동 211호 "
						+ "\n[일시] 27.03.08(화) 16:00 "
						+ "\n[항목] ::과일 그림 대전::"
						+ " \n***** 예약입니다. *****");
				break;
			} else {
				System.out.println("===== 올바르지 않은 예약번호입니다. 예약 번호를 다시 입력해주세요. =====");
				
				continue;
			}
			
		}
		
	}

}
