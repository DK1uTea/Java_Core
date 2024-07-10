import java.util.Scanner;

public class Bai_1_15 {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int lowerCase = 0, upperCase = 0;
        for(int i = 0; i< s.length(); i++){
            if(Bai_1_15.isVowel(s.charAt(i)) && Character.isLowerCase(s.charAt(i))){
                lowerCase++;
            }
            else if(Bai_1_15.isVowel(s.charAt(i)) && Character.isUpperCase(s.charAt(i))){
                upperCase++;
            }
        }
        System.out.println("The number of upperCase and lowerCase vowels: " + upperCase + " and " + lowerCase);
    }
}
