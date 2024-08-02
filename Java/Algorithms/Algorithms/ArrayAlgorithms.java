package Java.Algorithms.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

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
     * No assumptions , Big O notation : O(n)
     */
    public static OptionalInt linearSearh3(int [] arr, int item){
        //converting to stream and filtering out the data through conditions
         return Arrays.stream(arr).filter(x -> x == item).findFirst();
        //findFirst will return optional therefor we need return the optional int
        //Optional acts as a container object to help prevent null.
        //This prevents the null pointer exceptions
    }

    /**
     * Binary search Algorithm : Divide and conquer
     * Sorted assumption, Big O notation : O(log(n))
     */
    public static boolean binarySearch(int[] arr, int item){
        int min = 0;
        int max = arr.length-1;

        while(min <= max){
            int mid = (min + max)/2;
            if(item == arr[mid]){
                return true;
            }else if (item < arr[mid]){
                max = mid -1;
            }else{
                min = mid +1;
            }
        }
        return false;
    }

    /**
     * Extracting only the even numbers from 2 Arrays
     */
    public static int[] findEvenSum(int[] arr1, int[]arr2){
        //Using an Array list to expand the array as needed.
        ArrayList<Integer> result = new ArrayList<>();

        for(int num : arr1){
            if(num % 2 == 0){
                result.add(num);
            }
        }

        for(int num : arr2){
            if(num % 2 == 0){
                result.add(num);
            }
        }

        //converting the array list to int []
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    //Using java Streams
    public static int[] findEvenNum2(int[] arr, int[] arr2){
        //Using a predicate : boolean return
        IntPredicate isEvenPred = num -> num % 2 == 0;
        //Streaming through both arrays and finding the numbers match the predicate
        return Stream.of(arr,arr2).
                flatMapToInt(Arrays:: stream).
                filter(isEvenPred).toArray();
    }

    /**
     * Reversing an array
     */
    public static int[] reverseArray(int[] arr){
        int[] result = new int[arr.length];

        for(int i =0; i< arr.length; i++){
            result[i] = arr[arr.length-1-i];
        }
        return result;
    }

    //Modifying the input array
    public static void reverseArrayInPlace(int[]arr){
        for(int i = 0; i< arr.length/2 ; i++){
            //Swap item at index i and
            //item at index (arr.length - 1- i)
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

    }







    public static void makeGap(String name){
        System.out.println();
        System.out.println("=============================================================");
        System.out.println();
        System.out.println("\t\t"+name);
        System.out.println();
    }



}
