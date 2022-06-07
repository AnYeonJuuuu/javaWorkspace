package main;

public class Main2 {

	public static void main(String[] args) {

		int x = 10;
		
//		++x;//++x라는 하나의 명명! 증가 미리 해주고
		
//		x++; // ; 명명이 끝난 후 1 증가 된다는 뜻? 
		
		System.out.println(x); //10
		System.out.println(++x); //11 : 출력되기 전에 10을 데려와서 1이 더해져서 11이 됨
		System.out.println(x++); //11 : 뒤에 ++이므로 1을 바로 증가 시키는게 아니라 출력문 끝난 후에 1이 증가 되는 것임!! 
		//출력 되고 나서 실행이 된다는 뜻임!!
		System.out.println(x); //12
		System.out.println(++x); //13
	}

}
