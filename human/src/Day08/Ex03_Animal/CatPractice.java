package Day08.Ex03_Animal;

public class CatPractice extends AnimalPractice {
	
	public CatPractice() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}
