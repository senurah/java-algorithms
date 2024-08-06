package Java.Algorithms.Algorithms;
import java.util.Stack;
public class StacksAlgorithms {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        System.out.println("START : main");
        stack.push("main");
        System.out.println("START : builder");
        stack.push("builder");
        System.out.println("START : external-service");
        stack.push("external-service");
        System.out.println("END : "+stack.pop());
        System.out.println("START : parse-external-data");
        stack.push("parse-external-data");
        System.out.println("END : "+stack.pop());
        System.out.println("END : "+stack.pop());
        System.out.println("END : "+stack.pop());

        //stack.peek(); --> Checking without removing

        //Next Greater Element Algorithm
        System.out.println("\n Next Greater Element Algorithm \n");
        printNextGreaterElement(new int[] {15,13,7,2,45});

        System.out.println("\n Matching parenthesis Algorthm \n ");
        System.out.println(hasMatchingParenthesis("(Alorthims (()))"));
        System.out.println(hasMatchingParenthesis(")) this should be false ()"));

    }

    /**
     * Next Greater Element Algorithm:
     */
    public static void printNextGreaterElement(int[] arr){
        if(arr.length ==0 ){
            System.out.println();
            return;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for(int i =1 ; i<arr.length;i++){
            int next = arr[i];
            //Checking the stack
            if(!stack.empty()){
                int popped = stack.pop();
                while(popped< next){
                    System.out.println(popped+" --> "+next);
                    //Updating the popped value
                    if(stack.empty()){
                        break;
                    }
                    popped = stack.pop();
                }

                //If popped is greater than  next -> pushing to the stack
                if(popped> next){
                    stack.push(popped);
                }

            }
            stack.push(next);
        }

        //After above loop remaining items on the stack doesn't have next greater elements
        while (!stack.empty()){
            System.out.println(stack.pop()+" --> "+-1);
        }
    }

    /**
     * Matching parentheses algorithm ()
     */
    public static boolean hasMatchingParenthesis(String s){
        Stack<Character> stack = new Stack<>();

        for(int i =0 ; i<s.length();i++){
            char current = s.charAt(i);
            if(current=='('){
                stack.push(current);
            } else if (current==')') {
                if(!stack.empty()){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }

        return stack.empty();

    }


}
