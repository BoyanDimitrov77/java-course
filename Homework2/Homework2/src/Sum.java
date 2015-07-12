import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in,"UTF-8");
		
		int FirstNum,SecondNum,ThirdNum,FourthNum;
		int result;
		
		FirstNum=input.nextInt();
		SecondNum=input.nextInt();
		ThirdNum=input.nextInt();
		FourthNum=input.nextInt();
		
		result=FirstNum + SecondNum + ThirdNum + FourthNum;
		
		System.out.println("Sum is " + result);
		
		
		input.close();

	}

}
