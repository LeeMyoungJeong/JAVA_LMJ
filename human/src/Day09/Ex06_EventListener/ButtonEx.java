package Day09.Ex06_EventListener;

public class ButtonEx {

	public static void main(String[] args) {
		Button btn = new Button();
		//버튼에 종속이 되는 인터페이스를 정의
		btn.setOnClickListener(new CallListener());
		btn.touch();
		//버튼 안에 이너 인터페이스를 정의.
		// 콜리스너, 메세지리스너 둘 중에 뭐가 넘어오냐에 따라 구현을 다르게 했음.
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		// 뭐 ㅅㅂ 이해는 하나도 안가는데 일단 복습 조져라 명정아.
	}
}
