package Day08.Ex03_Animal;

public class DogPractice extends AnimalPractice{
	
	public DogPractice() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	
	
}
