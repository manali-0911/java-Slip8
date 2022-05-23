import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListE {
    public static void main(String[]args){
        LinkedList linkedlist1 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        linkedlist1.add("second");
        linkedlist1.add("third");
        linkedlist1.add("four");
        linkedlist1.add("five");
        System.out.println("Orignal Linked List: "+ linkedlist1);
        System.out.println("Enter an element to Add it first: ");
        String b = sc.nextLine();
        linkedlist1.addFirst(b);
        System.out.println("After adding first element in Linked list: "+ linkedlist1);
        String a = (String) linkedlist1.removeLast();
        System.out.println("Deleting element: "+a);
        System.out.println("After deleteing: "+ linkedlist1);
        int GetSize;
        GetSize = linkedlist1.size();
        System.out.println("Size is : "+ GetSize);
    }
}
