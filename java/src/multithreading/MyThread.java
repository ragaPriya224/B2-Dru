package multithreading;

public class MyThread extends Thread {

//	
//	public void start() {
//		System.out.println(currentThread().getName() +"start overrided");
//	}
//	
	public void run() {
		for(int i=0; i<10; i++) {
			currentThread().setName("my chidl thread");
			System.out.println( currentThread().getName()+"child thread");
		}
	}
	public void run(int  j ) {
		for( j=0; j<10; j++) {
			System.out.println("new run");
		}
	}
}
