
public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = ()->{
			System.out.println("Hello Bitch");
		};
		Thread t = new Thread(r);
		t.start();
	}

}
