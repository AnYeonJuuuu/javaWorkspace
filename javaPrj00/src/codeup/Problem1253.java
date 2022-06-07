package codeup;

import java.util.Scanner;

public class Problem1253 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int x = a; x<=b; x++) {
			System.out.print(x + " ");
		}
		for(int x = b; x<=a; x++) {
			System.out.print(x + " ");
		}
	}

}
