public class StringMethod{
    public static void main(String[]args){
        /*Comparing two strings ignoring case differences*/
        
        String s="Welcome";
        String s1="Java";

        s="Welcome";
        System.out.println(s.equalsIgnoreCase("welcome"));

        /*concatenate a string at the end of another string*/

        System.out.println(s.concat(s1));

        /*to find length of the string*/

        System.out.println(s.length());

        /*get a substring of a given string between two specified positions*/

        System.out.println(s.substring(0,5));

        /*convert string to Uppercase*/

        System.out.println(s.toUpperCase());

        /*convert string to lowercase*/

        System.out.println(s1.toLowerCase());

        /*to check specific character in a string*/

        System.out.println(s.contains("Wel"));
        System.out.println(s1.contains("java"));


        
    }
}