package Tree;

public class TestTree {

	public static void main(String[] args) {
		
		
		TreeNode<Integer> root = new TreeNode<Integer>(7);
		{
			TreeNode<Integer> node8 = root.addChild(8);
			TreeNode<Integer> node11 = root.addChild(11);
			TreeNode<Integer> node10 = root.addChild(10);
		    {
		    	TreeNode<Integer> node20 = node10.addChild(null);
		    	TreeNode<Integer> node89 = node10.addChild(89);
		        {
		        	TreeNode<Integer> node100 = node20.addChild(100);
		        }
		    }
		}


		root.print(root, 0);
		
		int result=root.findDepth(root, 0,100);
		System.out.println("Depth of node is " +result);
		
		
		
		
	}
	
	

}
