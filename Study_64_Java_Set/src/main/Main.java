package main;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
        do{
            System.out.println("-----------------------------------------");
            System.out.println("MENU");
            System.out.println("1. Them ma so du thuong.");
            System.out.println("2. Xoa ma so du thuong.");
            System.out.println("3. Kiem tra ma so du thuong co ton tai hay khong?");
            System.out.println("4. Xoa tat ca cac phieu du thuong.");
            System.out.println("5. So luong phieu du thuong.");
            System.out.println("6. Rut tham trung thuong.");
            System.out.println("7. In ra tat ca cac phieu.");
            System.out.println("0. Thoat khoi chuong trinh.");
            System.out.println("------------------------------------------");
            System.out.println("Nhap su lua chon cua ban: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1 || luaChon == 2 || luaChon == 3){
                System.out.println("Nhap vao ma phieu du thuong");
                String giaTri = sc.nextLine();
                if(luaChon == 1){
                    rt.themPhieu(giaTri);
                }
                else if (luaChon == 2){
                    rt.xoaPhieu(giaTri);
                }
                else if(luaChon == 3){
                    System.out.println("Ket qua kiem tra: " + rt.kiemTraPhieuTonTai(giaTri));
                }
            }
            else if(luaChon == 4){
                rt.xoaTatCaPhieuDuThuong();
            }
            else if(luaChon == 5){
                System.out.println("So luong phieu du thuong " + rt.laySoLuong());
            }
            else if(luaChon == 6){
                System.out.println("Phieu trung thuong la: " + rt.rutMotPhieu());
            }
            else if(luaChon == 7){
                System.out.println("Cac ma phieu du thuong la: ");
                rt.inTatCa();
            }
        }while(luaChon != 0);
    }
}
