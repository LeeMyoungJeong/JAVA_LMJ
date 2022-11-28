package Day10.Ex05_UseDefineException;
// 창고의 기능을 정의해보는 클래스
public class Stroage {
	//창고에 보관한 물건 개수에 대한 변수 정의, 이름은 count
	private int count;
	// 창고에 보관 가능한 최대 물량은 20개
	final static int MAX_COUNT = 20;
	// 생성자
	public Storage() {
		
	}
	//입고
	// void : 반환타입이 없음을 의미 (return 키워드로 반환값 지정 불가)
	// int ---> return(int)값;
	public void in(int count) throws StorageOverflowException{
		this.count += count;
		if( this.count + count > MAX_COUNT) {
			throw new StorageOverflowException("입고 불가");
		}
		
	}
	// 출고
	public void out(int count) {
		if(this.count -= count < 0) {
			throw new StorageOverflowException("출고 불가");
		}
		this.count -= count;
	}
}