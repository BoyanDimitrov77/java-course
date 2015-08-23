package Deque;
import java.util.ArrayList;


public class Deque {

private	static ArrayList<Integer> deque=new ArrayList<Integer>();
	
	public void addFront(int data){
		
		deque.add(0, data);
		System.out.println(deque);
		
		
	}
	public void addBack(int data){
		deque.add(data);
		System.out.println(deque);
		
	}
	public  void removeFront(){
		if(deque.isEmpty()){
			System.out.println("You can't remove elements");
		}else{
			deque.remove(0);
			System.out.println(deque);
		}
	}
	
	public  void removeBack(){
		if(deque.isEmpty()){
			System.out.println("You can't remove elements");
		}else{
			int sizeDeck=deque.size()-1;
			deque.remove(sizeDeck);
			System.out.println(deque);
			
			
		}
	
		
	}
     public int peekFront(){
		
    	int element= deque.get(0);
		System.out.println(element);
		return element;
	}
     
     public int peekBack(){
    	 int backElement=deque.size()-1;
    	 int element=deque.get(backElement);
    	 System.out.println(element);
    	 return element;
     }
     
    
	
	public static void main(String[] args) {
		Deque deck=new Deque();
		/*deck.addFront(1);
		deck.addFront(2);
		deck.addFront(3);
		deck.addFront(4);
		deck.addFront(5);*/
		deck.addFront(6);
		deck.addFront(7);
		deck.addFront(8);
		deck.addFront(9);
		deck.addFront(10);
		
		deck.addBack(70);
		deck.addFront(100);
		
		System.out.println("Remove element");
		deck.removeFront();
		deck.removeBack();
		
		System.out.println("Peek element");
		deck.peekFront();
		deck.peekBack();
		
		
	}

}