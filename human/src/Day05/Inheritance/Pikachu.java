package Day05.Inheritance;

public class Pikachu {
	
		// 메인메소드는 실행하는 메소드
		// 그래서 피카츄 클래스에는 메인메소드가 필요 없음.
	 	// 피카츄에는 피카츄라는 객체를 설계만 할거임.
	
		// 클래스		: 객체를 정의하는 설계도
		// 멤버		: 변수, 메소드
	
	// 변수
	public int energy; //퍼블릭 하게 쓸 수 있는 int타입의 energy라는 변수 생성
	public String type; //퍼블릭 하게 쓸 수 있는 string 타입의 type이라는 변수 생성
	
	// 생성자 정의
	public Pikachu() {
		energy = 100;
		type = "thunder";
  	}		//객체가 생성될 때 실행되는 메소드
	
	// 생성자를 자동 완성하는 단축키 : Alt + Shift + S --> O (constructor using field)
	// 매개변수가 있는 생성자
	// 메소드(생성자) 오버로딩
	public Pikachu(int energy, String type) {
		this.energy = energy; //객체 자기자신을 가리킨다는 말이됨.
		this.type = type;
		
	}    // ---> 지금 이것을 alt + shift + s로 생성해냈음

	// 메소드
	// 접근지정자 반환타입 메소드명 (매개변수) { };
	public String aAttack() {
		return "십만볼트"; 
	}
	 
	public String bAttack() {
		return "전광석화";
	}
	// return (값);
	// 1. 메소드를 종료
	// 2. 메모리 공간을 해제
	// 3. (값) 을 메소드를 호출한 자리로 반환

	@Override // 오버라이드???
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}
	
	
	
}	
	

