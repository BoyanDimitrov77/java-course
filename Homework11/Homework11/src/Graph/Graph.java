package Graph;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;

public class Graph {
    
	private  int vertice[][];
	private Stack<Integer> myStack=new Stack<Integer>();
	boolean findPath=false;
	
	

	public Graph(int vertice[][]){
		this.vertice=vertice;
	}
	
	public void AddEdge(int start,int end){
		vertice[start][end]=1;
		
	}
	
	public void removeEdge(int start,int end){
		vertice[start][end]=0;
	}
	
	public boolean hasEdge(int start,int end){
		return vertice[start][end]==1;
		
	}
	public boolean isFindPath() {
		return findPath;
	}

	public void setFindPath(boolean findPath) {
		this.findPath = findPath;
	}
	
	public  void findPathBetweenVertice(ArrayList<Integer>[]list,int start,int end){
		
		if(start==end){
			printNodesInStack(myStack);
			System.out.println(end);
			System.out.println();
			setFindPath(true);
			return;
		}
		
		
		if(!myStack.contains(start)){
			myStack.push(start);
			if(list[start]!=null){
				for(int i:list[start]){
					if(!myStack.contains(i)){
						findPathBetweenVertice(list,i,end);
					}
				}
				myStack.pop();
			}
		}
	}
	
	
		
	private static void printNodesInStack(Stack<Integer> myStack){
		ListIterator<Integer> itr=myStack.listIterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+",");
		}
	
	
	}
	
	public ArrayList<Integer>[] trasnferVerticeInList(){
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] list=new ArrayList[6];
		
		for(int i=0;i<vertice[0].length;i++){
			list[i]=new ArrayList<Integer>();
			for(int j=0;j<vertice.length;j++){
				
				if(vertice[i][j]==1){
					
					
					list[i].add(j);
					
				}
				
			}
			
		}
		return list;
	}
	
	

	}

