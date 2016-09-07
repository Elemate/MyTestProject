
public class ThreadRunnableDemo implements Runnable {
	private int ticket = 10;
	
	public static void main(String[] args) {
		ThreadRunnableDemo demo = new ThreadRunnableDemo();
		Thread t1 = new Thread(demo);
		Thread t2 = new Thread(demo);
		Thread t3 = new Thread(demo);
		t1.start();
		t2.start();
		t3.start();
	}
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<500; i++){
			if (this.ticket>0) {
				System.out.println("ÂôÆ±£º"+(this.ticket--));
			}
		}
	}

}
