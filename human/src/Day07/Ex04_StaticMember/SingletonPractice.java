package Day07.Ex04_StaticMember;

public class SingletonPractice {
	// 생성자를 Private로 정의
	private static SingletonPractice instance = new SingletonPractice();
	// 클래스를 외부에서 호출할 수 없도록 생성자 앞에 private 접근 제한자를 붙여줌.
	// 그리고 자신의 타입인 정적 필드(static)를 하나 선언하고 
	private SingletonPractice() {	
	}//자신의 객체를 생성해 초기화한다.
	
	// 인스턴스(객체)가 생성되지 않았으면 생성해주고
	// 이미 생성되어 있으면 생성된 인스턴스를 반환한다.
	
	public static SingletonPractice getInstance() { //getInstance 메소드 선언
		if( instance == null ) {//정적 필드도 private접근 제한자를 붙여 외부에서 필드값을
			//변경하지 못하도록 막는다. 대신 외부에서 호출할 수 있는 정적 메소드인 getInstance()를
			//선언하고 정적 필드에서 참조하고 있는 자신의 객체를 리턴해준다.
			instance = new SingletonPractice();
		}
		return instance;
	}
	
}
	
