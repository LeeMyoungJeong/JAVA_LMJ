package Day03;

public class Ex04_while {
	// 1~20 까지 공백을 두고 출력하시오.

	public static void main(String[] args) {
		int a = 1;

		// 조건?
		while (a <= 20) {
			System.out.println(a); // a가 20보다 작거나 같을때 
			 // System.out.println(a); 가 a++보다 아래에 위치하면 콘솔에는 21까지 출력됨...
			 // a 가 20보다 작거나 같을 때 while 아래의 실행문을 실행해라.
			 // 그 작업이 끝나면 a++를 시켜줘라 
			a++; // a++를 시켜줘라
		}	// 그리고 다시 올려 보낸다.
	}

}
