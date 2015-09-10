import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Task {
    public int size;
	public int [][]matrix;
    public int [][] rotateMatrix;
	
	public Task() {
		super();
		
	}
	public Task(int size){
			this.size=size;
		
	}
	 public int getSize() {
		 
			return size;
		}	 
		public void setSize(int size) {
			this.size = size;
			
		}

		public int[][] getMatrix() {
			return matrix;
		}


		public void setMatrix(int[][] matrix) {
			this.matrix = matrix;
		}

		public int[][] getReverseMatrix() {
			return rotateMatrix;
		}


		public void setReverseMatrix(int[][] reverseMatrix) {
			this.rotateMatrix = reverseMatrix;
		}

	public int [][] fillMatrix(Scanner input,int size){
		System.out.println("Please enter "+size*size+" numbers");
		
		this.matrix=new int[size][size];
		for(int row=0;row<this.matrix.length;row++){
			for(int colum=0;colum<this.matrix[0].length;colum++){
				this.matrix[row][colum]=input.nextInt();
			}
		}
		
		return this.matrix;
	}
	
	public void rotateMatrix(int [][]matrix,int size){
		this.rotateMatrix=new int[size][size];
		for(int row=0;row<matrix.length;row++){
			for(int colum=0;colum<matrix[0].length;colum++){
				this.rotateMatrix[row][colum]=matrix[matrix.length-colum-1][row];			}
		}

	}
	
	public void saveMatric(){
		String path="RotateMatrix.txt";
		
		try{
			FileWriter fileStream=new FileWriter(path);
			BufferedWriter br=new BufferedWriter(fileStream);
			
			for(int row=0;row<this.rotateMatrix.length;row++){
				for(int colum=0;colum<this.rotateMatrix[0].length;colum++){
					br.write(" "+ this.rotateMatrix[row][colum]);
				}
				br.newLine();
			}
			br.close();
		}catch(Exception e){
			System.out.println("Error saving file");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
		
	}
	
	public int calculateSum(){
		int maxRow=0;
		int maxColum=0;
		int sumRow=0;
		int sumColum=0;
		for(int row=0;row<this.matrix.length;row++){
			maxRow=Integer.MIN_VALUE;
			maxColum=Integer.MIN_VALUE;
			for(int colum=0;colum<this.matrix[0].length;colum++){
				if(maxRow<this.matrix[row][colum]){
					maxRow=this.matrix[row][colum];
				}
				if(maxColum<this.matrix[colum][row]){
					maxColum=this.matrix[colum][row];
				}
			
			}
			sumRow+=maxRow;
			sumColum+=maxColum;
		}
		
		int maxLeftDiagonalNum=Integer.MIN_VALUE;
		for(int row=0, colum=0;row<this.matrix.length;row++,colum++){
			if(maxLeftDiagonalNum<this.matrix[row][colum]){
				maxLeftDiagonalNum=this.matrix[row][colum];
			}
		}
		
		int maxRightDiagonalNum=Integer.MIN_VALUE;
		for(int row=this.matrix.length-1,colum=0;colum<this.matrix.length;row--,colum++){
			if(maxRightDiagonalNum<this.matrix[row][colum]){
				maxRightDiagonalNum=this.matrix[row][colum];
			}
		}
		int allSum=sumRow+sumColum+maxLeftDiagonalNum+maxRightDiagonalNum;
		
		return allSum;
		
	}
}
