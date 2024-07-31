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



}
