package Java.Algorithms.Algorithms.CustomLinkedList;

public class CustomLinkedList {
    //Creating a custom liked list
    public Node head;

    public void displayContent(){
        //keeping track of the nodes
        Node current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }

}
