package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== 반복문 =====");
		
		/*
 *
    - while**(조건식){실행내용}**   : 자체가 반복문!(~동안)
   	- do while
	- for**(초기식; 조건식; 증감식)**

	- break : 반복문 탈출	
    - continue : 반복문 처음으로 돌아감
    
		 */
	
		
		Scanner sc = new Scanner(System.in);
		//입력받기 위한 도구 생성, while문 위에 입력하기!!
		
		while(true) {
			//숫자 입력받기 
			int x = sc.nextInt(); //실제 입력 받기
			//숫자 출력하기
			System.out.println("입력받은 x의 값 ::: "+ x);			
			//만약에, 음수가 입력되면 반복문 종료하기
			if(x<0) {
				break;
			}
		}
		
		
		
	}	

}
