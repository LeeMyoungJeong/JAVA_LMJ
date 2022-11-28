package Day03;

public class WhileSumPractice {
	//1부터 100까지의 합계를 구하시오.
	//while문은 조건식이 true이면 계속 명령문을 실행
	public static void main(String[] args) {
		int a = 1;
		int sum = 0;
		while( a <= 100 ) {
			sum = sum + a++;
		}System.out.println(sum);
	}



}


