package Day08.Ex04_Interface;
	// 인터페이스란??
	// 추상메소드와 상수 변수로만 이루어진 클래스
	// 인터페이스는 객체를 생성할 수 없다.
	// 인터페이스 타입의 레퍼런스 변수는 선언 가능하다.
	// 인터페이스끼리 상속 가능하다.
	// 인터페이스를 상속받아 클래스를 작성하면, 모든 추상 메소드를 구현해야 한다.
public interface RemoteControlPractice {

	// 인터페이스에서 변수를 선언하면 Static Final로 선언됨
	// 클래스에 변수를 선언하면 글씨가 굵은글씨 + 기울임체로 변경됨.
	// 리모컨의 기능 중에서는 볼륨을 조절하는 기능이 있음
	// 근데 그 볼륨의 값을 상수로 지정해줄거임
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상메소드 선언 
	// : (public abstract)가 생략하고 작성할 수 있다.
	// 리모컨 기능은 전원을 켜고 끄고 볼륨을 설정하는 추상메소드로 이뤄져 있는데
	// 이것을 인터페이스라고 한다.
	void turnOn(); 			// 전원 on
	void turnOff();			// 전원 off
	void setVolume(int volume);	// 볼륨 설정
	
	// 디폴트 메소드 (default가 아닌 static, public 이면 불가하다.)
	// : 구현 객체에 할당될 인스턴스 메소드
		default void setMute(boolean mute) { 
		
		if(mute) {
			System.out.println("음소거 설정");
		}
		else {
			System.out.println("음소거 해제");
		}
	}	
		// static 메소드 (정적 메소드)
		// 구현 객체가 없어도 인터페이스만으로 호출이 가능한 메소드
		static void changeBattery() {
			System.out.println("배터리를 교환");
		}
		// 리모컨을 사용할 때 : 원격으로 무언가를 제어할 때 사용
		// ex ) 리모컨 : 인터페이스
		// ex ) 동작이 되어야 하는 것 : 에어컨 (구현객체)
}
