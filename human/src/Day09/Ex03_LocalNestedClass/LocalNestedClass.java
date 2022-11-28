package Day09.Ex03_LocalNestedClass;

class A {
	int a = 100;	// 멤버변수
	
	void methodA() {
		int b = 200;  //지역변수
		
		
		//로컬 이너 클래스
		class B {
			void methodB() {
				System.out.println(a);
				System.out.println(b); //b를 출력은 할 수 있지만 값을 바꿀 수는 없음.
				a =300;
				// b= 400;  
				
				//Local variable b defined in an enclosing scope must be final or effectively final
				//로컬 변수는 final로 지정되어 값을 변경할 수 없다.
				//b 자체는 출력은 가능하지만 값을 바꿀 수는 없다. 
				//로컬 이너 클래스에서 사용하는 지역변수는 자동으로 final로 선언된다.
				// 값이 상수화됨.
				
			}
		}
		//로컬 이너 클래스 객체 생성
		B bobj = new B();
		bobj.methodB(); //  <<< ---- 얘가 로컬 이너 클래스의 값을 정의해서 출력실행했음.
	}
}

public class LocalNestedClass {

	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}
	
}
