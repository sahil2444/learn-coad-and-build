
public class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 1;i<=10;i++) {
			System.out.println("Thread #1: "+i);
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Thread #1 is Completed :)");
	}
}
