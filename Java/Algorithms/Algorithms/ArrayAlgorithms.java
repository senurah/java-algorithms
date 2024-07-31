package Java.Algorithms.Algorithms;

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

    public static void makeGap(String name){
        System.out.println();
        System.out.println("=============================================================");
        System.out.println();
        System.out.println("\t\t"+name);
        System.out.println();
    }



}
