package Day08.Ex04_Interface;

public class TelevisionPractice implements RemoteControlPractice{
	
		// 변수 
	
		private int volume;
		
		@Override
		public void turnOn() {System.out.println("TV전원을 켭니다."); 
			
		}

		@Override
		public void turnOff() {System.out.println("TV전원을 끕니다.");
			
		}

		public void setVolume(int volume) {
			// 유효성 검사
			// 볼륨 최대값을 넘지 못하게 설정
			if (volume > RemoteControl.MAX_VOLUME)
				{this.volume = RemoteControl.MAX_VOLUME;
			}
			else if(volume < RemoteControl.MIN_VOLUME) 
			{this.volume = RemoteControl.MIN_VOLUME;}
			else {
				this.volume = this.volume = volume;
			}
			//유효한 볼륨값 설정
			System.out.println("현재 TV 볼륨 : " + volume);
		}	
		

		}
	
	
	

