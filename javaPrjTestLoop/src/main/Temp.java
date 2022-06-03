package main;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine(); // 붙여줌으로서 제대로 결과 나옴
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("=====입력결과=====");
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
	}

}
