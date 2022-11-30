package Day08.Ex04_Interface;

public class RemoteControlExPractice {
	
	public static void main(String[] args) {
		RemoteControlPractice tvRc = new TelevisionPractice();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true);
		tvRc.turnOff();
		System.out.println();

		RemoteControlPractice speakerRc = new SpeakerPractice();
		speakerRc.turnOn();
		speakerRc.setVolume(5);
		speakerRc.setVolume(100);
		tvRc.setMute(false);
		speakerRc.turnOff();
		System.out.println();
	
		RemoteControl.changeBattery();
		
	
	}
	
}
