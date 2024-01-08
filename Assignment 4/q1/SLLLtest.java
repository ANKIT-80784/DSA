package q1;

public class SLLLtest {

	public static void main(String[] args) {
		List list = new List();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		
		System.out.println("Add first");
		list.display();
		
		list.addLast(40);
		list.addLast(50);
		
		System.out.println("\nAdd last");
		list.display();
		
		list.delFirst();
		System.out.println("\nDelete first");
		list.display();
		
		list.delLast();
		System.out.println("\nDelete last");
		list.display();
	}

}
