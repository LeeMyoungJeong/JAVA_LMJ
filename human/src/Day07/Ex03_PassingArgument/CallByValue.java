package Day07.Ex03_PassingArgument;

public class CallByValue {

	public static int sum(int a, int b) {
		a = 100;		//(3) a,b에 메소드에 있는 값이 대입.
		b = 200;
		System.out.println("***** sum 메소드 *****");
		System.out.println("(a,b) : ("+ a + ", " + b +")");
		int sum = a + b;
		return sum;
	}
	
	
	//메인메소드부터 코드가 실행
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("***** main 메소드 *****");
		System.out.println("(a,b) : ("+ a +"" + ","+ b +")");
		
		int sum = sum(a,b); //sum 메소드 실행,(2)
		System.out.println("sum : " + sum);
		
		System.out.println("***** sum 메소드 호출 후 *****");
		System.out.println("(a,) : (" + a + "," + b + ")");
	}
	
}
