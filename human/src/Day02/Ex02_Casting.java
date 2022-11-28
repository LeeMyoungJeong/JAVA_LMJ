package Day02;

public class Ex02_Casting {

	public static void main(String[] args) {
		//자동 타입 변환
		//(큰 데이터타입) -> (작은 데이터타입);  이렇게 하고자 할때
		// : 작은 데이터타입을 큰 데이터타입으로 자동으로 변환
		float value1 = 3; //3은 int임, 그러나 float로도 충분히 변환 가능함.
		long value2 = 5;  //5는 int임, 그러나 long 오로도 충분히 변환 가능함.
		double value3 = 7; //7도 int임, 그러나 double로도 충분히 변환 가능함.
		byte value4 = 9;	//예외  9는 원래 int로 자바에서 인식, 근데 128이 넘지 않으니 byte로 변경 가능함 
		short value5 = 11;	//예외  11도 마찬가지임
		
		// 강제 타입 변환(명시적 타입 변환, 수동타입변환)
		// (작은 데이터타입) -> (작은 데이터타입명 명시 꼭 필수) (큰 데이터타입) ; 
		// : 변환할 데이터타입을 ()타입변환 연산자 안에 명시적으로 작성하여 타입을 변환 ㄱ
		
		byte value6 = (byte) 128; //원래 byte는 127까지밖에 못 나타내주는데 이렇게 하면 -128로 나타냄..
		int value7 = (int) 3.5; // 이 경우에는 0.5 데이터손실 발생
		float value8 = (float) 7.5; 
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		System.out.println("value4 : " + value4);
		System.out.println("value5 : " + value5);
		
		
		
		
	}

	
	
	
}
