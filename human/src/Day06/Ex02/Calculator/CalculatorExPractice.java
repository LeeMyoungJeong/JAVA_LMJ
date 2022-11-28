package Day06.Ex02.Calculator;

public class CalculatorExPractice {
	public static void main(String[] args) {
		//계산기 객체 생성
		
		CalculatorPractice calculator = new CalculatorPractice();
		int a = 20;
		int b = 5;
		int byby[] = {1,3,5,7,9};

		int dhg = calculator.plus(a,b); 
		int  Bg= calculator.minus(a,b); 
		double nng = calculator.devide(a,b); 
		int nmg = calculator.remain(a,b); 
		double ghg = calculator.multiple(a,b); 
		double Pg = calculator.average(byby); 
		
		System.out.println("더하기 : " + dhg);
		System.out.println("빼기 : " + Bg);
		System.out.println("나누기 : " + nng);
		System.out.println("나머지 : " + nmg);
		System.out.println("곱하기 : " + ghg);
		System.out.println("평균 : " + Pg);
		
	}
}
