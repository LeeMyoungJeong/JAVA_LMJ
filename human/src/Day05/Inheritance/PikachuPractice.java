package Day05.Inheritance;

public class PikachuPractice {
//여기에 피카츄라는 객체를 생성할거임. 
	public int energy; //에너지를 나타내줄 int 타입의 변수
	public String type; //어떤 속성의 포켓몬인지 나타내줄 String 타입의 변수
	

	//생성자 선언을 하려 하니까 class 이름이랑 같지 않아서 에러가 발생했다... ㅅㅂ 이게 뭔말이지?
	public PikachuPractice() {
		energy = 333;
		type = "썬더"; // 생성자 선언 완료.
	}

	public PikachuPractice(int energy, String type) {
		this.energy = energy;
		this.type = type;
	}
		
	public String aAttack() {
		return "시부랄만볼트";
	}
	public String bAttack() {
		return "배구랄만볼트";
	}

	@Override
	public String toString() {
		return "PikachuPractice [energy=" + energy + ", type=" + type + "]";
	}//			 생성자의 이름		생성자의객체1   객체정보		객체2		객체정보
	// 어떻게 해서 이런 메커니즘으로 작성이 되는거지?
	// 뭘 불러온걸까??
	
}
