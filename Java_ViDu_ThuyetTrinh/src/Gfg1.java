public class Gfg1 {
    public static void main(String args[])
    {
        String str = "Welcome! to GeeksforGeeks";
 
        char[] destArray = new char[] {'H', 'e', 'l', 'l', 'o'};
        try {
            str.getChars(0, 4, destArray, 2);
            System.out.println(destArray);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
