package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("-----------------");
            System.out.println("MENU");
            System.out.println("Tra từ điển Anh - Việt:\n"
            + "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
            + "2. Xóa từ\n"
            + "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
            + "4. In ra danh sách từ khóa\n"
            + "5. Lấy số lượng từ\n"
            + "6. Xóa tất cả các từ khóa\n"
            + "0. Thoát khỏi chương trình\n"
            + "");
            System.out.println("Nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1){
                System.out.println("Nhap tu khoa: ");
                String tuKhoa = sc.nextLine();
                System.out.println("Nhap y nghia: ");
                String yNghia = sc.nextLine();
                tuDien.themTu(tuKhoa, yNghia);
            }
            else if(luaChon == 2 || luaChon == 3){
                System.out.println("Nhap tu khoa: ");
                String tuKhoa = sc.nextLine();
                if(luaChon == 2){
                    tuDien.xoaTu(tuKhoa);
                }
                else if(luaChon == 3){
                    System.out.println("Y nghia cua " + tuKhoa + " la: " + tuDien.traTu(tuKhoa));
                }
            }
            else if(luaChon == 4){
                System.out.println("Cac tu khoa co trong tu dien la: ");
                tuDien.inTuKhoa();
            }
            else if(luaChon == 5){
                System.out.println("So luong tu trong tu dien la: ");
                tuDien.laySoLuong();
            }
            else if(luaChon == 6){
                tuDien.xoaTatCa();
            }
        }while(luaChon != 0);
    }
}
