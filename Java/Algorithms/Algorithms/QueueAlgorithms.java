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
        System.out.println();
        System.out.println("Printing Binary numbers");
        printBinary(10);


    }

    //Creating an algorithm to print binary numbers
    public static void printBinary(int n){
        if(n<=0){
            System.out.println();
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        for(int i =0; i< n;i++){
            int current = queue.remove();
            System.out.println(current);

            queue.add(current*10);
            queue.add(current* 10 + 1);
        }
        System.out.println();
    }
}
