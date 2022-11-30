package Day08.Ex06_Multi_Implement;

public class RemoteControlExPractice {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		// SmartTelevision의 tv라는 객체를 생성자로 초기화
		
		RemoteControl rc = tv; // tv는 RemoteControl인터페이스의 rc 라는 객체를 실행할거다. 
		Searchable searchable = tv; //tv는 Searchable인터페이스의 searchable이라는 객체를 실행할거다.
		
		rc.turnOn();  //turnOn을 가져와서 rc에 넣고 실행해라
		searchable.search("youtube.com"); //search를 가져와서 searchable에 넣고 실행해라
		rc.setVolume(8);  // setVolume에 8이라는 인자를 넣어서 rc에 넣고 실행해라
		rc.turnOff(); 	//turnOff를 rc에 가져와서 실행해라.
	}
}
