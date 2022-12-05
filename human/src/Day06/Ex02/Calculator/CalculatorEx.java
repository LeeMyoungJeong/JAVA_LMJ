package Day06.Ex02.Calculator;

public class CalculatorEx {
	public static void main(String[] args) {
	
		//계산기 객체 생성
		Calculator calculator = new Calculator();
		double a = 10;
		double b = 5;
		double arr[] = {1, 2, 3, 4, 5};
		
		double plus = calculator.plus(a,b);
		double minus = calculator.minus(a,b);
		double multiple = calculator.multiple(a,b);
		double divide = calculator.divide(a,b);
		double sum = calculator.sum(a,b);
		double avg = calculator.avg(a,b);   
		
		System.out.println("plus : " + plus);
		System.out.println("minus : " + minus);
		System.out.println("multiple : " + multiple);
		System.out.println("divide : " + divide);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
