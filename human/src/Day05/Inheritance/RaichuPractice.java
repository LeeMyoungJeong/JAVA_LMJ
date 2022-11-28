package Day05.Inheritance;

//상속 키워드 : 자식 클래스 extedns 부모 클래스
public class RaichuPractice extends PikachuPractice{

	public RaichuPractice() { //라이츄는 피카츄 메소드들을 상속하기 때문에 피카츄의 메소드들을 그대로 가져올 수 있음.
		super(999, "쓰바썬더");
	}

	public RaichuPractice(int energy, String type) {
		super(energy, type);
	}

	@Override
	public String aAttack() {
		return "230만볼트";
	}

	@Override
	public String bAttack() {
		return "몸통박치기다";
	}
	
	
	
}
