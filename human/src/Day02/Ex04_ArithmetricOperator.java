package Day02;

public class Ex04_ArithmetricOperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c;
		
		c = a++ + b; // a + b 하고 마지막에 1더함 (후위연산, 연산 우선순위가 가장 낮음)
		
		int x = 10;
		int y = 20;
		int z;
		
		z = ++x + y;
		System.out.println("z = " + z); // 전위연산, x에다가 1 더해서 그다음에 y 더해라
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		System.out.println("x = " + x);
	
	}
	
	
}
