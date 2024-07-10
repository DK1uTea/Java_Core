package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();

        // stackChuoi.push("Gia tri") => dua gia tri vao stack
        // stackChuoi.pop() => lay gia tri ra
        // stackChuoi.peek() => lay gia tri ra, nhung khong xoa khoi stack
        // stackChuoi.clear(); => xoa tat ca phan tu trong stack
        // stackChuoi.contains("gia tri") => xac dinh xem gia tri co ton tai trong stack hay khong
        // stakChuoi.size() => do lon cua stack
        // Vi du dao nguoc chuoi
        System.out.println("Nhap vao chuoi: ");
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++){
            stackChuoi.push(s.charAt(i) + "");
        }
        System.out.println("Chuoi dao nguoc: ");
        while(!stackChuoi.empty()){
            System.out.print(stackChuoi.peek());
            stackChuoi.pop();
        }
        System.out.println();
        // Vi du chuyen he thap phan sang nhap phan
        Stack<Integer> stackSoDu = new Stack<Integer>();
        System.out.println("Nhap 1 so nguyen duong tu ban phim: ");
        int x = sc.nextInt();
        while(x>0){
            int soDu = x%2;
            stackSoDu.push(soDu);
            x/=2;
        }
        while(!stackSoDu.empty()){
            System.out.print(stackSoDu.peek());
            stackSoDu.pop();
        }
        System.out.println();
    }
}
