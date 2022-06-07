package codeup;

import java.util.Scanner;

public class Problem1170 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
		
		
		int grade = sc.nextInt();
		int cla = sc.nextInt();
		int no = sc.nextInt();
		
		System.out.print(grade);
		System.out.print(cla);
		
		if (no<10) {
			System.out.println("0"+ no);
		}else {
			
			System.out.print(no);
			
		}
	
	}		
		
	}


