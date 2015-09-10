/*package TreeDFS;



public class Tree<T> {
       
	public static class TreeNode<T>{
		
	
	
	   private T data;
	   private TreeNode<T> leftChild;
       private TreeNode<T> rightChild;
       private boolean hasParents;
       
       
       public T getData() {
   		return data;
   	}

   	public void setData(T data) {
   		this.data = data;
   	}

   	public TreeNode<T> getLeftChildNode() {
   		return leftChild;
   	}

   	public void setLeftChildNode(TreeNode<T> data) {
   		if(data==null || data.hasParents){
   		  throw new IllegalArgumentException();
   		}
   		data.hasParents=true;
   		this.leftChild = data;
   	}

   	public TreeNode<T> getRightChildNode() {
   		return rightChild;
   	}

   	public void setRightChildNode(TreeNode<T> data) {
   		if(data==null||data.hasParents){
   		  throw new IllegalArgumentException();
   		}
   		data.hasParents=true;	
   		this.rightChild = data;
   	}

       
       public TreeNode(T data,TreeNode<T> leftChildNode,TreeNode<T>rightChildNode){
    	   if(data==null){
    		   throw new IllegalArgumentException(
    				   "Cannot insert null value!");
    	   }
    	   
    	   this.data=data;
    	   this.leftChild=leftChildNode;
    	   this.rightChild=rightChildNode;
    	   
    	   
       }
	
       public TreeNode(T data){
    	   this(data,null,null);
       }
       
	}
	
	private TreeNode<T> root;

	
	
	public Tree(T data,Tree<T>leftChild,Tree<T>rightChild){
		if(root==null){
			  throw new IllegalArgumentException();
		}
		
		TreeNode<T> leftChildNode=leftChild!=null? leftChild.root:null;
		TreeNode<T>rightChildNode=rightChild!=null? rightChild.root:null;
		this.root=new TreeNode<T>(data,leftChildNode,rightChildNode);
		
	}
	public Tree(T data){
		this(data,null,null);
	}
       
	public TreeNode<T> getRoot() {
		return root;
	}
	
	public TreeNode<T> getLeftChildNode(){
		if(this.root!=null){
			return this.root.getLeftChildNode();
		}
		return null;
	}
	
	public TreeNode<T>getRightChildNode(){
		if(this.root!=null){
			return this.root.getRightChildNode();
		}
		return null;
	}
	
	public void printPreOrder(TreeNode<T>root){
		if(root==null){
			return;
		}
		
		printPreOrder(root.getLeftChildNode());
		System.out.println(root.getData()+" ");
		printPreOrder(root.getRightChildNode());
		
	}
	
	public void printPreOrder(){
		printPreOrder(this.root);
		System.out.println();
	}
}
*/		