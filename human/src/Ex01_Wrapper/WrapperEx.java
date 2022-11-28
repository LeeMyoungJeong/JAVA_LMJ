package Ex01_Wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		
		char a= 'a'; //a라는 변수에 문자 a
		char A = 'A';
		
		System.out.println(Character.toLowerCase(A));
		System.out.println(Character.toUpperCase(a));
		
		char  c1 = '7', c2 = 'K';
		
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "은/는 숫자");
		}
		
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "은/는 영문자");
		}
		//Integer 사용
		System.out.println(Integer.parseInt("28")); 	//문자열 -> 정수
		System.out.println(Integer.toString(28)+2);	// 정수 -> 문자열
		System.out.println(Integer.toBinaryString(28)); 	// 16진수를 문자열로 변환
		System.out.println(Integer.bitCount(28));		// 2진수의 1의 개수
		
		
		// deprecated : 더 이상 사용되지 않는 문법임을 나타냄
		// Integer i = new Integer(28); 
		Integer i = 28;
		System.out.println(i.doubleValue());  //더블로 나타냄
		
		// Double 사용
		Double d = 3.14;
		System.out.println(d.toString() + 0.06);  //d.toStirng 하면 문자로 취급 그래서 3.140.06이됨		
		System.out.println(Double.parseDouble("3.14")+0.06); //문자를 실수타입으로 변환함.
		
		// Boolean 사용
		Boolean b = (i < 40); //true 
		// Boolean a = ( x % 3 =0)
		// Boolean sysout(0) if b = true 
		// 369 쓸수있을거같은디....
		System.out.println(Boolean.toString(b)); //true
		System.out.println(Boolean.parseBoolean("false")); //
		
		
		
		
		
	}
	
}
