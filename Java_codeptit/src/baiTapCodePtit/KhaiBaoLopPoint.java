package baiTapCodePtit;

import java.util.Scanner;

public class KhaiBaoLopPoint {
	private double x;
	private double y;
	
	public KhaiBaoLopPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public KhaiBaoLopPoint() {
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
	
	public double distance(KhaiBaoLopPoint A) {
		return Math.sqrt((this.x - A.x)*(this.x - A.x) + (this.y - A.y)*(this.y - A.y));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- >0) {
			Diem point = new Diem(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			System.out.println(point);
		}
	}
}

class Diem {
	private KhaiBaoLopPoint P1 = new KhaiBaoLopPoint();
	private KhaiBaoLopPoint P2 = new KhaiBaoLopPoint();
	public Diem(double x1, double y1, double x2, double y2) {
		P1.setX(x1);
		P1.setY(y1);
		P2.setX(x2);
		P2.setY(y2);
	}
	@Override
	public String toString() {
		return String.format("%.4f", P1.distance(P2));
	}
	
}
