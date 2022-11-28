package Day05.Inheritance;

public class JiwooPractice {

	public static void main(String[] args) {
	//ㅅㅂ 알았다
		
		PikachuPractice       pikachu1       
//그니까   그건	↑얘로부터 온	       ↑얘라는 변수야 
		= new PikachuPractice();
 	//	      ↑여기 클래스에서 뭔가 가져와서 
		System.out.println("#####피카츄#####");
		System.out.println("에너지 : " + pikachu1.energy);
		System.out.println("타입 : " + pikachu1.type);
		System.out.println("공격A : " + pikachu1.aAttack());
		System.out.println("공격B : " + pikachu1.bAttack());
		System.out.println();
		
		PikachuPractice pikachu486 = new PikachuPractice(444, "찐따화");
		System.out.println("####### 피카츄(Lv.486) #######");
		System.out.println("에너지 : " + pikachu486.energy );		 
		System.out.println("타입 : " + pikachu486.type);
		System.out.println("공격A : " + pikachu486.aAttack());
		System.out.println("공격B : " + pikachu486.bAttack());
		System.out.println();
	
		RaichuPractice raichu999 = new RaichuPractice(); 
		//라이츄999는 이제 RaichuPractice에서 오버라이딩됨. 그렇기 때문에
		System.out.println("##### 라이츄만렙 #####");
		//          라이츄999의 energy는       ↓      ↓    RaichuPractice에서 가져온 energy의 값으로 할당됨.
		System.out.println("에너지 : " + raichu999.energy );	

		System.out.println("타입 : " + raichu999.type);
		System.out.println("공격A : " + raichu999.aAttack());
		System.out.println("공격B : " + raichu999.bAttack());
		System.out.println();
	
	}	
}
