package codeup;

import java.util.Scanner;

public class Problem1078 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int x = 1; x<=n; x++ ) {
			if(x%2==0) {
			 sum = sum + x;}
		}
		System.out.println(sum);
		
	}

}
