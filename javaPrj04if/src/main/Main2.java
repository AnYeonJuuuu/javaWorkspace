package main;

public class Main2 {

	public static void main(String[] args) {

		System.out.println("===== switch 문 =====");
		
		//switch : case에 맞으면, 아래 내용 전부 다 실행 됨!!
		//등호(==) 여러 번 반복 할 때 사용하면 편리
		//switch ~ case, break
		int x = 10;
		switch(x) {
		case 10: System.out.println("x는 10 입니다."); break;
		case 20: System.out.println("x는 20 입니다."); break;
		case 30: System.out.println("x는 30 입니다."); break;
		}
		
	}

}
