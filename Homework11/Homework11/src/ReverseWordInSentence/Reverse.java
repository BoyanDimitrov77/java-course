package ReverseWordInSentence;

import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		String text="I am from planet Earth";
		
		Stack<String>myStack=new Stack<String>();
		
		String[] part=text.split("[ .,!?]+");
		
		
		for(String word:part){
			myStack.push(word);
			
		}
	
		while(!myStack.isEmpty()){
			String word=myStack.pop();
			System.out.print(word +" ");
		}
	}

}
