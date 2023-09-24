package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int l = str.length();
        System.out.println("The length of str is: " + l);
        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean isEqual = str.equalsIgnoreCase(str2);
        System.out.println("The equality of str and str2 is: " + isEqual);
        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str + str2;
        System.out.println("The concatenation result of str and str2 is: " + str3);
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        System.out.println("Replace method : "+ str.replace('e','i'));
        System.out.println("Substring method: " + str.substring(0,3));
        System.out.println("Contains method: " + str.contains("f"));
        System.out.println("IndexOf method: " + str.indexOf('o'));

    }


}