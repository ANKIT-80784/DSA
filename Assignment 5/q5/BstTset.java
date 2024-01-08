package q5;

public class BstTset {
	
	public static void findDepth(Bst bst,int key)
	{
	    int depth = bst.getNodeDepth(key);

	    if (depth != -1) 
	        System.out.println("\nDepth of node with key " + key + " is: " + depth);
	    else 
	    	System.out.println("\nNode with key " + key + " not found in the BST.");
		
	}

	public static void main(String[] args) {
		Bst bst = new Bst();
		
		bst.add(8);
		bst.add(3);
		bst.add(10);
		bst.add(1);
		bst.add(6);
		bst.add(14);
		bst.add(4);
		bst.add(7);
		bst.add(13);
		
		bst.display();
		
//		bst.bstSearch(7);
//		
//		bst.bstSearch(11);
		
//		System.out.println("\nno of leaf nodes is: "+ bst.countLeafNodes());
//		System.out.println("no of non-leaf nodes is: "+ bst.countNonLeafNodes());
		
		findDepth(bst,12);
		findDepth(bst,10);
		findDepth(bst,7);
		
		
	}

}
