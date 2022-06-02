package practice;

import java.util.Scanner;

public class Problem1166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 윤년판별
 * https://codeup.kr/problem.php?id=1166 
 * (1) 400의 배수이면 무조건 윤년이다.
	(2) (1)이 아닌 수 중에 4의 배수이며, 100의 배수가 아니면 윤년이다.
 */
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if (year % 400 == 0) {
			System.out.println("Leap");
		}
		else if (year%4 == 0 && year%100 != 0) {
			System.out.println("Leap");
		}
		else {
			System.out.println("Normal");
		}
	}

}
