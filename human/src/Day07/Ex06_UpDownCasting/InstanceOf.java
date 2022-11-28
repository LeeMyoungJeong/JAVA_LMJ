package Day07.Ex06_UpDownCasting;


	class ItPerson {} //ItPerson 이라는 클래스 선언
	class DtPerson {}
	class Planner extends ItPerson{} // 플래너, 디자이너, 개발자는 전부 ItPerson을 상속받음
	class Designer extends ItPerson{}
	class Developer extends DtPerson{}
	
	public class InstanceOf {	//instanceOf
		// A instanceof B
		// : A 인스턴스가 B클래스의 인스턴스인지 확인하는 키워드
		// - A = B : true
		// - A ≠ B : false 
		
		public static void checkInstance(ItPerson atPerson) {
			
			if(atPerson instanceof Planner)
				System.out.println("기획자입니다.");
			if(atPerson instanceof Designer)
				System.out.println("디자이너입니다.");
			if(atPerson instanceof Developer)
				System.out.println("개발자입니다.");
		}
		public static void main(String[] args) {
			System.out.println("어떤 직무를 하고 계신가요?");
			checkInstance(new Planner());
			checkInstance(new Designer());
			checkInstance(new Developer());
		}
	}
