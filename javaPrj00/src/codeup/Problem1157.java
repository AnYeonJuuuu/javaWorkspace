package codeup;

import java.util.Scanner;

public class Problem1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
		
		if(x>=50 && x<=60) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}
	}

}
