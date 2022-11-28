package Day07.Ex05_02_AccessModifier;

import Day07.Ex05_01_AccessModifier.PersonPractice;
//여기에서 ctrl + shift + o 는 뭘 뜻하는건가...

public class StudentPractice extends PersonPractice{
	public StudentPractice() {
		super();
	}
	
	public StudentPractice(String name, int height, int age, int weight) {
						// ↑ 얘네는 퍼블릭으로 지정되어있기 때문에 아래에서 age, weight은 set으로 가져올 수 있음.
		
		super(name, height, weight, age);
		
	}
	public void defaultSetting() {
		name = "이름없음";
		height = 175;
		//age = 30; The field PersonPractice.age is not visible
		//weight = 65; The field PersonPractice.weight is not visible
	}



}
