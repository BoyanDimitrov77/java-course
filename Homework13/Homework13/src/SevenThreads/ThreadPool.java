package SevenThreads;

public class ThreadPool extends Thread {
      private String name;
      
      public ThreadPool(String name){
    	  this.name=name;
      }
	
	public void run(){
		System.out.println("The thread is started");
		Thread.currentThread().setName(name);
		System.out.println(Thread.currentThread().getName());
	     process();
	     System.out.println("The thread is completed");
	}
	
	public void process(){
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
