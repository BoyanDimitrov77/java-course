package TreeBFS;

import java.util.LinkedList;
import java.util.List;


public class TreeNode<T> {
       T data;
       TreeNode<T> parent;
       List<TreeNode<T>> children;
	
       
       public TreeNode(T data){
    	   this.data=data;
    	   this.children=new LinkedList<TreeNode<T>>();
       }
	
       public TreeNode<T> addChild(T child){
    	 TreeNode<T>childNode=new TreeNode<T>(child);
    	 childNode.parent=this;
    	 this.children.add(childNode);
    	 return childNode;
    	   
    	   
       }
       
       public void printBfs(TreeNode<T>root,int depth){
    	
    	   
    	   for (int i = 0; i < depth; i++) {
       	  	System.out.print("\t");	
   		}
       	System.out.println(root.data);
       	

       	    	
       	depth++;
       	
       	
       	

       	for (int i = 0; i < root.children.size(); i++) {
       		printBfs(root.children.get(i), depth);
   			
   		
   		}
       	
    
       }
    
}
