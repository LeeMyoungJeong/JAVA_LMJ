package Day08.Ex06_Multi_Implement;

import Day08.Ex04_Interface.RemoteControl;

public class SmartTelevisionPractice implements 
RemoteControl, Searchable {

	public int volume; // volume 이라는 변수를 다룰 interface 들을
	// 아래에서 오버라이딩 해서 가져온건데...
	// Searchable 에서 search
	// RemoteControl에서 켜고 끄고 볼륨설정하는 메소드 가져왔다.

	@Override
	public void turnOn() { //turnOn이 실행되면
		System.out.println("TV전원을 켭니다.");
	}

	@Override
	public void turnOff() {//turnOff가 실행되면
		System.out.println("TV전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;}
		else {
			this.volume = volume;
		}System.out.println("현재 TV 볼륨 : "+ volume);
	}
	
	@Override
	public void search(String url) {
		System.out.println(url + "경로를 검색합니다.");
	}




}


