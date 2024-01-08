package q4;

public class SLLLtest {

	public static void main(String[] args) {
	
		List list = new List();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		
		list.display();
		System.out.println();
		
//		list.addLast(50);
//		list.display();
//		System.out.println();
//		
//		list.delFirst();
//		list.display();
//		System.out.println();
//		
//		list.delLast();
//		list.display();
		
		list.displayReverse();
		
		
	}

}
