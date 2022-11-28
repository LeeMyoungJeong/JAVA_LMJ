package Day07.Ex05_02_AccessModifier;

import Day07.Ex05_01_AccessModifier.Person; //ctrl + Shif + O

public class Student extends Person {

	public Student() {//생성자 정의
		super();
	}

	public Student(String name, int height, int age, int weight) {
		           // ↑얘네는 퍼블릭으로 지정되어있기때문에 아래에서 setage/ setweight으로 가져올 수 있음.
		super(name, height, weight, age);  
		 
		// TODO Auto-generated constructor stub
	}
	public void defaultSetting() {
		name = "이름없음";
		height = 175;
 		//여기서 
		//age = 20;
		//weight = 60;
		
		
	}
		
	}
	

