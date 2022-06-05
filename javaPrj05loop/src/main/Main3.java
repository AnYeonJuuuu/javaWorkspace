package main;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		System.out.println("====== 반복문 ======");
		//for 도 초기식, 조건식, 증감식 이용할 것임(한 줄에 넣어줌!)
		
		//while문에는 초기식, 조건식, 증감식 이용했음!(몇 줄이 이용 됨!)
		
	
		// 사용자로부터 입력받은 숫자 만큼 출력
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
				
		for(int i=0; i < x; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i + "번 째 hello world");
		}
		
	}

}
