package Java.Algorithms.Algorithms.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static Java.Algorithms.Algorithms.ArrayAlgorithms.makeGap;

public class HashMapMain {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Bob",23,"Tech");
        Employee emp2 = new Employee("Rob",23,"Market");
        Employee emp3 = new Employee("Gus",43,"IT");

        //Storing the id as the keys in hashmaps inorder to reject  duplicated ids
        System.out.println("HashMaps \n");
        HashMap<Integer,Employee> employeesById = new HashMap<>();
        employeesById.put(emp1.id,emp1);
        employeesById.put(emp2.id,emp2);
        employeesById.put(emp3.id,emp3);

        //Getting the values
        Employee retrievedEmp = employeesById.get(23);

        if(retrievedEmp != null){
            System.out.println(retrievedEmp.name+" : "+retrievedEmp.department);
        }

        //.containsKey() & .containsValue() --> As like in the dictionaries in the python

        //For dealing with unique data set -> HashSet
        System.out.println("\nHashSet\n");
        HashSet<String> productCodes = new HashSet<>();
        productCodes.add("W123");
        productCodes.add("W124");
        productCodes.add("W321");

        //Using the contains method in hashSets
        System.out.println(productCodes.contains("W124"));
        System.out.println(productCodes.contains("W333"));

        /**
         * HashMap --> Keys are unique
         * HashSet --> Each values are unique
         */
        makeGap("Find missing Element Algorithm");
        findMissingElements(new int[] {1,2,3,5}, new int [] {2,4}).forEach(System.out::println);



    }

    /**
     * Finding the missing element algorithm
     * @param first
     * @param second
     * @return
     */
    public static List<Integer> findMissingElements(int[] first,int[] second){
        List<Integer> missingElements = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        for(int x: second){
            hashSet.add(x);
        }

        //Checking the missing values
        for(int y : first){
            if(!hashSet.contains(y)){
                missingElements.add(y);
            }
        }
        return missingElements;
    }


}
