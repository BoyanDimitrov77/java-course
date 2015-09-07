package TreeDFS;

public class TestTree {

	public static void main(String[] args) {
	

		Trees<Integer> root = new Trees<Integer>(1);
		{
			Trees<Integer> node2 = root.addChild(2);
			
			{  
				Trees<Integer> node21 = root.addChild(5);
				Trees<Integer> node22 = root.addChild(6);
				Trees<Integer> node23 = root.addChild(7);
				
			}
			
			Trees<Integer> node3 = root.addChild(3);
			Trees<Integer> node4 = root.addChild(4);
		    {
		    	Trees<Integer> node41 = node4.addChild(8);
		    	Trees<Integer> node89 = node4.addChild(9);
		       
		    }
		}
		
		//root.findDepth(root);
		
		root.preorderPrint(root);
		//root.postorderPrint(root,"");
		
		//root.printDFS();
}
}
