package Day03;

public class Ex05_whileSum {

	public static void main(String[] args) {
		//1부터 100까지의 합계를 구하시오.
		int sum = 0; // 이건 그냥 sum 이라는 변수 이름일뿐 다른거로 대체 가능함.
		int a =1;    // a 라는 변수 지정, 값은 1
		
		while(a <= 100) {
			//복합대입연산자
			//sum += a++;    ---> a랑 sum 이랑 더해서 sum 에 넣어주고 a++이니까 a에 맨 마지막에 1 더해라.
			//그리고 그걸 a가 100 될 때까지 수행해라
			sum += a++;  //
		
		}System.out.println("합계 : " + sum);
	}
}
