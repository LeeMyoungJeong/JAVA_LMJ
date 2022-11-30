package Day14.Ex02_Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class UserList {

	public static void main(String[] args) {
		
		LinkedList<User> userList = new LinkedList<>();
		
		User2 u1 = new User2("cca1004", "홍휴먼", 30);
		User2 u2 = new User2("bac1004", "박휴먼", 30);
		User2 u3 = new User2("cab1004", "유휴먼", 10);
		User2 u4 = new User2("abc1004", "김휴먼", 20);
		User2 u5 = new User2("ffa1004", "장휴먼", 20);
		User2 u6 = new User2("ffa1004", "김교육", 30);
		User2 u7 = new User2("ffa1004", "정휴먼", 30);
		User2 u8 = new User2("ffa1004", "권휴먼", 10);
		User2 u9 = new User2("ffa1004", "고휴먼", 10);
		User2 u10 = new User2("ffa1004", "송휴먼", 20);
		
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		userList.add(u6);
		userList.add(u7);
		userList.add(u8);
		userList.add(u9);
		userList.add(u10);
		// The method add(User) in the type LinkedList<User> is not applicable for the arguments (User2)
		// Collection.sort( 리스트, Comparator 구현객체)
		// - 오버라이딩한 compare 메소드의 기준에 따라서 정렬된다.
		// 이름순으로 정렬이 된걸 확인이 가능했다.
		
		
		// 그럼 정렬 기준을 2개 하면??
		Collections.sort(userList, new User());
		
		for (User2 user : userList) {
			System.out.print("id : " + user.id);
			System.out.print(", name : "+ user.name);
			System.out.println(", age : "+ user.age);
			//println은 프린트 한 다음에 엔터로 한줄 넘겨준다.
			
		}
		
	}
	
}
