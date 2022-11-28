package Day07.Ex02_Encapsulation;

public class TestPractice {
	public static void main(String[] args) {
		EncapsulationPractice ec
		= new EncapsulationPractice (0, "국민은행", "123456-1545732", "" );
				
		ec.setDeposit(984984849);
		ec.setDepositer("이명정");
		// 쌍따옴표 안써서 그렇구나....
		int money = ec.getDeposit();
		String depositer = ec.getDepositer();
		// 이거 depositer 아래에 표시된 에러문에
		// 아래와 같이 써 있는건,
		// 변수를 써먹지 않아서 그렇구나.
		// 일단 위에 setDeposit, setDepositer에 변수 넣어서 변수 자체를 변경하긴 했는데...
		// ec라는 변수를 안써서 그런건가...
		// The value of the local variable depositer is not used
		System.out.println(ec);
		System.out.println("계좌 잔액 : " + money);
		//System.out.println("예금주 : "+ depositer);
	}
}
