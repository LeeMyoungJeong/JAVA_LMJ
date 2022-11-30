package Day13.Ex01_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx {

	/* 
	 * List 인터페이스
	 * -객체 추가
	 * add(E)		: 맨 끝에 추가
	 * add(index, E)	: index에 추가
	 * set(index, E) 	: index의 객체를 E로 변경
	 * 
	 * -객체 검색
	 * contains(Object) : 객체가 포함되었는지 확인 (true, false)
	 * get(index) 		: index에 있는 객체를 반환
	 * isEmpty()		: 컬렉션이 비어있는지 확인
	 * size()			: 지정된 객체의 수를 반환
	 * 
	 * - 객체 삭제
	 * clear() 			: 모든 객체를 삭제
	 * remove(index)	: index에 있는 객체를 삭제
	 * remove(object) 	: 객체를 삭제
	 * 
	 */
	
	public static void main(String[] args) {
		// 벡터 객체 생성
		Vector<String> vector = new Vector<String>(10);
		
		// 개수, 용량 확인
		System.out.println("개수 : " + vector.size());
		System.out.println("용량 : " + vector.capacity());
		System.out.println();
		
		// 추가
		vector.add("아메리카노");
		vector.add("블루베리스무디");
		vector.add("헤이즐넛라떼");
		vector.add("아이스티");
		
		// 개수, 용량 확인
				System.out.println("개수 : " + vector.size());
				System.out.println("용량 : " + vector.capacity());
				System.out.println();
		// 검색
		// 반복 방법 1
		System.out.println(">>반복 1"); //args.length 와 vector.size 는 무엇이 다른가?
		for (int i = 0; i < vector.size(); i++) {//vector.size
			String item = vector.get(i);
			System.out.println("메뉴 이름 : " + item);
		}
		System.out.println();
		
		// 반복 방법 2
		System.out.println(">>반복2");
		for (String item : vector) {
			System.out.println("메뉴 이름 : " + item);
		}
		System.out.println();
		
		
		// 삭제
		// 삭제 할 때, index는 앞으로 한 칸씩 당겨짐
					//0		1		2		3		4
					//아아	블슴디	헤이즐넛	아이스티
//vector.remove(0);	//블슴디	헤이즐	아이스티	
//vector.remove(1);	//블슴디	아이스티
		vector.remove(0);
		vector.remove(1);
		vector.remove("블루베리스무디");
		vector.remove("아이스티");
		
		
		if(!vector.isEmpty()) { //벡터가 비어있는게 Not 이냐??
			for (String item : vector) {
				System.out.println("메뉴 이름: " + item);
			}
		}else {
			System.out.println("메뉴가 없습니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		//Vector는 List 인터페이스를 구현클래스
		List<String> newMenuList = new Vector<String>();
		System.out.println("메뉴 추가하기 (종료 :0)");
		do {
			System.out.print("추가 할 메뉴 이름 :");
			String menu = sc.nextLine();
			
			if(menu.equals("0"))
				break;
			newMenuList.add(menu);
		}while(true);
		
		// 반복 방법 3
		// Iterator를 이용한 방법
		// 해당 리스트 컬렉션부터 Iterator(이터레이터) 객체를 가져옴
		System.out.println(">>반복 3");
		// 1. 컬렉션객체. iterator()메소드로 Iterator객체를 가져옴.
		Iterator<String> it = newMenuList.iterator();
		System.out.print("새로 추가된 메뉴 : ");
		while( it.hasNext()) {
			String item = it.next();
			System.out.print(item);
			
			if(it.hasNext()) {//hasnext를 쓰면 아메리카노 뒤에 다른 요소가 있는지 확인을함
				System.out.print(",");}//있다면 컴마로 구분할거임
			else {
				System.out.println(); // 없으면 그냥간다.
			}
		}
		
		// 컬렉션 전체 추가
		vector.addAll(newMenuList); // 앞에 만들었던 벡터에다가 newmenuList를 전체 다 추가할거야
		System.out.print("모든 메뉴 : ");
		System.out.println(vector); //벡터에 추가한 메뉴가 들어감.
		
		// 객체 변경
		System.out.println();
		do {
			System.out.print("변경할 메뉴 (종료:0) :v"); //그러고 변경할 메뉴에 입력을받아서
			String update = sc.nextLine(); // 업데이트 객체에 입려갷줌
			
			if(update.equals("0"))break;
			
			if(!vector.contains(update)) { // false --> true
				System.out.println("변경할 메뉴가 없습니다.");
				continue;
			}	
			//해당 객체의 index 반환
			System.out.print("새 메뉴 : "); 
			String newMenu = sc.nextLine();
			
			//객체 변경
			int index = vector.indexOf(update); 
			vector.set(index, newMenu); //set은 특정인덱스에 지정한 것을 위치시킴
			System.out.println("메뉴가 변경되었습니다.");
			System.out.println(update + "--->"+ newMenu);
			
		} while(true);
		
		System.out.println("주문하실 메뉴 : ");
		String order = sc.nextLine();
		if(vector.contains(order)) {
			System.out.println(order + "(이/가) 주문되었습니다.");
		}else {
			System.out.println("존재하지 않는 메뉴입니다.");
		}
		}
		
	}				




