package Ex01_Wrapper;

public class ValueCompare {
	public static void main(String[] args) {

		Integer intObj1 = 10;
		Integer intObj2 = 10; // 값 자체만 놓고 보면 같지만 객체이기 때문에
		
		System.out.println("intObj2 == intobj2");
		System.out.println("결과 : " + (intObj1 == intObj2));  // 대등연산자로 비교하게 되면 intObj1과 intObj2의 참조주소값을 비교
		System.out.println("언박싱하여비교");
		System.out.println("결과 : " + (intObj1.intValue() == intObj2.intValue())); // 값을 꺼내서 비교하면 당연히 같다.
		//equals( ) : 래퍼객체가 가진 내부의 값을 비교하는 메소드
		System.out.println("equals(  )로 비교");
		System.out.println("결과 : " + intObj1.equals(intObj2));
		
		System.out.println("--------------------");
		
		Integer intObj3 = 200;
		Integer intObj4 = 200;
		
		// ==, != 기호로 래퍼객체를 비교하면,
		// 자바에서 정수 타입은 -128 ~ 127 범위에서 내부의 값을 바로 비교할 수 있다.
		// 위에거는 -128 ~ 127 안에 있는 10 이기 때문에 비교가 가능함.
		// 아래것은 200이라 범위 밖이라서 false 출력됨.
		// Boolean 타입은 : True, False
		// char			: \u0000 ~ \007f 까지는 단순 내부비교 가능함. (== / =! 사용해서)
		System.out.println("intObj3 == intobj4");
		System.out.println("결과 : " + (intObj3 == intObj4));	 
		System.out.println("언박싱하여비교");
		System.out.println("결과 : " + (intObj3.intValue() == intObj4.intValue()));
		//equals( ) : 래퍼객체가 가진 내부의 값을 비교하는 메소드
		System.out.println("equals(  )로 비교");
		System.out.println("결과 : " + intObj3.equals(intObj4));
		
	
	}
}
