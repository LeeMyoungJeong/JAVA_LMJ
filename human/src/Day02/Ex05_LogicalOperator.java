package Day02;

public class Ex05_LogicalOperator {

	
	public static void main(String[] args) {
		
		//논리 연산자
		// and(&&)
		// A and B : A 와 B 둘 다 true 여야만 결과가 true
		// A	B	결과
		// F	F	F
		// T	F	F
		// F	T	F
		// T	T	T
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && (5 < 3)); //컴파일러가 이미 false여서 dead code임. 의미가 없음. 이미 결론이 나있음.
		System.out.println((5<=10) && (7>2));
		System.out.println();
		
		
		// or (||)
		// A or B : A 또는 B가 True일때, 둘 중 하나만 true 여도 결과가 true
		// A	B	결과
		// F	F	F
		// T	F	T
		// F	T	T
		// T	T	T
		
		System.out.println(true||true);  // 노란색 밑줄의 이유 : 컴파일러가 이미 얘를 입력하자마자 true 라고 인식해서 볼것도 없이 true 이기 때문에 dead code라고 하는거임
		System.out.println(true||false);
		System.out.println(false||(100<50));
		System.out.println((5<20)||(5<2)); //이미 앞에거가 true 이기 때문에 or 연산에서는 이미 true가 결과값으로 세팅됨(컴파일러에 의해)
		System.out.println();		
		
		
		//XOR (^)
		//  A XOR B : A와 B 가 다를 때 결과가 true
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ (5<3));
		System.out.println();	
		
		
		// NOT(!)
		// !A 	: A가 true면 false로, A가 false면 true로 반전
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();	
		
		int value1 = 3;
		// 쇼트 서킷 : 논리 연산의 결과를 미리 알아서, 남은 논리식을 확인하지 않는 것.
		System.out.println(false && ++value1 > 10);//&& 논리연산
		System.out.println(value1); //노란줄 생성
		// 비트연산자의 경우는 쇼트서킷이 적용되지 않는다. 
		int value2 = 3;
		System.out.println(false & ++value2 > 6); //비트연산
		System.out.println(value2); //노란줄 안생성, 결과가 false임을 알아도 계산값은 생성.
		
		int value3 =3;
		System.out.println(true || ++value3 > 5); //논리연산
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true | ++value4 > 2); //비트연산
		System.out.println(value4);
		
		
		
		
	}
}
