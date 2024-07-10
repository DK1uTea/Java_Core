package chapter18;

public class RecursivePalindrome {
    public static boolean isPalindrome(String s) {
        // Gọi phương thức isPalindrome với tham số ban đầu là chuỗi s và chỉ mục khởi đầu và kết thúc
        return isPalindrome(s, 0, s.length() - 1);
    }

    private static boolean isPalindrome(String s, int low, int high) {
        if (high <= low) {
            // Trường hợp cơ bản: Nếu chỉ mục kết thúc (high) nhỏ hơn hoặc bằng chỉ mục khởi đầu (low), coi đó là palindrome
            return true;
        } else if (s.charAt(low) != s.charAt(high)) {
            // Trường hợp cơ bản: Nếu ký tự tại chỉ mục khởi đầu và kết thúc không giống nhau, không phải là palindrome
            return false;
        } else {
            // Trường hợp đệ quy: So sánh ký tự tiếp theo ở phía trước và phía sau
            return isPalindrome(s, low + 1, high - 1);
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

