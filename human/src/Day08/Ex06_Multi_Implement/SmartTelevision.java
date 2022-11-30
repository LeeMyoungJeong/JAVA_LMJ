package Day08.Ex06_Multi_Implement;

// 인터페이스 구현 키워드 : implement
public class SmartTelevision
implements RemoteControl, Searchable{ //Searchable 이라는 인터페이스도 상속해서 실행 가능하다.
	//그러니까 2개의 인터페이스를 하나의 클래스가 실행 가능하다는건데
//다중상속이 가능하다

	// 변수 설정
	private int volume; // 음량

	public void turnOn() // 전원 켜기
	{
		System.out.println("TV전원을 켭니다."); 
	}
	public void turnOff()
	{
		System.out.println("TV전원을 끕니다.");// 전원 끄기
	}

	public void setVolume(int volume) { 
		// 유효성 검사
		// 볼륨 최대값을 넘지 못하게 설정
	if (volume > RemoteControl.MAX_VOLUME)
	{	this.volume = RemoteControl.MAX_VOLUME;
	}else if( volume < RemoteControl.MIN_VOLUME){
		this.volume = RemoteControl.MIN_VOLUME;
	}
	else {
		this.volume = this.volume = volume;
	}
	System.out.println("현재 TV 볼륨 : "+volume);}
	// 유효한 볼륨값 설정
	@Override
	public void search(String url) {
		System.out.println(url + "경로를 검색합니다.");
	
		
	}
}
