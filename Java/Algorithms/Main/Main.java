package Java.Algorithms.Main;

import java.util.Arrays;

import static Java.Algorithms.Algorithms.ArrayAlgorithms.*;
import static Java.Algorithms.Algorithms.StringAlgorithms.*;

public class Main {
    public static void main(String[] args) {
        makeGap("String Algorithms");
        //Validation Algorithm testing
        //All Capital
        System.out.println(isUpperCase("TREE"));
        System.out.println();
        //Complex validation
        System.out.println(isPasswordComplex("ThisV3lid"));
        //Normalizing a string
        System.out.println(normalizeString("   This,Is,Not a thing "));

        //Search Algorithms on Strings
        parseStrings("Hello");
        System.out.println(isAtEvenIndex("   ",'i'));
        //Using String builder to create dynamic strings
        System.out.println(reverse("This should be reversed .."));
        System.out.println(reverse2(".. desrever eb dluohs sihT"));

        makeGap("Array Algorithms");
        int [] arr = {1,2,4,5,67,34,64};
        System.out.println(linearSearch(arr,53));
        System.out.println(linearSearch2(arr,5));

        //Optional Int
        linearSearh3(arr,2).ifPresent(System.out::println);
        //Array should be sorted
        System.out.println(binarySearch(arr,67));
        //Built in binary search function
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,67));

        //Extracting even numbers from 2 arrays
        int [] arr2 = {-1,0,23,44,-44,65};
        int [] resultArray = findEvenSum(arr,arr2);
        for(int num: resultArray){
            System.out.print(num+" ");
        }
        System.out.println();
        Arrays.stream(findEvenSum(arr,arr2)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(findEvenNum2(arr,arr2)).forEach(System.out::print);

        System.out.println("\nReversing Arrays");
        Arrays.stream(reverseArray(arr)).forEach(System.out::println);
        System.out.println();
        reverseArrayInPlace(arr);
        reverseArrayInPlace(arr);
        Arrays.stream(arr).forEach(System.out::println);





    }


}
