package practice;

public class Problem01 {

	public static void main(String[] args) {

		/*
		 * 1. 변수 하나를 선언
		 * 2. 변수에 값 할당
		 * 3. 변수의 값이 홀수 오알 짝수 판단
		 * 4. 홀수면 홀 , 짝수면 짝 출력
		 */
		
		int x;
		x = 5;
		
		if(x%2==1) {
			System.out.println("홀");
		}
		else if(x%2==0) {
			System.out.println("짝");
		}
	}

}
