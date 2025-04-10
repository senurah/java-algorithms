package Java.Algorithms.Algorithms.Practice;

import java.util.Arrays;
import java.util.OptionalInt;

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


}
