package Day07.Ex03_PassingArgument;

public class CallByValuePractice {

	public static int sum( int a, int b) { 
	//static : 클래스에 고정된 멤버로서 객체를 생성하지 않고 사용 할 수 있는 필드나 메소드를 지칭
		a = 100; //일단 public하게 쓸 수 있는 int 타입 sum 이라는 메소드를 하나 선언
		b = 200; // a,b 변수를 생성해준다.
		System.out.println("***** sum 메소드 *****"); //sum 클래스가 실행되면 a, b, 합계가
									// 각각 10 20 30으로
		System.out.println("(a,b) : (" + a + "," + b + ")");
		int sum = a + b;
		return sum;		//리턴값으로 출력될거임.
	}
	
	public static void main(String[] args) { // 메인메소드 실행한다.
		int a = 10;		// 이때까지 a, b의 밸류는 각각 10, 20
		int b = 20;			
		System.out.println("***** main 메소드 *****");	
		System.out.println("(a,b) : (" + a + "," + b + ")");	//10 20 30 출력됨		
		int sum = sum(a,b); // 근데 여기서 sum 메소드가 실행되면
		System.out.println("sum : " + sum); // 위에서 정의된 sum이라는 메소드가 실행됨.
		// 그래서 ***** sum 메소드 *****
		// a, b, sum 값으로 각각 100 200 300 이 출력됨.
		// 그렇지만 한번 리턴되면 값이 사라지기 때문에
		
		System.out.println("*****메소드 호출 후 *****"); //sum 메소드 한번 호출되고 나서는
		System.out.println("(a,b) : (" + a + "," + b + ")" ); // a,b 의 값이 원래의 값으로 돌아옴.
	}
	
}
