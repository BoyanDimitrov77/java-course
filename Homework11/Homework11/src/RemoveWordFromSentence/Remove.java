package RemoveWordFromSentence;

import java.util.LinkedList;
import java.util.Queue;

public class Remove {

	public static void main(String[] args) {
		String text="My spaceship is ready for travelling to Mars";
		
		Queue<String> myQueue=new LinkedList<String>();
		
		String [] part=text.split("[ .,!?]+");
		
		for(int i=0;i<part.length;i++){
			if(part[i].length()>3){
				myQueue.offer(part[i]);
				
			}
			
		}
		
		while(!myQueue.isEmpty()){
			String word=myQueue.poll();
			System.out.print( word+ " ");
		}
		
		

	}

}
