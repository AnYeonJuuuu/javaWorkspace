package codeup;

import java.util.Scanner;

public class Problem1159 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(50<=x && x<=70) {
			System.out.println("win");
		}else if(x % 6 == 0) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
		
	}

}
