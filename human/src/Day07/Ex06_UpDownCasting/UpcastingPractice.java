package Day07.Ex06_UpDownCasting;

public class UpcastingPractice {
	public static void main(String[] args) {
		// 업캐스팅 (자동 타입 변환)
		// 부모 클래스 = 자식 클래스  -->> 자식클래스를 부모클래스에 대입
		PersonPractice person = new StudentPractice("김휴먼", 20, 1 ,"뮤지컬학과");
		
		// PersonPractice 클래스는  name, age만을 변수로 갖고 있음
		// StudentPractice 클래스는 name, age, grade, major를 변수로 갖고 있음
		// StudentPractice 클래스는 PersonPractice를 상속받았음
		// 스튜던트에서 부모클래스 접근할 때 업캐스팅 해줘야함.
		
		
		// 바인딩(Binding) : 연결하다.
		// : 프로그램에 사용되는 요소에 실제 값을 결정짓는 행위
		// 2가지 종류가 있음
		// 정적 바인딩 : 코드가 컴파일될때 결정되는것을 말함. 변수 등은 정적 바인딩에 해당됨
		
		// 동적 바인딩 : 프로그램이 실행되었을 때 실행시간에 결정
		// 메소드를 오버라이딩 하는 경우에는 동적 바인딩이 됨
		
		System.out.println(person);
		System.out.println(person.work());
		//System.out.println(student.grade);
		//System.out.println(student.major);  //
		// 부모 클래스에는 grade와 major 변수가 없기 때문에 업캐스팅을 하고 자식객체를 호출하면
		// 부모 클래스의 변수값만 출력됨.
		
		
		// 부모 클래스에 있는
		//System.out.println(person.grade);
		//System.out.println(person.major);
		// 업캐스팅 후 부모의 클래스에 있는 변수를 호출하면 자식 클래스의 변수가 호출됨.
		
		// 오 ㅅㅂ 뭔말인지 알겠다.
		// 저기 7번째 줄에서 StudentPractice의 변수들을 PersonPractice 클래스에 persond에 대입함
		// 그다음에 person을 실행하니까 왜 grade=1, major= 뮤지컬학과가 출력되지??
		
		
	}
}
