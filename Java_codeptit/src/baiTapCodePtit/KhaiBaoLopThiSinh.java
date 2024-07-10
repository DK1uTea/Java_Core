package baiTapCodePtit;

import java.util.Scanner;

public class KhaiBaoLopThiSinh {
    private String name;
    private String doB;
    private double point1;
    private double point2;
    private double point3;
    
    public KhaiBaoLopThiSinh(String name, String doB, double point1, double point2, double point3) {
        this.name = name;
        this.doB = doB;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public void setPoint1(double point1) {
        this.point1 = point1;
    }

    public void setPoint2(double point2) {
        this.point2 = point2;
    }

    public void setPoint3(double point3) {
        this.point3 = point3;
    }

    @Override
    public String toString() {
        return this.name + " " + doB + " " +  this.sumPoint();
    }

    public double sumPoint(){
        double sum = this.point1 + this.point2 + this.point3;
        sum = Math.round(sum*10.0)/10.0;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String doB = sc.nextLine();
        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        double p3 = sc.nextDouble();

        KhaiBaoLopThiSinh ts = new KhaiBaoLopThiSinh(name, doB, p1, p2, p3);
        System.out.println(ts);
    }
}
