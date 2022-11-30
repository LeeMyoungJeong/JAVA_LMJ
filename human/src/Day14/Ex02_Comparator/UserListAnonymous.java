package Day14.Ex02_Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

//익명클래스로 comparator를 사용해볼거다.

public class UserListAnonymous {

	public static void main(String[] args) {
		
		List <User>	userList = new LinkedList<>();
		
		User u1 = new User("abc1001", "김휴먼", 10);
		User u2 = new User("abc1011", "이휴먼", 20);
		User u3 = new User("abc1101", "박휴먼", 30);
		User u4 = new User("bca1001", "권휴먼", 20);
		User u5 = new User("bac2001", "유휴먼", 30);
		
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		
		Collections.sort(userList, new Comparator<User>() {
			// 익명객체 : 이름이 없는 객체
			// 사용이 되어야 할 곳 안에서 구현이 된다.
			@Override
			public int compare(User o1, User o2) {
				int gap = o1.id.compareTo(o2.id);
				return 0;
			}
			
		});

		for (User user : userList) {
			System.out.println("id :" + user.id);
		}
		
	}
}
	

