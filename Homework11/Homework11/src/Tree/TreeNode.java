package Tree;
import java.util.LinkedList;
import java.util.List;


public class TreeNode<T> {

    T data;
    TreeNode<T> parent;
    List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new LinkedList<TreeNode<T>>();
    }

    public TreeNode<T> addChild(T child) {
    	TreeNode<T> childNode = new TreeNode<T>(child);
        childNode.parent = this;
        this.children.add(childNode);
        return childNode;
    }
    
    int count=0;
    public int findDepth(TreeNode<T> node, int depth,T data){
 
    	if(node.data==data){
    		count=depth;
    	}
    	    	
    	depth++;
    	
    	for (int i = 0; i < node.children.size(); i++) {
			findDepth(node.children.get(i), depth,data);
			
		
		}
    	
    	return count;
    }
    
    public void print(TreeNode<T> node, int depth){
    	for (int i = 0; i < depth; i++) {
    	  	System.out.print("\t");	
		}
    	System.out.println(node.data);
    	

    	    	
    	depth++;
    	
    	
    	

    	for (int i = 0; i < node.children.size(); i++) {
			print(node.children.get(i), depth);
			
		
		}
    	
    	
    }
    
}
