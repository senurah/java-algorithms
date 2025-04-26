package Java.Algorithms.Algorithms.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] unsortedArr = {23,53,44,21,22,11,1,67,88,97};
        int [] sortedArr = selectionSort(unsortedArr);


    }

    public static int[] selectionSort(int [] array){

        System.out.println("Before sorting :");
        printArray(array);

        for(int i = 0 ; i< array.length ; i++){
            int max = 0;
            //Finding the maximum value
            //reducing the size of the unsorted part
            for(int j = 0 ;j< array.length-i; j++){
                //comparing the j value always with the 0 th index
                if(array[j]> array[max]){
                    max = j;
                }
            }
            //switching the last value with the max value
            int temp = array[max];
            array[max] = array[array.length-i-1];
            array[array.length-i-1] = temp;

        }
        System.out.println("\nAfter Sorting:");
        printArray(array);
        return array;
    }

    public static void printArray(int [] array){
        for(int i: array){
            System.out.print(i+" ");
        }
    }
}
