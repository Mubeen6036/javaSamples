import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class ThreadWithCallable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Callable<Integer> g = ()->{
			System.out.println("afasdfasdf");
			return 1;
		};
		

		System.out.println(f);
	}

}
