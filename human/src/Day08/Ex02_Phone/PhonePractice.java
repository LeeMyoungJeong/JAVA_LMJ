package Day08.Ex02_Phone;

public abstract class PhonePractice {
	//phonePractice라는 추상메소드를 정의
	
	//변수 
	public String owner;  	//핸드폰 주인
	
	//생성자
	public PhonePractice(String owner) {
		this.owner = owner;
	}
	//메소드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
