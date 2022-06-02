package practice;

import java.util.Scanner;

public class Problem1228 {

	public static void main(String[] args) {
//1.키, 몸무게 입력받기
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
//2. 표준몸무게 계산
		double sw = (height-100)*0.9;
		
//3. 비만도수치계산 
		double bmi = (weight-sw)*100/sw;
		
//4. 수치에 따라 등급 출력		
		if(bmi<=10) {
			System.out.println("정상");
		}
		else if(bmi <= 20) {
			System.out.println("과체중");
		}
		else {
			System.out.println("비만");
		}
		}

}
