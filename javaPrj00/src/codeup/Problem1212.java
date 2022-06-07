package codeup;

import java.util.Scanner;
//1212 다시 풀기
public class Problem1212 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		  if(c > a && c > b) 
	      {
	         if(a+b > c) {
	            System.out.println("yes");
	         }else {
	            System.out.println("no");
	         }
	      }
	      else if(b > a && b > c) 
	      {
	         if(a+c > b) {
	            System.out.println("yes");
	         }else {
	            System.out.println("no");
	         }
	      }
	      else
	      {
	         if(b+c > a) {
	            System.out.println("yes");
	         }else {
	            System.out.println("no");
	         }
	      }
	
	}
}	