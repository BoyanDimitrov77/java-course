package Threads;

public class Test {

	public static void main(String[] args) {
		Thread t1=new FirstThread();
		Thread t2=new SecondThread();
		Thread t3=new ThirdThread();
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
