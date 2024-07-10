package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Course {
    private ArrayList<Student> danhSach;
    
    public Course() {
        this.danhSach = new ArrayList<Student>();
    }

    // them sinh vien
    public void addStudent (Student st){
        this.danhSach.add(st);
    }

    // in danh sach sinh vien
    public void printListOfStudent (){
        for (Student student : danhSach) {
            System.out.println(student.toString());
        }
    }

    // tim kiem sinh vien theo diem
    public void searchPoint (double p){
        for (Student student : danhSach) {
            if(student.getPoint() == p){
                System.out.println(student);
            }
        }
    }

    // tim kiem sinh vien theo hoc luc
    public void searchRank(String s){
        for (Student student : danhSach) {
            if(student.getRank().equals(s)){
                System.out.println(student);
            }
        }
    }

    // tim kiem sinh vien theo ma sv
    public void searchCode(String s){
        for (Student student : danhSach) {
            if(student.getStudentCode().equals(s)){
                System.out.println(student);
            }
        }
    }
    
    // cap nhap thong tin sv thu 'i'
    public void updateInformation (int idx){
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        do {
            System.out.println("--------------");
            System.out.println("1. Cap nhat ten sv \n" 
            + "2. Cap nhat ma sv \n"
            + "3. Cap nhat email sv \n"
            + "4. Cap nhat diem sv \n"
            + "5. Cap nhat rank sv \n"
            + "0. EXIT \n");
            System.out.println("--------------");
            System.out.println("Nhap loai thong tin muon cap nhat: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhap ten moi: ");
                    String newName = sc.nextLine();
                    danhSach.get(idx).setName(newName);
                    break;
                case 2:
                    System.out.println("Nhap ma sv moi: ");
                    String newCode = sc.nextLine();
                    danhSach.get(idx).setStudentCode(newCode);
                    break;
                case 3:
                    System.out.println("Nhap email moi: ");
                    String newEmail = sc.nextLine();
                    danhSach.get(idx).setEmail(newEmail);
                    break;
                case 4:
                    try {
                        System.out.println("Nhap diem moi: ");
                        double newPoint = sc.nextDouble();
                        sc.nextLine(); 
                        danhSach.get(idx).setPoint(newPoint);
                    } catch (InputMismatchException e) {
                        System.out.println("Nhap sai dinh dang diem!");
                        sc.nextLine(); 
                    }
                    break;
                case 5:
                    System.out.println("Nhap rank moi: ");
                    String newRank = sc.nextLine();
                    danhSach.get(idx).setRank(newRank);
                    break;
                default:
                    System.out.println("Ket thu cap nhat!");
                    break;
            }
        } while (luaChon != 0);
    }



    // Sap xep dssv theo diem
    public void arrangeStudent (){
        Collections.sort(this.danhSach, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2){
                if(st1.getPoint() < st2.getPoint()){
                    return 1;
                }
                else if (st1.getPoint() > st2.getPoint()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
    }

    public void arrangeStudent2 (){
        Collections.sort(this.danhSach);
    }

    // In ra 5 sinh vien co diem cao nhat
    public void print5StudentHighestPoint(){
        arrangeStudent();
        for(int i = 0; i<5; i++){
            System.out.println(this.danhSach.get(i).toString());
        }
    }

    // Tinh diem trung binh cua lop
    public double averagePoint(){
        double average = 0;
        for (Student student : danhSach) {
            average += student.getPoint();
        }
        return average/=danhSach.size();
    }

    // in sv co diem tren diem tb cua lop
    public void printHigherAverrage (){
        double average = averagePoint();
        for (Student student : danhSach) {
            if(student.getPoint() > average){
                System.out.println(student);
            }
        }
    }

    // Tong so sinh vien theo hoc luc
    public int numberOfStudentFollowRanking(String s){
        int cnt = 0;
        for (Student student : danhSach) {
            if(student.getRank().equals(s)){
                cnt++;
            }
        }
        return cnt;
    }
}
