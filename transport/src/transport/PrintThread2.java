package transport;

public class PrintThread2 extends Thread{
	public void run() {
		try {
			while(true) {
				System.out.println("Running");
				Thread.sleep(1);
			}
			}catch(InterruptedException e) {}
		
		System.out.println("자원정리");
		System.out.println("실행종료");
	}

}
