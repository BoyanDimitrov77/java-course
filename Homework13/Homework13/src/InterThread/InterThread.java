package InterThread;

class TwoThread extends Thread{
	
	synchronized void FirstThread(int number){
		for(int i=0;i<50000;i++){
			if(i==number){
				try{
					wait();
				}catch(Exception e){
					System.out.println(e);
					e.printStackTrace();
				}
			}else{
				System.out.println(i);
			}
		}
	}
	
	synchronized void SecondThread(){
		for(int i=0;i<20;i++){
			
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
				e.printStackTrace();
			}
			notify();
			System.out.println("Running...");
		}
	}
	
}





public class InterThread {

	

	public static void main(String[] args) {
		TwoThread obj=new TwoThread(); 
		
		Thread t1=new Thread(){
			public void run(){
				obj.FirstThread(25000);
			}
		};
		t1.start();
		
		new Thread(){
			public void run(){
				obj.SecondThread();
			}
		}.start();
		
	}

}
