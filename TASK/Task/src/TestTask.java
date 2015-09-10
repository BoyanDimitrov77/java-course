import java.util.Arrays;
import java.util.Scanner;
public class TestTask {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		
		System.out.println("Please enter size 2-9");
		int size=input.nextInt();
		if(size>=2&& size<=9){
			
			
			int choice=0;
			Task object=new Task(size);
			int [][]matrix=object.fillMatrix(input,size);
			System.out.println(Arrays.deepToString(matrix));
		do{
			
			
			System.out.println("1.Rotate matrix");
			System.out.println("2.Find sum-Row,Colum,left and right diagonal");
			System.out.println("0.Exit");
			System.out.println("Please choose option");
			 choice=input.nextInt();
			
			switch(choice){
			case 1:{
				object.rotateMatrix(matrix, size);
				object.saveMatric();
				System.out.println("Successfull rotate matrix");
			}break;
				
			case 2:{
				int result =object.calculateSum();
				System.out.println("Sum:"+result);
			}break;
			
		
			}
			
			
	
		}while(choice!=0);
			
			
			
			
		}else{
			System.out.println("You enter invalid size");
		}
		
	
		input.close();
	}

}