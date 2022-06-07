package codeup;

import java.util.Scanner;

public class Problem1171 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		int classNo = sc.nextInt();
		int num = sc.nextInt();
		
		//grade = 그냥 출력
		
		if(grade<=3) {
			System.out.print(grade);
		}
		
		
		//classNo = 경우에 따라 다름
		if(classNo>=10) {
				System.out.print(classNo);
			}else {
				System.out.print("0"+ classNo);
			}
		//num = 경우에 따라 다름
		if(num >=100) {
			System.out.print(num);
		}else if(num >=10){
			System.out.print("0"+ num);
		}else {
			System.out.println("00"+ num );
		}
		
			}
		
	}


