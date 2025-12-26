package thread_p;

class FirstTh extends Thread{
	
	FirstTh(String nn) {
		super(nn);  // super.name = nn;
		System.out.println("생성자 실행"+nn);
	}
	
	
	@Override
	public void run() {//start() 에서 호출
		
		for (int i = 0; i < 500; i++) {
			System.out.print(getName());
			
			try {
				sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//System.out.println("run 이지롱 "+getName());
	}
	
	/*  오버라이딩 하지 말 것
	@Override
	public void start() {
		
		System.out.println("start를 바꿀꺼야");
	}*/
}

public class ThreadMain {

	public static void main(String[] args) {
		FirstTh th1 = new FirstTh("&");// nn = "&"
		FirstTh th2 = new FirstTh("#");// nn = "#"
		
//		th1.run();  싱글 쓰레드 - 사용안함
//		th2.run();
		th1.start();  // 멀티 쓰레드 - run() 호출
		th2.start();

		System.out.println("\n activeCount() : "+Thread.activeCount());
		
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n activeCount() : "+Thread.activeCount());
	}

}
