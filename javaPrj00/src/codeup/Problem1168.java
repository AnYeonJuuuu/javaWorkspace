package codeup;

import java.util.Scanner;

public class Problem1168 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int birth = sc.nextInt();
		int gender = sc.nextInt();
		
		int year = birth/10000;
		
		int answer = 0;
		
		if(gender == 1 || gender ==2  ) {
			answer = 2012 - (1900 + year) + 1;
		}else {
			answer = 2012 - (2000 + year) + 1;
		}
		
		System.out.println(answer);
		
		
//		// 출생년도로 나이 구하기
//		Scanner sc = new Scanner(System.in);
//		int birth = sc.nextInt();
//		int gender = sc.nextInt();
//		
//		//앞 두 자리만 구하기
//		int year = birth/10000;
//		
//		//나이 계산
//		int answer = 0;//초기화
//		if(gender == 1 || gender == 2 ) {
//			answer = 2012 - (1900 + year) + 1;
//			
//		}else {
//			answer = 2012 - (2000 + year) + 1;
//		}
//		
//		System.out.println(answer);
		
		
	}

}
