package Day05.Inheritance;



// 한번에 import 하기 : Ctrl + shift + O


public class Jiwoo {
	//main : 프로그램이 시작되는 메소드
	public static void main(String[] args) {
		 //객체 생성
		 //클래스타입 객체명 = new 클래스명();
		Pikachu pikachu = new Pikachu();
		System.out.println("#######피카츄#######");
		System.out.println("에너지 : " + pikachu.energy );
		System.out.println("타입 : " + pikachu.type);
		System.out.println("공격A : " + pikachu.aAttack());
		System.out.println("공격B : " + pikachu.bAttack());
		System.out.println();
		
		Pikachu pikachu20 = new Pikachu(150, "진화"); // pikachu20은 객체명임, 
							//new Pikachu 해서 생성자 생성해버림.
		System.out.println("####### 피카츄(Lv.20) #######");
		System.out.println("에너지 : " + pikachu20.energy );		// ctrl + F : 찾기 
		System.out.println("타입 : " + pikachu20.type);
		System.out.println("공격A : " + pikachu20.aAttack());
		System.out.println("공격B : " + pikachu20.bAttack());
		System.out.println();
		
		// 위의 Pikachu()괄호 안에는 인자가 없음.
		// 두번째 피카츄는 인자가 두개 전달받음. 생성자를 하나 더 정의해서 두개 인자를 받을 수 있게 해야함(순서대로).

		
		// 라이츄 객체를 기본생성하고 출력해보세요.
		//      ↓    ↓          ↓  
			Raichu raichu = new Raichu(); //라이츄 클래스에서 raichu라는 객체를 불러와야하는데.
		//  클래스타입  변수명     생성자                                  → 그러기 위해서는 Jiwoo 클래스에서
																	//Raichu 생성자 클래스로 객체 생성해줘야함
		System.out.println("#######라이츄#######");
		System.out.println("에너지 : " + raichu.energy );
		System.out.println("타입 : " + raichu.type);
		System.out.println("공격A : " + raichu.aAttack());
		System.out.println("공격B : " + raichu.bAttack());
		System.out.println();
		
		Raichu raichu40 = new Raichu(400, "mega-thunder");
		
		System.out.println("#######라이츄Lv40#######");
		System.out.println("에너지 : " + raichu40.energy );
		System.out.println("타입 : " + raichu40.type);
		System.out.println("공격A : " + raichu40.aAttack());
		System.out.println("공격B : " + raichu40.bAttack());
		System.out.println();
		
		
	}
} //energy = 100;
  //type = "thunder";
