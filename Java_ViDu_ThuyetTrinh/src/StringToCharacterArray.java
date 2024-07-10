// Java Program to Convert a String to Character Array
// Using toCharArray() Method
public class StringToCharacterArray {
    public static void main(String[] args) {
        // Custom input String
        String s = "GeeksForGeeks";
        // Creating array and storing array
        // Returned by toCharArray() method
        char[] ch = s.toCharArray();
        // Printing the array elements
        for (char c : ch) {
            System.out.println(c);
        }
    }
}
