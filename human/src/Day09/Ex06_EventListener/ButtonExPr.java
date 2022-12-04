package Day09.Ex06_EventListener;

public class ButtonExPr {
	
	public static void main(String[] args) {
		ButtonPr btn = new ButtonPr(); //생성자 선언??
		// 버튼에 종속이 되는 인터페이스를 정의
		btn.setOnClickListener(new CallListener());
		// CallListener의 인자를 받아 btn이라는 객체에서 셋온클릭리스너가 실행되면
		
		
		btn.touch(); //---> 얘가 "전화 버튼 클릭!!" 을 출력함
		// 버튼 안에 이너 인터페이스를 정의.
		// 콜리스너, 메세지리스너 둘 중 뭐가 넘어오냐에 따라 구현을 다르게 했음.
		btn.setOnClickListener(new MessageListener());
		btn.touch(); //---> 얘가 "메세지 버튼 클릭!!" 을 출력함.
		
		// btn.touch가 
		
	}
	
}
