package Day08.Ex02_Phone;

public class PhoneExPractice {
		public static void main(String[] args) {
			SmartPhonePractice smartPhone = new SmartPhonePractice("user");
			// SmartPhonePractice클래스에서 smartPhone이라는 키워드로 생성자를 재정의하겠다.
			// 매개변수의 owner의 값은 "user"다 
			// String 형태로만 입력이 가능함.
		smartPhone.turnOn();
		smartPhone.InternetSearch();
		smartPhone.turnOff();
			//SmartPhonePractice에는 원래 turnOn과 turnOff메소드가 없지만
		// 추상메소드인 Phone을 통해서 turnOn과 turnOff 메소드를 물려받았으므로
		// SmartPhonePractice클래스에서 실행해도 해당 메소드를 사용 가능하다. 
}
}