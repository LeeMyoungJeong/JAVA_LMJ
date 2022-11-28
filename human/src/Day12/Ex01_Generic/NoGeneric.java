package Day12.Ex01_Generic;

class Cloth {
}

class Product1 {
	private Cloth cloth = new Cloth();

	public Cloth getCloth() {
		return cloth;
	}

	public void setCloth(Cloth cloth) {
		this.cloth = cloth;
	}
}

class Car {}
class Product2 {
	private Car car = new Car();
	public Car getCar() {
		return car;
	}
}

public class NoGeneric {
	public static void main(String[] args) {
		Product1 product1 = new Product1();
		product1.setCloth( new Cloth());
		System.out.println( product1.getCloth());
	
		Product2 product2 = new Product2();
		product2.setCar(new Car());
		System.out.println(product2.getCar);

		// Object 클래스로 타입을 선언
		// : 어떤 클래스든 업캐스팅하여 받아올 수 있다.
		//   - 문제 : 그렇게 해서 받아 온 인스턴스를 다시 가져와야 할 때 
		// 			실수로 다른 타입으로 타입변환을 하게 될 수 있다.
		
	//	product2.setCar( new Cloth()); // 오류가 난다.
		// 한 상자에 여러개의 제품 타입을 담고 싶을때 필요타
		
		
	}
}
