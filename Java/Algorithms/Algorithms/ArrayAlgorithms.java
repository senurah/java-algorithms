package Java.Algorithms.Algorithms;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayAlgorithms {

    //linear Search Algorithm --> in an Array
    public static boolean linearSearch(int [] arr,int item){
        for(int num : arr){
            if(num == item){
                return true;
            }
        }
        return false;
    }

    public static Integer linearSearch2(int [] arr,int item){
        for(int num : arr){
            if(num == item){
                return item;
            }
        }
        return null;
        //int cannot be null but Integer is an object so it can be null
    }

    /**
     * Linear search 3 using Array class to convert int to stream of int
     */
    public static OptionalInt linearSearh3(int [] arr, int item){
        //converting to stream and filtering out the data through conditions
         return Arrays.stream(arr).filter(x -> x == item).findFirst();
        //findFirst will return optional therefor we need return the optional int
        //Optional acts as a container object to help prevent null.
    }


    public static void makeGap(String name){
        System.out.println();
        System.out.println("=============================================================");
        System.out.println();
        System.out.println("\t\t"+name);
        System.out.println();
    }



}
