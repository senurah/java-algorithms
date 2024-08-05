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

    //Deleting the back half of the linked list
    public void deleteBackHalf(){
        //Making sure the head and the head.next is not null
        if(head==null || head.next == null){
            head = null;
        }


        Node slow = head;
        Node fast = head;
        Node prev = null;
        //Incrementing the fast pointer twice the slow pointer
        while(fast != null && fast.next !=null){
            //moving the pointer twice the slow pointer : when fast is on the end slow should be in the middle
            fast = fast.next.next;
            slow = slow.next;
            //Variable to null the middle element
            prev = slow;
        }

        //making the middle element null
        prev.next = null;
    }


}
