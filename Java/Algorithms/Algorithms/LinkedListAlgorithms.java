package Java.Algorithms.Algorithms;
import java.util.LinkedList;

public class LinkedListAlgorithms {
    //linear data structure
    //linked by pointers : 6->7->13->null
    //6:head 13:tail
    //if needed to remove half of the list --> make the middle pointer to null
    //Java garbage collector will manage the memory
    //Each element is called a node
    public static void linkedList(){
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.addLast("4");
        list.addFirst("0");
        list.add("3");

        System.out.println(list.contains("4"));
        System.out.println(list.size());

        for(String item:list){
            System.out.print(item+" -> ");
        }
        System.out.println();
        //Another method to print linkedLists
        list.forEach(x -> System.out.print(x+" -> "));



    }




}
