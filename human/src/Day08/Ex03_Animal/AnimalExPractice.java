package Day08.Ex03_Animal;

public class AnimalExPractice {

	public static void main(String[] args) {
		DogPractice dog = new DogPractice();
		CatPractice cat = new CatPractice();
		
		dog.sound();
		cat.sound();
		System.out.println("--------");
		
		
		// 자동 타입 변환
		AnimalPractice animal = null;
		animal = new DogPractice(); //자식 클래스를 부모 클래스에 대입해서
		animal.sound();		//실행시키니까 멍멍 나옴
		
		animal = new CatPractice();  // 자식 클래스를 부모 클래스에 대입시키니까
		animal.sound();			// 야옹 나옴
		
		
		System.out.println("--------");
	}
	// public static void animalSound(AnimalPractice animal) {
	//	animal.sound();
	//
	
	
}
