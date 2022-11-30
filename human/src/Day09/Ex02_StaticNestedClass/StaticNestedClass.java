package Day09.Ex02_StaticNestedClass;

class AA {
	int a =5;
	static int b = 15;
	
	void methodA() {
		System.out.println("인스턴스 메소드");
	}
	static void methodB() {
		System.out.println("static 메소드");
	}
		//static 이너클래스
		// : static 이너클래스는 static 변수/메소드만 접근 가능.
	static class B {
		void methodC() {
			// 지금 에러가 나는 것은 클래스 A에 입력된 
			// int a 변수가 static이 아니라서 그렇다. 

			//System.out.println(a); //static이 아니라 사용 불가(에러발생)
			System.out.println(b); // b는 static이라서 사용 가능
			//static 은 모든 종류의 필드와 메소드를 선언할 수 있다.
			
			
			//methodA();
			methodB();
		}
	}
}

public class StaticNestedClass {
	public static void main(String[] args) {
		//static 이너 클래스의 객체생성
		AA.B b = new AA.B();
		
		b.methodC();
	}
}
