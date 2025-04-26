package Java.Algorithms.Algorithms.Sorting;

import static Java.Algorithms.Algorithms.Sorting.SelectionSort.printArray;

public class BubbleSort {
    public static void main(String[] args) {
        int [] unsortedArr = {23,53,44,21,22,11,1,67,88,97};
        System.out.println("Bubble sort");
        printArray(bubbleSort(unsortedArr));

    }

    public static int[] bubbleSort(int[] arr){
        //Starting to compare 2 by two
        System.out.println("Before sorting :");
        printArray(arr);
        System.out.println();
        for(int i = 0 ; i < arr.length ; i++){
            boolean swap = false;
            for(int j = 0 ; j< arr.length-1;j++){
                if (arr[j]> arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.println("After sorting :");
        return arr;
    }

}
