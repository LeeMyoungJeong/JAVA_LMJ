package Day02;


import java.util.*;

public class ifPractice {

	public static void main(String[] args) {
		//입력받은 값이 짝수면 짝수, 홀수면 홀수로 아래에 나타나게 ㄱㄱ
	 Scanner sc = new Scanner(System.in);
	 System.out.print("입력 : ");
	 int 입력 = sc.nextInt();
		if( 입력 % 2 == 0) {
			System.out.println("짝수");
		}
		else {System.out.println("홀수");
		}
		sc.close();
	}
}
