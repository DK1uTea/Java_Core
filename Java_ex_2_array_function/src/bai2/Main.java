package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Course co = new Course();
        int luaChon = 0;
        do {
            showMenu();
            luaChon = choice();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhap so luong sinh vien muon them: ");
                    int soLuongSinhVien = sc.nextInt();
                    sc.nextLine();
                    while (soLuongSinhVien -- >0) {
                        System.out.println("Nhap ten sinh vien: ");
                        String name = sc.nextLine();
                        System.out.println("Nhap ma sinh vien: ");
                        String code = sc.nextLine();
                        System.out.println("Nhap email sinh vien: ");
                        String email = sc.nextLine();
                        System.out.println("Nhap diem: ");
                        double point = sc.nextDouble();
                        sc.nextLine();
                        String rank = checkPoint(point);
                        Student st = new Student(name, code, email, point, rank);
                        co.addStudent(st);
                    }
                    co.printListOfStudent();
                    break;
                case 2:
                    System.out.println("Nhap diem can tim: ");
                    double p = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Danh sach sinh vien co diem " + p + " la: ");
                    co.searchPoint(p);
                    break;
                case 3:
                    System.out.println("Nhap hoc luc can tim: ");
                    String hocLuc = sc.nextLine();
                    System.out.println("Danh sach sinh vien co hoc luc " + hocLuc + " la: ");
                    co.searchRank(hocLuc);
                    break;
                case 4:
                    System.out.println("Nhap ma so sv can tim: ");
                    String maSo = sc.nextLine();
                    System.out.println("Danh sach sinh vien co ma sv " + maSo + " la: ");
                    co.searchCode(maSo);
                    System.out.println("Nhap stt sinh vien muon cap nhat thong tin:");
                    int stt = sc.nextInt();
                    co.updateInformation(stt);
                    break;
                case 5:
                    System.out.println("Danh sach sinh vien co diem giam dan: ");
                    // co.arrangeStudent();
                    co.arrangeStudent2();
                    co.printListOfStudent();
                    break;
                case 6:
                    System.out.println("Danh sach 5 sinh vien co diem cao nhat la: ");
                    co.print5StudentHighestPoint();
                    break;
                case 7:
                    System.out.println("Diem trung binh cua lop la: ");
                    System.out.println(co.averagePoint());
                    break;
                case 8:
                    System.out.println("Danh sach sinh vien co diem lon hon diem TB cua lop: ");
                    co.printHigherAverrage();
                    break;
                case 9:
                    System.out.println("Nhap rank can tim: ");
                    String rank = sc.nextLine();
                    System.out.println("So sinh vien co hoc luc " + rank + " " + co.numberOfStudentFollowRanking(rank));
                    break;
                default:
                    System.out.println("EXIT");
                    break;
            }
        } while (luaChon != 0);
    }

    public static void showMenu() {
        System.out.println("+-------------------------------------+");
        System.out.println("1. Nhap va xuat danh sach sinh vien");
        System.out.println("2. Tim kiem sinh vien theo diem");
        System.out.println("3. Tim kiem sinh vien theo hoc luc");
        System.out.println("4. Tim kiem sinh vien theo ma so va cap nhat thong tin sinh vien");
        System.out.println("5. Sap xep sinh vien theo diem giam dan");
        System.out.println("6. Xuat danh sach 5 sinh vien co diem cao nhat");
        System.out.println("7. Tinh diem trung binh cua lop");
        System.out.println("8. Xuat dssv co diem TB tren diem TB cua lop");
        System.out.println("9. Tong so sinh vien theo hoc luc");
        System.out.println("0. Exit");
        System.out.println("+-------------------------------------+");
    }

    public static int choice() {
        int chon = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon mot chuc nang: ");
        chon = sc.nextInt();
        return chon;
    }

    public static String checkPoint(double p){
        if (p < 5) {
            return "Yeu";
        }
        else if (p >= 5 && p < 6.5) {
            return "Trung Binh";
        } else if (p >= 6.5 && p < 7.5) {
            return "Kha";
        } else if (p  >= 7.5 && p <= 9) {
            return "Gioi";
        }
        return "Xuat Sac";
    }
}
