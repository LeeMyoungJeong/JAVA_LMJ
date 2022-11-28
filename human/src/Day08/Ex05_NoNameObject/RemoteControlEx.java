package Day08.Ex05_NoNameObject;

import Day08.Ex04_Interface.RemoteControl;

public class RemoteControlEx {

	public static void main(String[] args) {
		//익명 구현 객체
		// : 클래스를 정의하지 않고도, 이름ㅇ벗이 구현된 객체
		
		RemoteControl rc = new RemoteControl() {
			
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
				System.out.println("volume : " + volume);
			}
		};
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(50);
		
	}
	
}
