package codeup;

import java.util.Scanner;

public class Problem1087 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for(int x = 1; x<=n; x++) {
			
			sum = sum+x; // 누적 합!!!!!(기억하기 계속 잊어버림)
			
			if(sum >= n) {
				break;
			}
		}
		
		System.out.println(sum);
		
	}

}
