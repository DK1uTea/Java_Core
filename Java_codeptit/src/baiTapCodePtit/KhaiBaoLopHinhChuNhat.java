package baiTapCodePtit;

import java.util.Scanner;

public class KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        double x = sc.nextDouble();
        rectangle.setWidth(x);
        x = sc.nextDouble();
        rectangle.setHeight(x);
        String s = sc.next();
        s = s.toLowerCase();
        s = String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
        rectangle.setColor(s);
        if(rectangle.getHeight() > 0 && rectangle.getWidth() > 0){
            System.out.printf("%.0f %.0f %s", rectangle.findPerimeter(), rectangle.findArea(), rectangle.getColor());   
        }
        else{
            System.out.println("INVALID");
        }
    }
}
class Rectangle{
    private double width;
    private double height;
    private String color;
    
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    

    public Rectangle() {
        this.height = this.width = 1;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea (){
        return this.height*this.width;
    }

    public double findPerimeter (){
        return (this.height + this.width)*2;
    }

    @Override
    public String toString() {
        return findPerimeter() + " " + findArea() + " " + this.color;
    }
    
    
}
