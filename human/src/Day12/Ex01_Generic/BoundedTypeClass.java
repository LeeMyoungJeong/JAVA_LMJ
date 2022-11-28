package Day12.Ex01_Generic;

class A {}

class B extends A {}
class C extends B {}

// A 상속 B
// B 상속 C

// D 가 타입지정 가능한 클래스는 B, C
class D < T extends B > {
	 private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {

	//	char c = t.charAt(0);
		// 만약에 내가 만들어 놓은 클래스들이 여러가지가 있고 상속을 많이 받고 있는 상태라고 가정
		// 부모클래스에 A라는 메소드가 정의되어 있고
		//this.t = t;

		this.t = t;
	}
}


public class BoundedTypeClass {
	
	public static void main(String[] args) {
		D <B> d1 = new D<B>();
		D <C> d2 = new D<C>();
		// D <B> d3 = new D<A>();
		// D클래스의 타입매개변수를 B클래스로 제한하고 있기 때문에,
		// D의 타입으로 B와 C만 가능하다.
		
		d1.setT(new B());
		d2.setT(new C());
		
		d2.setT(new C()); 		// d1<B>   <--- 자식객체인 C 타입 대입 가능(업캐스팅)
		//d2.setT(new B());		// d2<C>   <--- 부모객체인 B 대입 불가
		
		D d4 = new D();  		// D<B> d4 = newD<>();
		d4.setT(new B() );
		d4.setT(new C() );
		
		
	}

	
	
}
