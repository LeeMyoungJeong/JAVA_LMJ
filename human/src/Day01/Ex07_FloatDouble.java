package Day01;

public class Ex07_FloatDouble {
	
	public static void main(String[] args) {
		
		
		// 실수타입 변수 선언
		double var1 = 3.14;
		float var2 = 3.14F; // java는 일단 소숫점 쓰면 기본적으로 double로 인식함
		 // 근데 변수 선언을 float 이라고 앞에서 해버렸으니 뒤에 F 안붙여주면 error 발생.
		
		// 정밀도
		double var3 = 0.1234567890123456789;
		float var4 = 0.1234567890123456789F;
		
		double PI = Math.PI;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		System.out.println("원주율 : " + PI);
		
		
		
	}


}