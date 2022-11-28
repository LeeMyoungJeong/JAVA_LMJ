package Day09.Ex07_AnonymousClass;

public class Anonymous {

	
	// 익명 자식 객체를 생성하는 방법
	// 부모클래스 객체명 = new 부모클래스 () {
	//
	//   };
	// *** 생성자를 선언할 수 없다.
	// 생성자는 클래스와 이름이 같아야 함.
	// 지금은 이름이 없는 객체를 new Person()으로 정의하고 있음.
	Person child = new Person() {
		//사실 여기가 상속받은 자식클래스를 정의하는 공간임
		
		void play() {
			System.out.println("놀이를 합니다");
			
		}

		@Override
		void work() {
			System.out.println("공부를 합니다.");
		}
		
	};
	
	void methodA() {
		Person child2 = new Person() {
			void study() {
				System.out.println("공부를 합니다.");
			}

			@Override
			void work() {
				System.out.println("아르바이트를 합니다.");
				study();
			}
			
		};
	}
		void methodB(Person person) {
			person.work();
		}
	
	}
	
	
	
	
	

