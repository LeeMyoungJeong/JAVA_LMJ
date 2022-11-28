package Day08.Ex06_Multi_Implement;

public interface RemoteControl {

	//인터페이스에서 변수를 선언하면 Static Final로 선언됨.
	//클래스에 변수를 선언하면 글씨가 저렇게 안되었음.
	//굵은글씨 + 기울임체로 변경됨.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드 선언
	// : (public abstract)가 생략하고 작성할 수 있다.
	void turnOn();		//전원 on
	void turnOff();  // 전원 off
	void setVolume(int volume); //볼륨 설정
	//리모트 컨트롤의 공통기능을 추상메소드로 정의
	
	
	// 디폴트 메소드 
	// : 구현 객체에 할당될 인스턴스 메소드
	default void setMute(boolean mute) {//음소거 기능을 디폴트
		if(mute) {
			System.out.println("음소거 설정");
		}else {
			System.out.println("음소거 해제");
		}
	}
	// static 메소드 (정적 메소드)
	// 구현 객체가 없어도 인터페이스 만으로 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("배터리를 교환");
	}
	// 리모컨을 사용할 때 : 원격으로 무언가를 제어할 때 사용
	// ex )리모컨 : 인터페이스
	// ex )동작이 되어야 하는 것 : 에어컨 (구현객체)
	
	
}
