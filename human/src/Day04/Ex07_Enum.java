package Day04;
enum Rainbow {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}
public class Ex07_Enum {
	public static void main(String[] args) {
		// ENUM (열거체)
		// - 요소들을 명명한 값으로 집합을 이룬 자료형
		// 특징
		// 1. enum 비교할 때는 값 뿐만 아니라 타입도 비교한다. 타입이 다르면 비교 불가.
		// 2. enum의 상수값이 재정의되도 다시 컴파일할 필요가 없다.
	
		// values() : 열거체의 모든 요소를 배열로 반환
		Rainbow[] arr = Rainbow.values(); // Rainbow 라는 이름을 가진 enum의 모든 요소를 배열로 반환해서 이퀄 기호를 통해 arr에 넣어준다.
		for (Rainbow color : arr) {		  // 
			System.out.print(color + " ");
		}
		System.out.println();
		
		//valueOf() : 전달된 문자열과 일치하는 열거체 상수를 반환
		Rainbow G = Rainbow.valueOf("GREEN"); // GREEN이라고 전달된 인자를 받아 그 문자열과 일치하는 열거체 상수를 반환해서 G에 넣어준다.
		System.out.println("G : " + G);
		
		// ordinal() : 해당 열거체 상수가 정의된 순서 index를 반환
		int index = G.ordinal();
		System.out.println("GREEN의 index : " + index);  // 0 1 2 3 ---> 3번째 인덱스에 존재한다.
	
	}
	
}
