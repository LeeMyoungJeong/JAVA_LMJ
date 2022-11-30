package Day09.Ex02_StaticNestedClass;


class AAA {
	int a = 5;
	static int b = 15;
	 
	void methodA() {
		System.out.println("인스턴스 메소드");
	}
	static void methodB() {
		System.out.println("static 메소드");
	}
		// static 이너클래스
		// static 이너클래스는 static 변수, 메소드만 접근 가능
	static class B {
		void methodC() {
			// 변수 사용
			//System.out.println(a); 
			// a 라는 변수는 static 이 아닌데 static 클래스에서 호출하니까 실행이 안됨
			System.out.println(b);
			
			// methodA(); 
			// The method methodA() is undefined for the type A.B
			// methodA는 AAA라는 클래스에 정의되어있는데
			// static class B 내부에서 접근하니까 실행이 안됨.
			methodB();
		}
	}

}


public class StaticNestedClassPr {
	public static void main(String[] args) {
		// static 이너 클래스의 객체 생성
		AAA.B b = new AAA.B();
		// 메소드 호출 
		//A안에 있는 B로부터 b 라는 변수를 호출한다.
		b.methodC(); //b.methodC(); 를 실행하니까
		
		// 15
		// static 메소드
		// 이렇게 출력되네
		// 이거 출력되는 매커니즘을 모르겠노...;;;
	}
}
