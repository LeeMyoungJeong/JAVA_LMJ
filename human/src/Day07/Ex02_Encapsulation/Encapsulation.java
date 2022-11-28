package Day07.Ex02_Encapsulation;

public class Encapsulation {

	//통장계좌를 만든다고 생각해봘
	// - 예금액, 은행명, 계좌번호, 예금주 라는 변수가 필요하다
	
	private int deposit;
	private String bank;
	private String depoNumber; //The value of the field Encapsulation.depositer is not used : 아직 변수가 안사용됨
	private String depositer;
	// getter & setter
	// toString
	// 기본생성자
	public Encapsulation() {
			
		}
	public Encapsulation(int deposit, String bank, String depoNumber, String depositer) {
		this.deposit = deposit;
		this.bank = bank;
		this.depoNumber = depoNumber;
		this.depositer = depositer;
		// 모든 필드를 매개변수로 갖는 생성자
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getDepoNumber() {
		return depoNumber;
	}
	public void setDepoNumber(String depoNumber) {
		this.depoNumber = depoNumber;
	}
	public String getDepositer() {
		return depositer;
	}
	public void setDepositer(String depositer) {
		this.depositer = depositer;
	}
	@Override
	public String toString() {
		return "Encapsulation [deposit=" + deposit + ", bank=" + bank + ", depoNumber=" + depoNumber + ", depositer="
				+ depositer + "]";
	}
	
	// private로 외부에서 접근하지 못하도록 만들고
	
}
