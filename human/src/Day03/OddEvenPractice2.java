package Day03;



public class OddEvenPractice2 {
			// 1~20 까지의 정수 중
			// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.
			// 1+3+5+7+9+11 ..... = sum1
			// 2+4+6+8+10 ... sum2
	public static void main(String[] args) {
		
	int oddsum = 0; //홀수 숫자 더할 변수 선언
	int evensum = 0; // 짝수 숫자 더할 변수 선언		 
	int a = 1;  //1이라는 값을 가진 임의의 변수 a 선언
	while ( a <= 20) { // a가 20보다 작거나 같으면 아래의 실행문을 실행
 		if(a % 2 == 0) { //만약 a를 2로 나눈 나머지가 0과 같다면 
 		 evensum += a ;  //evensum이라는 변수에 a를 더한다.
 		}if(a%2 == 1) { //그리고 만약 a를 2로 나눈 나머지가 1과 같다면
 			oddsum += a; // oddsum이라는 변수에 a를 더한다.
 		}a++; //그러고 나서 a에 1을 후위연산한다.
	}
 		System.out.println(oddsum);
System.out.println(evensum);
 		
	
}
}
