package Java.Algorithms.Algorithms.Practice;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SearchingAlgorithms {

    //Linear search Algorithm
    public static int linearSearch(int findNum,int [] arr){
        for (int i: arr){
            if(findNum == arr[i]){
                return arr[i];
            }
        }
        return -1;
    }

    //Making this in the simpler version
    public static OptionalInt linearSearch(int [] arr, int findNum){
        return Arrays.stream(arr).filter(x-> x == findNum).findFirst();
    }

    public static OptionalInt linearSearch2(int [] arr, int findNum){
        return IntStream.range(0, arr.length).filter(x -> arr[x]== findNum).findFirst();
    }

    public static void main(String[] args) {
        int [] testArray = {2,4,24,53,5,52,6,7};
        int find = 2;

        System.out.println("Linear Search_1 : "+linearSearch(testArray,find));
        System.out.println("Linear Search_2 : "+linearSearch2(testArray,find));

    }

    public static boolean LinearSearch3(int[] array,int findMe){
        for(int i = 0;i< array.length; i++){
            if(array[i] == findMe){
                return true;
            }
        }
        return false;
    }


}
