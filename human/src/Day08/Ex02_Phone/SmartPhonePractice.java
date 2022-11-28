package Day08.Ex02_Phone;

public class SmartPhonePractice extends PhonePractice {
	//생성자
	public SmartPhonePractice(String owner) {
		super(owner);
	}
	// 모든 객체는 클래스의 생성자를 호출해야만 생성된다.
	// 부모 객체도 예외는 아니다. 그렇다면 부모객체를 생성하기 위해 부모생성자를 어디서 호출한 것일까?
	// 이것에 대한비밀은 자식 생성자에 숨어있다.
	// 부모 생성자는 자식 생성자의 맨 첫줄에서 호출된다. 
	// 직접 자식 생성자를 선언하고 명시적으로 부모 생성자를 호출하고 싶다면
	// 자식클래스(매개변수 선언)
	// super(매개값)
	// super(매개값)은 매개값의 타입과 일치하는 부모 생성자를 호출한다. 
	// 만약 매개값의 타입과 일치하는 부모 생성자가 없을 경우 컴파일 오류가 발생한다.
	// 부모 클래스에 기본 생성자가 없고 매개 변수가 있는 생성자만 있다면 자식 생성자에서 반드시 부모 생성자
	// 호출을 위해 super(매개값)을 명시적으로 호출해야 한다. 
	
	
	
	
	//메소드
	public void InternetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}



}
