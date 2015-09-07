package Sort10Numbers;

public class Sort10Numbers {

	public static void main(String[] args) {
		int[]numbers={1,67,43,90,700,7,53,85,32,100};

		System.out.println("Bubble sort:");
		
		bubbleSort(numbers);
		System.out.println();
		
		System.out.println("Selection sort");
		selectionSort(numbers);
		System.out.println();
		
		System.out.println("Merge sort");
		mergeSort(numbers);
		
	}

	public static void bubbleSort(int[] numbers){
		//long startTime=System.currentTimeMillis();
		for(int i=0;i<numbers.length;i++){
			for(int j=0;j<i;j++){
				if(numbers[j]>numbers[j+1]){
					
				
				int temp=numbers[j];
				numbers[j]=numbers[j+1];
				numbers[j+1]=temp;
				
				}
			}
		}
		//long endTime=System.currentTimeMillis();
		//long totalTime=endTime-startTime;
		//float second=(float)totalTime/1000;
		
		for(int number:numbers){
			System.out.print(" "+number);
		}
		//System.out.println();
		//System.out.println("Estimate time is "+second);
		
	}
	
	public static void selectionSort(int []numbers){
		//long startTime=System.currentTimeMillis();
		for(int i=0;i<numbers.length;i++){
			int index=i;
			for(int j=1+i;j<numbers.length;j++){
				if(numbers[j]<numbers[index]){
					index=j;
					
				}
				
			}
			
			int smallNumber=numbers[index];
			numbers[index]=numbers[i];
			numbers[i]=smallNumber;			
		}
			
		//long endTime=System.currentTimeMillis();
		//long totalTime=endTime-startTime;
		//float second=(float)totalTime/1000;
		
		for(int number:numbers){
			System.out.print(" "+number);
		}
		//System.out.println();
		//System.out.println("Estimate time is "+second);
		
	}
	
	
	public static void mergeSort(int[]numbers){
		int lowerIndex=0;
		int  higherIndex=numbers.length-1;
		int tempArray[]=new int[numbers.length];
		
		//long startTime=System.currentTimeMillis();
		
		doMerge(lowerIndex,higherIndex,numbers,tempArray);
		
		//long endTime=System.currentTimeMillis();
		//long totalTime=endTime-startTime;
		//float second=(float)totalTime/1000;
		
		for(int number:numbers){
			System.out.print(" "+number);
		}
		//System.out.println();
		//System.out.println("Estimate time is "+second);
	}
	
	public static void doMerge(int lowerIndex,int higherIndex,int []numbers,int[]tempArray){
		if(lowerIndex<higherIndex){
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;
			doMerge(lowerIndex,middle, tempArray, tempArray);
		
			doMerge(middle+1,higherIndex, tempArray, tempArray);
			
			mergeParts(lowerIndex,middle,higherIndex,numbers,tempArray);
			
		}
		
	}
	
	public static void mergeParts(int lowerIndex,int middle,int higherIndex,int [] numbers,int []tempArray){
		for(int i=lowerIndex;i<higherIndex;i++){
			tempArray[i]=numbers[i];
			
		}
		
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		
		while(i<=middle && i<=higherIndex){
			if(tempArray[j]<=tempArray[j]){
				numbers[k]=tempArray[i];
				i++;
			}else{
				numbers[k]=tempArray[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			numbers[k]=tempArray[i];
			k++;
			i++;
		}
		
	}
}