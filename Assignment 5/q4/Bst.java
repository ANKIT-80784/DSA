package q4;

public class Bst {
	
	private class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
		}
	}
		
	private Node root;
	public Bst() {
		root = null;
	}
	
	private boolean isEmpty()
	{
		return root == null;
	}
		
	void add(int val) {
		Node node = new Node(val);
		insert(node,root);
	}
			
	private void insert(Node node, Node trav) 
	{	
		if(isEmpty())
			root = node;
		
		else if(node.data < trav.data)
		{
			if(trav.left==null)
				trav.left=node;
			
			else
				trav=trav.left;
				insert(node,trav);
			
		}
		
		else if(node.data > trav.data)
		{
			if(trav.right==null)
				trav.right=node;
			
			else
				trav=trav.right;
				insert(node,trav);
		}
	}
	
	void display() {
		if (isEmpty()) {
			System.out.println("Tree is empty");
		} else {
			displayInOrder(root);
		}
	}
	
	private void displayInOrder(Node root) {
		if (root != null) {
			displayInOrder(root.left);
			System.out.print(root.data +" ");
			displayInOrder(root.right);
		}
	}
	
	void bstSearch(int key) {
		
		if (isEmpty()) {
			System.out.println("Tree is empty");
		} else {
			if(isFound(root,key))
				System.out.println("\n"+key+" found");
			else
				System.out.println("\n"+key+" not found");
		}
	}
	
	private boolean isFound(Node root, int key) {
	    if (root != null) {
	        if (root.data == key) 
	            return true;
	        
	        if (isFound(root.left, key) || isFound(root.right, key)) 
	            return true;
	        
	    }
	    return false;
	}
	
	public int countLeafNodes() {
        return countLeafNodes(root);
    }

    private int countLeafNodes(Node root) {
        if (root == null) 
            return 0;

        if (root.left == null && root.right == null) 
            return 1;
        
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
    
    public int countNonLeafNodes() {
        return countNonLeafNodes(root);
    }

    private int countNonLeafNodes(Node root) {
        if (root == null || (root.left == null && root.right == null)) 
            return 0;

        return 1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right);
    }
    
}
