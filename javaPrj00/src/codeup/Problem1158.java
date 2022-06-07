package codeup;

import java.util.Scanner;

public class Problem1158 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x>=30 && x<=40) {
			System.out.println("win");
		}else if(60<=x && x<=70) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
		
	}

}
