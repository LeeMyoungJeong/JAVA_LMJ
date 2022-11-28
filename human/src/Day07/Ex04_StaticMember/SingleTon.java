package Day07.Ex04_StaticMember;

public class SingleTon {
	//생성자를 Private으로정의
	private static SingleTon instance = new SingleTon();
	
	private SingleTon() {
		
	}
	// 인스턴스(객체)가 생성되지 않았으면, 생성해주고
	// 이미 생성되어 있으면, 생성된 인스턴스를 반환한다. 
	
	public static SingleTon getInstance() { //겟인스턴스로 가져온다.
		if( instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
	
	
}
