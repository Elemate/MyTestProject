
public class ThreadDemo extends Thread {
	private String name;
	public ThreadDemo(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		Thread t1 = new ThreadDemo("�߳�A");
		Thread t2 = new ThreadDemo("�߳�B");
		Thread t3 = new ThreadDemo("�߳�C");
		t1.start();
		t2.start();
		t3.start();
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(name+i+":--------------------");
		}
	}
	
	
}
