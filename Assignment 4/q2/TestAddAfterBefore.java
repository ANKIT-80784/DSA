package q2;
import java.util.Scanner;

public class TestAddAfterBefore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List myList = new List();

        myList.addFirst(10);
        myList.addFirst(20);
        myList.addFirst(30);
        myList.addFirst(40);

        System.out.println("Original List:");
        myList.display();
        System.out.println();

        System.out.print("Enter New Node : ");
        List.Node newNode = myList.new Node(sc.nextInt());

        System.out.print("Enter Node From the list : ");
        int givenNodeValue = sc.nextInt();

        List.Node givenNode = myList.findNode(givenNodeValue);

        if (givenNode != null) {
            // Add After
//            myList.addAfter(newNode, givenNode);
//            System.out.println("\nList after inserting " + newNode.getData() + " after node with value " + givenNode.getData() + ":");
//            myList.display();
//            System.out.println();

            // Add Before
            myList.addBefore(newNode, givenNode);
            System.out.println("\nList after inserting " + newNode.getData() + " before node with value " + givenNode.getData() + ":");
            myList.display();
            System.out.println();
        } else {
            System.out.println("Given node not found in the list.");
        }
    }
}
