package TreeBFS;



public class TestTree {

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<Integer>(1);
		{
			TreeNode<Integer> node2 = root.addChild(2);
			
			{  
				TreeNode<Integer> node21 = node2.addChild(5);
				TreeNode<Integer> node22 = node2.addChild(6);
				TreeNode<Integer> node23 = node2.addChild(7);
				
			}
			
			TreeNode<Integer> node3 = root.addChild(3);
			TreeNode<Integer> node4 = root.addChild(4);
		    {
		    	TreeNode<Integer> node41 = node4.addChild(8);
		    	TreeNode<Integer> node89 = node4.addChild(9);
		       
		    }
		}
		
		root.printBfs(root,0);

	}

}
