package Day07.Ex02_Encapsulation;

public class Test {
	public static void main(String[] args) {
		Encapsulation ec
		= new Encapsulation(0, "국민은행", "123456-01-112233", "신대식님");
		
		ec.setDeposit(100000000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("계좌 잔액 : " + money);
	}
}
