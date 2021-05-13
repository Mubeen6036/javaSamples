
public class ThreadWithThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadWithThread t = new ThreadWithThread();
		t.start();
		System.out.println("yo yo oyoy ooy");
	}
	
	@Override
	public void run() {
		for(int i=0; i<100;i++) {
			System.out.println(i);
		}
	}

}
