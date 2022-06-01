package var;

public class Main {

	public static void main(String[] args) {

		/*
		 * 변수란? 변하는 수
		 * int = integer = 정수타입 
		 * 
		 * 변수타입 변수명 = 리터럴(=값);
		 * 
		 * [타입]
		 * char = 문자
		 * string = 문자열
		 * 
		 * 1byte = 8bit(bit=전구 같은 것)
		 * (1byte) byte = 정수 : 표현범위 -128 ~ +127
		 * (2byte)short = 정수 : 표현범위 -3만 ~ 3만
		 * (4byte)int = 정수 : -21억 ~ 21억
		 * (8byte)long = 정수 : 표현범위 엄청 넓음 
		 * 상황에 맞게 써야함!! 
		 * 
		 * (4)float = 실수 표현범위 소수점 아래 6번째 자리
		 * (8)double = 실수 소수점 아래 13번째 자리
		 * 
		 * 오버플로우 = 한 바퀴 도는 것
		 * 
		 * 형변환 = 타입을 바꾸는 작업

- 묵시적 형변환 : 타입이 다를 시 연산할 수 없음! 하지만 컴퓨터가 알아서 변환해줌!
- 서로 다른 타입 있을 시, 큰 쪽으로 변환 일어남!
- 명시적 형변환 : 강제로 타입을 변환시킴 / 대상 앞에다 변환시킬 타입을 명시해주면  됨

       ex) (long) 값 ===== 값이 long 타입으로 변환됨

- int와 long 연산은 컴퓨터가 long으로 묵시적 형변환 해줌!
		 */
//		문자(문자 하나)
		char abc = 's';
		System.out.println(abc);
		
		//문자열 (문자 여러개)
		String sss = "sliejosi6781ejgpseigj";
		System.out.println(sss);
		
		//참 or 거짓
		boolean b = true;
		System.out.println(b);
		
		//정수(기본값 : int)
		byte by = 1;
		short s = 2;
		int age = 20;
		long l = 100L;//숫자 뒤에 붙는 L은 대소문자 상관 없음
		
		//실수(기본값 : double)
		double height = 183.2;
		float weight = 88.3f;
		
	}

}
