package FiveThreads;

class Method{
	synchronized void printMethod(){
		
		
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("The Thread is complete");
		
	}
	
	
}

class FirstThread extends Thread{
	
	Method obj;
	public FirstThread( Method obj){
		this.obj=obj;
	}
	
		
	
	public void run(){
		System.out.println("The thread is started");
		Thread.currentThread().setName("Petar");
		System.out.println("Thread name is :"+Thread.currentThread().getName());
		
		obj.printMethod();
		
		
	}
}

class SecondThread extends Thread{
	Method obj;
	
	public SecondThread(Method obj){
		this.obj=obj;
	}
	
	public void run(){
		System.out.println("The thread is started");
		Thread.currentThread().setName("Ivan");
		System.out.println("Thread name is :"+Thread.currentThread().getName());
		obj.printMethod();
	}
}

class ThirdThread extends Thread{
	Method obj;
	
	public ThirdThread(Method obj){
	this.obj=obj;	
	}
	
	public void run(){
		System.out.println("The thread is started");
		Thread.currentThread().setName("Todor");
		System.out.println("Thread name is :"+Thread.currentThread().getName());
		obj.printMethod();
		
	}
}

class ForthThread extends Thread{
	
	Method obj;
	
	public ForthThread(Method obj){
		this.obj=obj;
	}
	
	public void run(){
		System.out.println("The thread is started");
		Thread.currentThread().setName("Georgi");
		System.out.println("Thread name is :"+Thread.currentThread().getName());
		obj.printMethod();
	}
}

class FifthThread extends Thread{
	Method obj;
	
	public FifthThread(Method obj){
		this.obj=obj;
	}
	public void run(){
		System.out.println("The thread is started");
		Thread.currentThread().setName("Dobri");
		System.out.println("Thread name is :"+Thread.currentThread().getName());
		obj.printMethod();
	}
}

public class FiveThreads {

	public static void main(String[] args) {
		Method obj=new Method();
		FirstThread t1=new FirstThread(obj);
        SecondThread t2=new SecondThread(obj);
        ThirdThread t3=new ThirdThread(obj);
        ForthThread t4=new ForthThread(obj);
        FifthThread t5=new FifthThread(obj);
        
       t1.start();
       t2.start();
       t3.start();
       t4.start();
       t5.start();
		
	}

	
	
}
