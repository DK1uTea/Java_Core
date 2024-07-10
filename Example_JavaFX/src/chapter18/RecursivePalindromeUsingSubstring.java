package chapter18;

public class RecursivePalindromeUsingSubstring {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            // Trường hợp cơ bản: Một chuỗi rỗng hoặc có một ký tự là palindrome
            return true;
        } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
            // Trường hợp cơ bản: Nếu ký tự đầu và cuối không giống nhau, không phải là palindrome
            return false;
        } else {
            // Trường hợp đệ quy: Loại bỏ ký tự đầu và cuối, và kiểm tra phần còn lại
            return isPalindrome(s.substring(1, s.length() - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
        System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
        System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
        System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
    }
}

