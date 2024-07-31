package Java.Algorithms.Main;

import static Java.Algorithms.Algorithms.StringAlgorithms.*;

public class Main {
    public static void main(String[] args) {

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

    }


}
