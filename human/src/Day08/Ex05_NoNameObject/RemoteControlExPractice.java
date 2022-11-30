package Day08.Ex05_NoNameObject;

public class RemoteControlExPractice {

	public static void main(String[] args) {
			// 익명 구현 객체
			// : 클래스를 정의하지 않고도, 이름없이 구현된 객체
			// new 연산자 뒤에는 클래스가 와야 하는데 이름이 없다??
			// RemoteControlPractice는 클래스가 아니라 인터페이스임.
		
			// 음 그러네 진짜로 Interface 패키지 안의 리모컨ex연습 클래스에서는
			// tvRc = new TelevisionPractice라고 해서 구현할 클래스를 선언해줬는데
		
		
		RemoteControlPractice rc = new RemoteControlPractice() { // 익명 구현 객체 자동완성됐음... 뭘까 ㅅㅂ
			// Interface의 RemoteControlExPractice와는 별개로
			// NoNameObject의 RemoteControlExPractice는 다음과 같이 다르다.
			// 일단 메인메소드 실행하고 RemoteControl 생성자 선언할때 자동생성으로 오버라이딩 호출된다
			// 
			@Override
			public void turnOn() {
				System.out.println("ON");
			}
			
			@Override
			public void turnOff() {
				System.out.println("OFF");
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("Volume : " + volume);
			}
		};		
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(50);
	}
}
