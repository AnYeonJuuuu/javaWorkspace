package practice;

import java.util.Scanner;

public class Problem1154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 정수 2개를 입력받고, 큰수 - 작은수 결과를 출력
		 */
		
		Scanner sc = new Scanner(System.in); // 스캐너라는 도구 생성!!! 한 번만 실행하면된 다는 의미!
		int x = sc.nextInt();//정수 입력 받음!!(입력 받으려면 스캐너라는 도구가 필요한 것!!!)
		int j = sc.nextInt();
		
		if (x>j) {
			System.out.println(x-j);
		}
		else{
			System.out.println(j-x); //수정한 부분!!(if문 아니면 바로 else니까!!)
		}
	}

}
