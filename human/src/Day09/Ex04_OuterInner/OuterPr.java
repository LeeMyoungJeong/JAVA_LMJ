package Day09.Ex04_OuterInner;

public class OuterPr {
	String name = "아우터 클래스";
	
	void methodA()	{
		System.out.println("아우터 클래스");
	}

	class Inner {
		String name = "이너 클래스";
		// 아우터 클래스 안에 이너 클래스를 정의
		
		void methodB() {
			System.out.println("이너 클래스");
		} //메소드B 호출
		
		void print() {
			System.out.println(this.name);
			this.methodB();
			
			// 이너 클래스에서 아우터 클래스 접근하기
			// 아우터클래스. this.변수
			// 아우터클래스. this.메소드()
			// 아니 ㅅㅂ 메소드에는 ()소괄호가 붙는거를 이제야 제대로 파악하네 나는ㅅㅂㅄ이맞나보다.....
			
			System.out.println(OuterPr.this.name);
			//아우터의 자기자신의 name을 가리켜야 호출가능
			OuterPr.this.methodA();
			
		}
			// 바깥 클래스에 의존하는 클래스가 있어야 한다면 내부에 클래스를 하나 더 작성한다.
	
	}



}
