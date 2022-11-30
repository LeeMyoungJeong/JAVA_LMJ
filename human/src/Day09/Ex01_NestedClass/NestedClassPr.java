package Day09.Ex01_NestedClass;


// 중첩 클래스
class AAAA {  // 연습하는건 좋은데 클래스를 실전용거랑 이름을 같이 정의하다보니까 중첩되어있다고 뜬다
		   // 실전용의 이름을 바꿔주니까 A 아래 The type A is already defined 에러창이 사라짐
		   // 그래도 실행은 된다.
	// 변수
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	// 메소드
	void methodA() {
		System.out.println("A 클래스 - methodA()");
	}
	// 중첩 클래스(이너 클래스) 클래스 안의 클래스를 만들 수 있음.
	
	class B {
		void methodB() {
			// 상위 클래스(아우터 클래스)에서 선언한 변수를
			// 아래 실행문에서 사용하는 중임
			// 아우터 클래스 변수의 접근지정자에 관계없이 변수 abcd사용 가능
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			methodA();
		}
	}



}

	public class NestedClassPr {
		public static void main(String[] args) {
			// 아우터 클래스 객체 생성
			AAAA a = new AAAA();
			
			// 멤버 사용
			AAAA.B b = a.new B();
			b.methodB();
		}
	}






