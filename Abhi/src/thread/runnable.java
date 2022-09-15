package thread;

class multi implements Runnable{
	public void run() {
		System.out.println("Thread is running");
	}
}

public class runnable {

	public static void main(String[] args) {
		multi m=new multi();
		Thread t1=new Thread(m);
		t1.start();

	}

}
