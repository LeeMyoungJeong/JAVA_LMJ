package Day09.Ex05_InnerInterface;

class A {
	//이너 인터페이스
	// : 클래스 내부에 정의한 인터페이스
	// - 인터페이스가 해당 클래스에 의존적인 기능을 정의할 때,
	// 이너 인터페이스로 작성한다.
	// ex. 이벤트 처리
	
	// 이너 인터페이스는 자동으로 static으로 지정됨. 
	interface B {
		//(public abstract) 생략 가능.
		void method();
	}
}

class C implements A.B {

	@Override
	public void method() {
		System.out.println("이너 인터페이스 구현 클래스");
	}
	
}


public class InnerInterface {
	public static void main(String[] args) {
		// 객체 생성 - 방법 1
		// 아우터클래스.이너인터페이스 객체명 = new 구현클래스();
		A.B ab = new C();
		C c = new C();
		c.method();
		
		// 객체 생성 - 방법2 (익명 이너 객체 생성)
		// 아우터클래스.이너인터페이스 객체명 = new 아우터클래스.이너인터페이스(){ }
		// 익명 이너 클래스
		// : 이름없는 구현 클래스를 객체 생성 시 정의
		A.B b = new A.B() { //클래스명을 없애고 여기에 구현할 코드를 
							//아래와 같이 작성

			@Override
			public void method() {
				System.out.println("익명 이너 클래스로 객체 생성");
				//한 번 쓰고 말 때 익명이라는 개념이 필요함.
				//한번 사용되고 프로그램이 종료될 때 까지 그 코드가 필요 없을 시 익명 개념 필요
			}
			
		};
			b.method();

	}
}
