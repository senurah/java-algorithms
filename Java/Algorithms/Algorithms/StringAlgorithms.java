package Java.Algorithms.Algorithms;

public class StringAlgorithms {

    //Validation Algorithms
    /**
     * Checking all uppercase Letters
     * Output : boolean
     */
    public static boolean isUpperCase(String s){
        //Character stream - To iterate through all the characters
        return s.chars().allMatch(Character::isUpperCase);
    }
    /**
     * Checking all lowercase
     * chars() - allMatch()
     */
    public static boolean isLowerCase(String s){
        //Can use nonMatch(Character::isUpperCase)
        return s.chars().allMatch(Character::isLowerCase);
    }

    //Contains onlyDigits, NonMatch

    //Validating multiple cases once:
    public static boolean isPasswordComplex(String s){
        //1 Upper,1 Lower, 1 Digit
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);

    }

    //Normalizing the strings
    /**
     * Can convert all the Strings to one form or take one input form(normalizing an input)
     */
    public static String normalizeString(String s){
        String lowerCased = s.toLowerCase();
        //Trimming by removing white spaces
        String trimmed = lowerCased.trim();
        //Replacing characters with another
        String replaced = trimmed.replace(","," ");

        //Doing all above in one line
        return s.toLowerCase().trim().replace(","," ");
    }

    //Searching substrings on a strings
    //.contains("String") --> returns boolean on a String
    public static void parseStrings(String s){
        System.out.println("--- Searching on a String ---");
        String st = "Hello";
        System.out.println(st.contains("ll"));

        System.out.println("Going through a String \nOption 1");

        for(char c : st.toCharArray()){
            System.out.print(c);
        }
        System.out.println("Option 2");
        for(int i =0; i<st.length();i++){
            char c = st.charAt(i);
            System.out.print(c);
        }


    }

    /**
     * Checking the character is in an even position
     * @param s
     * @param item
     * @return
     */
    public static boolean isAtEvenIndex(String s, char item){
        //Handling the null and empty strings
        if(s==null || s.isEmpty()){
            return false;
        }
        for(int i=0; i<s.length();i+=2){
            if(s.charAt(i)== item){
                return true;
            }
        }
        return false;
    }

    //Creating a dynamic string using input data
    public static String reverse(String s){
        if(s==null || s.isEmpty()){
            return s;
        }

        //Using String Builder
        //Efficient : when string builder object modifies it doesn't create a new StringBuilder
        //Instead it dynamically expands its memory to accommodate the modified String
        StringBuilder reversed = new StringBuilder();
        //Accessing the string from the back.
        for(int i= s.length()-1; i>=0;i--){
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

    //Using the reverse function in the String builder class
    public static String reverse2(String s){
        if(s==null || s.isEmpty()){
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

    //StringBuilder --> trimToSize() : trimming the spaces and the end


    







}
