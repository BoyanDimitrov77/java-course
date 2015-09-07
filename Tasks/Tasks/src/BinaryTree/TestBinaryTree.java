package BinaryTree;

public class TestBinaryTree {

	public static void main(String[] args) {
		BinaryTree<Integer> root=new BinaryTree<Integer>(8);{
		root.addElemetn(3);
		root.addElemetn(10);
		root.addElemetn(1);
		root.addElemetn(6);
		root.addElemetn(4);
		root.addElemetn(7);
		root.addElemetn(14);
		root.addElemetn(13);
		
		root.printPreOrder();
	}
	}
}
