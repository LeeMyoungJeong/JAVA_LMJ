package Day02;

public class Ex07_RelationOperator {

	public static void main(String[] args) {
		
		// 비교 연산
		// 크기 비교
		// : >  <  >=  <= 
		
		System.out.println(7 > 3); //출력됨
		System.out.println(7 < 3); //출력됨
		System.out.println(7 >= 3); //출력됨
		System.out.println();
		System.err.println();  //나 왜 이거 써넣었냐... 이해안가네
		System.out.println(7 <= 3); //출력됨
		System.out.println();
		System.out.println(7 <= 4); //출력됨
		
		
		
		// 등가 비교
		// : ==, != 와 같이 같은 값인지 여부를 비교하는 연산자
		int a = 10;
		int b = 5;
		int c = 3;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a == c);
		System.out.println(a != c);  //등가비교에서는 error
		System.out.println();
		
		
		
	}
	
	
}
