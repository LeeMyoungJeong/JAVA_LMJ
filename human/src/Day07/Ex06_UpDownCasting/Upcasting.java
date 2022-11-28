package Day07.Ex06_UpDownCasting;

public class Upcasting {
	public static void main(String[] args) {
		// 업캐스팅 (자동 타입 변환)
		// 부모 클래스 = 자식 클래스
		Person person = new Student("김휴먼", 20, 1, "뮤지컬학과" );
		
		//펄슨 : 네임, 에이지
		//스투ㅠ던트 : 네임, 에이지 그레이드 메이저
		//스튜던트에서 부모클래스 접근할때 업캐스팅해줘야함.
		
		
		
		//바인딩(Binding) : 연결하다.
		// : 프로그램에 사용되는 요소에 실제 값을 결정짓는 행위
		// 2가지 종류가 있음.
		// 정적 바인딩
		// : 코드가 컴파일될때 결정되는것을 말함. 변수 등은 정적 바인딩에 해당됨

		
		// 동적 바인딩
		// : 프로그램이 실행되었을때 실행시간에 결정. 
		// 메소드를 오버라이딩 하는 경우에는 동적 바인딩이 됨.
		
		
		System.out.println(person);
		System.out.println(person.work());
		
		//부모 클래스에 있는 
		//System.out.println(person.grade);  //접근 그냥 불가해버림
		//System.out.println(person.major);  //접근 그냥 불가해버림
		
		//업캐스팅 후 부모의 클래스에 있는 변수를 호출하면 자식 클래스의 변수가 호출됨.
		
		
	}

}
