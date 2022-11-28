package Day07.Ex04_StaticMember;

public class StaticMember {
	
	//static 변수
	static int a;
	static int b;
	int c;
	static final double PI = 3.141592; // final 변수 지정 
									   // final로 설정할때는 반드시 값을 이퀄로 지정해주어야한다.
										// 그리고 그 이후의 코드에서 값을 바꿀 수 없다.
	// static 메소드
	public static int sum(int x, int y) {
		int sum = a+b+x+y;
		// c는 인스턴스변수로, 객체가 생성될 때 메모리에 할당된다 sum += c;
		//스테틱 메소드는 스테틱 멤버만 접근 가능. sum은 static.
		// c는 static 멤버가 아니라서 static 안에서 사용할 수 없다.
		// static 메소드는 제일 먼저 메모리에 할당되기 때문에,
		// 나중에 메모리에 할당되는 c는 접근할 수 없다.
		return sum;
	}

	public static void main(String [] args) {
		int sum = sum(10,20);
		a = 100;
		StaticMember sm1 = new StaticMember();
		StaticMember sm2 = new StaticMember();
		int a1 = sm1.a;
		int c1 = sm1.c = 10;
		int a2 = sm2.a;
		int c2 = sm2.c = 20;
	
		// PI = 100;
		
		System.out.println("a1 : " + a1);
		System.out.println("c1 : " + c1);
		System.out.println("a2 : " + a2);
		System.out.println("c2 : " + c2);
	
	
	}


}



