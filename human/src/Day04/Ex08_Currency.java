package Day04;
// enum 이란??

// 클래스처럼 보이게 하는상수
// 서로 관련있는 상수들끼림 모아 상수들을 대표할 수 있는 이름으로 타입을 정의하는 것
// Enum 클래스 형을 기반으로 한 클래스형 선언

import java.util.Scanner;

enum Currency {
	DOLLAR(1318), EURO(1361), YEN(9), YUAN(187);
	// The constructor Currency(int) is undefined 
	// 생성자가 정의되지 않았다고 떴음.
	int value;

	private Currency(int value) {
		this.value = value;
	// 생성자를 정의했어야 하는데 여기서 prvate라고 오타가 존재했음
	// prvate -- > private로 오타 수정
	}

	public int getValue() {
		return value;
	}

}

public class Ex08_Currency {

	public static void main(String[] args) {
		System.out.println("1.달러환율");
		System.out.println("2.유로환율");
		System.out.println("3.엔 환율");
		System.out.println("4.위안환율");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Currency currency;

		switch (choice) {
		case 1:
			currency = Currency.DOLLAR;
			break;
		case 2:
			currency = Currency.EURO;
			break;
		case 3:
			currency = Currency.YEN;
			break;
		case 4:
			currency = Currency.YUAN;
			break;

		default:
			currency = Currency.DOLLAR;
			break;
		}
		System.out.println("환율은" + currency.getValue() + "원 입니다.");
		sc.close();
	}
}
