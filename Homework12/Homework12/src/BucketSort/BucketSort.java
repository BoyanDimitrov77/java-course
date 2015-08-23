package BucketSort;

public class BucketSort {

	public static int []sort(int[] array,int maxValue){
		
		int[]bucket=new int[maxValue+1];
		int [] sortArray=new int[array.length];
		
		for(int i=0;i<array.length;i++){
			bucket[array[i]]++;
		}
		
		int outPos = 0;
		for(int i=0;i<bucket.length;i++){
			for(int j=0;j<bucket[i];j++){
				sortArray[outPos++]=i;
			}
			
		}
		return sortArray;
	}
	
	public static int maxValue(int[] array){
		int maxValue=Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++){
			if(array[i]>maxValue){
				maxValue=array[i];
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		int [] array={1,67,98,8,65,77,90,1000,700};
		
		int maxValue=maxValue(array);
		long startTime=System.currentTimeMillis();
		
		System.out.println("Sorted array:");
        int[] sortArray=sort(array,maxValue);
        
        long endTime=System.currentTimeMillis();
        long totalTime=endTime-startTime;
        float second=(float)totalTime/1000;
        
        		for(int number:sortArray){
        	System.out.print(" "+number);
        }
        		System.out.println();
		System.out.println("Estimate time is "+second);

	}

}
