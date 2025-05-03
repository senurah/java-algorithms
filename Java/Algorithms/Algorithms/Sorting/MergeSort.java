package Java.Algorithms.Algorithms.Sorting;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {91, 32, 92, 13, 73, 14};
        System.out.println("Before: ");
        printArray(array);
        sort(array, 0, array.length - 1);
        System.out.println("\nAfter: ");
        printArray(array);

    }

    //Dividing the array into two parts till one value remain in the  array
    public static void merge(int[] list, int left,int mid, int right){

        //creating the size of two sub arrays to be merged
        int n1 = mid - left+1;
        int n2 = right -mid;

        //creating the two temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        //copying the data to the temporary arrays
        for(int i = 0 ; i< n1; ++i){
            leftArray[i] = list[left + i];
        }

        for(int j = 0; j< n2; ++j){
            //should be < mid + 1
            rightArray[j] = list[mid + 1 + j];
        }

        //Merging the temp arrays
        int i = 0, j = 0;
        int k = left; // initial index of merged sub array

        while(i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                list[k] = leftArray[i];
                i++;
            }else {
                list[k] = rightArray[j];
                j++;
            }
            k++;
        }

        //Copying the remaining  elements in the leftArray (as they are smaller)
        while(i<n1){
            list[k] = leftArray[i];
            i++;
            k++;
        }

        //Copying the remaining in right Array
        while(j< n2){
            list[k] = rightArray[j];
            j++;
            k++;
        }

    }

    public static void sort(int[] arr, int left,int right){
        //Checking which section is lesser to divide
        if(left<right){
            //Creating the mid-value
            int mid = (left+ right)/2;

            //Sort the left half by calling the sort method again
            //left to mid
            sort(arr,left,mid);

            //Sort right half
            sort(arr,mid+1,right);

            //Merge the sorted halves
            merge(arr,left,mid,right);


        }

    }

    public static void printArray(int [] array){
        for(int i: array){
            System.out.print(i+" ");
        }
    }

}
