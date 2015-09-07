package BinaryTree;



public class BinaryTree<Integer> {

	public class TreeNode<Integer>{
		
		private int value;
		private TreeNode<Integer>leftChild;
		private TreeNode<Integer>rightChild;
		private boolean hasParent;
		
		public int getValue() {
			return (int)value;
		}
		public void setValue(int value) {
			this.value =value;
		}
		public TreeNode<Integer> getLeftChild() {
			return leftChild;
		}
		public void setLeftChild(TreeNode<Integer> value) {
			if(value==null || value.hasParent){
				throw new IllegalArgumentException();
			}
			value.hasParent=true;
			this.leftChild = value;
		}
		public TreeNode<Integer> getRightChild() {
			return rightChild;
		}
		public void setRightChild(TreeNode<Integer> value) {
			
			if(value==null || value.hasParent ){
				throw new IllegalArgumentException();
			}
			
			value.hasParent=true;
			this.rightChild = value;
		}
		
		public TreeNode(Integer value,TreeNode<Integer>leftChildNode,TreeNode<Integer>rightChildNode){
			if(value==null){
				throw new IllegalArgumentException("Can't insert null data");
			}
			
			this.value= (int) value;
			this.leftChild=leftChildNode;
			this.rightChild=rightChildNode;
		}
		
		public TreeNode(Integer value){
			this(value,null,null);
		}
		
		public void add(Integer value){
			if(value.equals(this.value)){
				return;
			}else if((int)value<(int)this.value){
				if(leftChild==null){
					leftChild=new TreeNode<Integer>(value);
				}else{
					leftChild.add(value);
				}
				
			}else if((int)value>(int)this.value){
				if(rightChild==null){
					rightChild=new TreeNode<Integer>(value);
				}else{
					rightChild.add(value);
				}
			}
		}
	}
	
	private TreeNode<Integer> root;
	
	
	

	public BinaryTree(Integer value,BinaryTree<Integer>leftChild,BinaryTree<Integer>rightChild){
		if(value==null){
			throw new IllegalArgumentException();
		}
		
		TreeNode<Integer>leftChildNode=leftChild!=null?leftChild.root:null;
		TreeNode<Integer>rightChildNode=rightChild!=null?rightChild.root:null;
		this.root=new TreeNode<Integer>(value,leftChildNode,rightChildNode);
	}
	
	public BinaryTree(Integer value){
		this(value,null,null);
	}
	
	public TreeNode<Integer> getRoot() {
		return root;
	}

	public TreeNode<Integer> getLeftChildNode(){
		if(this.root!=null){
			return this.root.getLeftChild();
		}
		return null;
	}
	
	public TreeNode<Integer>getRightChildNode(){
		if(this.root!=null){
			return this.root.getRightChild();
		}
		return null;
	}
	
	public void addElemetn(Integer value){
		if(root==null){
			root=new TreeNode<Integer>(value);
		}else{
			root.add(value);
		}
		
		
	}
	public void printPreOrder(TreeNode<Integer>root){
		if(root==null){
			return;
		}
		System.out.println(root.getValue()+" ");
		printPreOrder(root.getLeftChild());
		
		printPreOrder(root.getRightChild());
		
	}
	
	public void printPreOrder(){
		printPreOrder(this.root);
		System.out.println();
	}
}
