package baiTapCodePtit;

import java.util.Scanner;

public class Point {
    private double x;
    private double y;
    
    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point A) {
        this.x = A.x;
        this.y = A.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point A){
        return Math.sqrt((this.x-A.x)*(this.x-A.x) + (this.y-A.y)*(this.y-A.y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- >0) {
            Triangle A = new Triangle(sc.nextDouble(), sc.nextDouble(),  sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            System.out.println(A);
        }
    }
}

class Triangle {
    private Point A = new Point();
    private Point B = new Point();
    private Point C = new Point();
    private double AB, BC, AC;
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        A.setX(x1);;
        A.setY(y1);
        B.setX(x2);
        B.setY(y2);
        C.setX(x3);
        C.setY(y3);
        this.AB = A.distance(B);
        this.AC = A.distance(C);
        this.BC = B.distance(C);
    }
    @Override
    public String toString() {
        if (AB + AC <= BC || AB + BC <= AC || AC + BC <= AB)
            return String.format("INVALID");
        return String.format("%.3f", AB + AC + BC);
    }    
}