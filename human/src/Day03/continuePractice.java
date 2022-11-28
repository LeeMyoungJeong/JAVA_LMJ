package Day03;
import java.util.Scanner; 
public class continuePractice {

	// 5개의 정수를 입력받고,
	// 입력받은 수 중 양수만 합계를 구하여 출력하시오

	public static void main(String[] args) {
		int z = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			int N = sc.nextInt();
			if (N <0 )
			continue;
			z += N; 
			
			
		}
		
		System.out.println("양수의 합 : " + z);
		sc.close();
		
		
	}

}
