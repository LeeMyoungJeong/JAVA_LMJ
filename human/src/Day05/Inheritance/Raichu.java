package Day05.Inheritance;

// 상속 키워드 : 자식 클래스 extends 부모클래스
public class Raichu extends Pikachu {

	//아무것도 정의되어있지 않아도 라이츄에 피카츄 메소드들이 상속되어있기때문에 다른 클래스에 출력가능함.
	// Alt + Shift + S  --> C 
	
	public Raichu() {
		super(200, "Super-Thunder");
	}		//에너지,    타입  	-->> 이 정보를 피카츄에 전달  --> 지우가 출력
	
	public Raichu(int energy, String type) {
		super(energy, type);
	}
	// 메소드 오버라이딩 : 메소드 재정의

	@Override //골뱅이는 어노테이션, 지금은 의미 없고 그냥 라벨을 붙여줬다고 생각하면됨
	public String aAttack() {
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
}
