package Graph;

import java.util.ArrayList;


public class TestGraph {

	public static void main(String[] args) {
		int matrix[][]=new int[6][6];
		Graph graph=new Graph(matrix);
		
		graph.AddEdge(1, 4);
		graph.AddEdge(4, 1);
		graph.AddEdge(4, 2);
		graph.AddEdge(2, 4);
		graph.AddEdge(4, 2);
		graph.AddEdge(4, 5);
		graph.AddEdge(5, 4);
		graph.AddEdge(3, 5);
		graph.AddEdge(5, 3);
		graph.AddEdge(2, 5);
		graph.AddEdge(5, 2);
	
	
	
		
		for(int i=1;i<6;i++){
			for(int j=1;j<6;j++){
				System.out.printf("%d",matrix[i][j]);
			}
			System.out.println();
		}

		System.out.println("There is Edge between two node:"+graph.hasEdge(3, 5));
	//System.out.println("There is connecction:"+graph.hasPath(1, 4));
		
		
		ArrayList<Integer>[] list=graph.trasnferVerticeInList();
		
		System.out.println("Path:");
		graph.findPathBetweenVertice(list,1,3 );
		
		if(!graph.isFindPath()){
			System.out.println("No path");
	
		}
		
	
	}



	
}