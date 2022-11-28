package Day07.Ex04_StaticMember;

public class StaticMemberPractice {

	// static 변수
	static int a;
	static int b;
	int c;
	static final double PI = 3.141592;
	//final 변수는 선언할 때 반드시 값을 초기화해야한다.
	//final 로 설정할때는 반드시 ↑ 값을 이퀄로 지정해줘야 한다.
	//final 변수 지정 
	// 그리고 그 다음부터는 클래스 혹은 메소드에서 값을 바꿀 수 없음.
	
	//static 메소드
	public static int sum(int x, int y) {
		int sum = a+b+x+y;
		// sum += c; //Cannot make a static reference to the non-static field c
		// c 는 인스턴스 변수로, 객체가 생성될 때 메모리에 할당된다.
		// static 메소드는 제일 먼저 메모리에 할당되기 때문에,
		// 나중에 메모리에 할당되는 c는 접근할 수 없다.
		return sum;
	}
	
	public static void main(String[] args) {
		int sum = sum(10,20);
		a = 100;
		int x = 10;
		StaticMemberPractice sm1 = new StaticMemberPractice();
		StaticMemberPractice sm2 = new StaticMemberPractice();
		int a1 = sm1.a;
		int c1 = sm1.c = 10;
		int a2 = sm2.a;
		int c2 = sm2.c = 20;
		
		// PI = 100;
		// The final field StaticMemberPractice.PI cannot be assigned
		
		System.out.println("a1 : " + a1);
		System.out.println("c1 : " + c1);
		System.out.println("a2 : " + a2);
		System.out.println("c2 : " + c2);
		System.out.println("sum : " + sum);
	
		//메인메소드에서 sum을 실행하니까 30으로 나옴.
	} 
}