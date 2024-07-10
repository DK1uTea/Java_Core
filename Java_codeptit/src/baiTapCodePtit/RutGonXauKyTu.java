package baiTapCodePtit;

import java.util.Scanner;
import java.util.Stack;

public class RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        Stack<Character> st = new Stack();
        for(int i = s.length() - 1 ; i>=0; i--){
            if(!st.empty() && s.charAt(i) == st.peek()){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        if(st.empty()){
            System.out.println("Empty String");
        }
        else{
            while (!st.empty()) {
                System.out.print(st.pop());
            }
        }
    }
}
