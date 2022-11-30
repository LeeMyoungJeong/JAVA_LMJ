package Day09.Ex03_LocalNestedClass;
// 중첩 클래스는 메소드 안에서도 선언할 수 있다.
// 이것을 로컬클래스라고 한다.
// 로컬 클래스는 접근제한자 및 static을 붙일 수 없다.
// 로컬 클래스는 메소드 내부에서만 사용되므로 접근을 제한할 필요가 없기 때문이다.
// 로컬 클래스 내부에는 인스턴스 필드와 메소드만 선언이 가능하고 정적 필드와 정적 메소드는 선언할 수 없다.
class A {
	int a = 100;	// 멤버변수
	
	void methodA() {
		int b = 200;  //지역변수
		
		
		//로컬 이너 클래스
		class B { // class B는 void methodA() 내부에 선언되었다.
			void methodB() {
				System.out.println(a);
				System.out.println(b); //b를 출력은 할 수 있지만 값을 바꿀 수는 없음.
				a =300;
				//b= 400;  
				//Local variable b defined in an enclosing scope must be final or effectively final
				// b 라는 변수는 methodA() 내부에서 선언되었기 때문에 
				// B라는 이너클래스 내부에서는 값을 따로 할당할 수 없다. 그냥 200으로 써야한다. 
				// 하지만 a 라는 Class A의 멤버변수 a는 지금 이 클래스 어디에서나 전부 사용이 가능하다.
				
				
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
		a.methodA();		//아니시발 왜 a를 실행했는데
							// 100 
							// 200  이렇게 실행되지 
	}
	
}
