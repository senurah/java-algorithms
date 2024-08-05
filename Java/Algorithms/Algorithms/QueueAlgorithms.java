package Java.Algorithms.Algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAlgorithms {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(54);
        queue.add(43);
        queue.add(23);

        //Removing the elements from queue
        System.out.println("Removed :"+queue.remove());
        //Checking the top number in the queue without removing
        System.out.println("Peek :"+queue.peek());

        //Iterating through the queue
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }


    }
}
