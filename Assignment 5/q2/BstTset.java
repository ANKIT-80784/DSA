package q2;

public class BstTset {

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
		
		bst.bstSearch(7);
		
		bst.bstSearch(11);
	
		

	}

}
