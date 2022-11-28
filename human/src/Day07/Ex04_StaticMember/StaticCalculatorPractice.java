package Day07.Ex04_StaticMember;

// 아래의 연산 결과를 구하는 메소드를 정의하시오.
// 1. 절댓값 (absolute value)
// 2. 최댓값
// 3. 최솟값

 class Calculators{ //Calculator 라는 class가 이미 다른 클래스에 정의되어 있기 때문에 
	 				// 이름을 부득이하게 Calculator's' 로 변경함.

	 public static int abs(int val) { // abs라는 메소드 정의함, val 이라는 변수를 활용
		 return val > 0 ? val : -val; // val 이 0보다 크면 val이고, 아니면 -val이다.
	 }
	 
	 public static int max(int arr[]) { // max 라는 클래스는 arr[] 배열 사용하는데,
		 int max = Integer.MIN_VALUE;	// max 값을 찾으려면 MIN_VALUE 서부터 출발해야한다.
		 for (int a : arr) {	// arr에 있는 임의의 a 라는 변수가 max보다 크면 max는 a 가 되는거다
			if(max < a)			// 근데 그걸 foreach 함수를 사용해서 조건문이 false가 될때까지 반복한다.
				max = a;
		}
		 return max;
	 }
	 
	 public static int min(int arr[]) { //min 이라는 클래스는 int 타입 arr[] 배열로 구성됨.
		 int min = Integer.MAX_VALUE; //min은 그 클래스의 MAX_VALUE에서 출발하고
		 for (int a : arr) {	//arr배열의 a 라는 임의의 숫자가 min 보다 크면 min은 a 가 된다.
			if (min > a)	//그리고 그걸 조건문이 false가 될 때까지 실행함.
				min = a;
		}
		 return min; //그리고 min 값을 return 해라.
	 }
}
 	public class StaticCalculatorPractice { //public Class 실행
 		
 		public static void main(String []args) { //메인메소드 실행
 			int arr[] = {70, 90, 85, 50, 100};  //	arr[] 배열은 5개의 수로 구성됨.
 			
 			System.out.println("abs(123) = " + Calculators.abs(-123));
 			System.out.println("max(arr) = " + Calculators.max(arr));
 			System.out.println("abs(123) = " + Calculators.min(arr));
 		
 	}
 	}