package Day12.Ex01_Generic;
//제네릭 기법으로 클래스 정의하기
// 클래스명 뒤에 타입 매개변수 <E>, <T>, <K,V> 등을 작성한다.
public class Box<T> {
				// 여기다 꺾쇠를 다니까 에러가 없어졌다....
	private T t;
	public T get() {
		
		return t;
	
	}
	public void set(T t) {
		this.t = t;
	}
}


