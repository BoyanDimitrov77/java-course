package MathematicOperation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;



public class MathematicOperation {

	public static void main(String[] args) throws ScriptException {
		String text="5+6-2+5+9";
		
        Stack<String>myStack=new Stack<String>();
		Queue<String>myQueue=new LinkedList<String>();
		
		String regex = "(?<=op)|(?=op)".replace("op", "[-+*/()]");
		String []part=text.split(regex);
		int result=0;
	
		if(checkString(text,part)){
			for(String element:part){
				if(element.matches("\\d")){
					myQueue.offer(element);
				}else{
					myStack.push(element);
				}
			}
			String mathOperation="";

			//poll two elements from queue
			String number1=myQueue.poll();
			String number2=myQueue.poll();
			//pop an operator from stack
		    String operator=myStack.pop(); 
			
		    mathOperation=number1+operator+number2;
		    //Evaluating a math expression from string
		    ScriptEngineManager mgr=new ScriptEngineManager();
			ScriptEngine engine=mgr.getEngineByName("JavaScript");
			result=(int)engine.eval(mathOperation);
			
			myQueue.offer(mathOperation);
			System.out.println(mathOperation+"="+result);
			
		}else{
			System.out.println("String is wrong");
			
		}
		
			
		
	}
	
	public static boolean checkString(String text,String[]part){
		
		
		
		if(Character.isDigit(text.charAt(0)) && Character.isDigit(text.charAt(text.length()-1))){
			
		
		int count=0;//check for double opeartor
		for(String element:part){
		
			//check if number is single digit
			if(element.matches("\\d")){     
				int singleDigit=Integer.parseInt(element);
				if(singleDigit>=0 &&singleDigit<=9){
					//System.out.println("True");
				count--;
				}
						
				
			}else if(element.equals("+") || element.equals("-")){
				//System.out.println("True1");
				count++;
			}else{
				//System.out.println("Wrong string 2");
				return false;
			}
		
		}
		if(count>=0){
			//System.out.println("Wrong string 1");
			return false;
		}else
			return true;
			//System.out.println("String is right");
		
		}else{
			//System.out.println("Wrong string");
			return false;
		}
		
	}

}
