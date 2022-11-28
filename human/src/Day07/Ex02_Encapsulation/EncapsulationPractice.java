package Day07.Ex02_Encapsulation;

public class EncapsulationPractice {

	 // 통장계좌를 만든다고 생각을 해봐라
	 // - 예금액, 은행명, 계좌번호, 예금주 이 네가지 변수가 필요하다.
	
		private int deposit; //int 타입의 예금
		private String bank; // String 타입의 bank
		private String depoNumber; // String 타입의 depoNumber
		private String depositer; // depositer
		
	 // getter & setter 쓰고
	 // toString 쓰면 되긴 한데,
	 // ㅅㅂ 뭐였는지 기억이 안나네
	 // 기본생성자 셍성??     <--- 이걸 왜 써놨지??

		public EncapsulationPractice() {
		} //기본생성자 생성

		public EncapsulationPractice( int deposit, String bank, String depoNumber, String depositer) {
			this.deposit = deposit ;
			// this를 안쓰면 The assignment to variable deposit has no effect
			// 이런 문장이 떠버리네....
			this.bank = bank;
			this.depoNumber = depoNumber;
			this.depositer = depositer;
			// this : 참조변수.
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
			return "EncapsulationPractice [deposit=" + deposit + ", bank=" + bank + ", depoNumber=" + depoNumber
					+ ", depositer=" + depositer + "]";
		}

		





}
