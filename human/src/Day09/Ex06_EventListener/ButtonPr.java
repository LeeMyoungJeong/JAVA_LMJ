package Day09.Ex06_EventListener;

public class ButtonPr {//ButtonPr 이라는 클래스를 정의할거다.
	//OnClickListener 라는 것은 하나의 정의된 인터페이스다.
	OnClickListener listener; //ButtonPr 클래스에서 OnClickListener 인터페이스 선언.
	
	void setOnClickListener(OnClickListener listener) {
		//setOnClickListener 라는 메소드 선언
		this.listener = listener;
	}
	
	void touch () { //touch 라는 메소드 선언
		listener.onClick(); // 터치시에 listener에서 onClick메소드 실행
	}
	// 근데 그 touch 시 실행되는 listener의 onClick이라는 메소드는 인터페이스이고
	
	//클릭 이벤트 발생 시, 수행 기능을 정의한 인터페이스
	interface OnClickListener {
	//인터페이스 온클릭리스너는 onClick메소드를 실행한다.	
		void onClick();
	}


}
