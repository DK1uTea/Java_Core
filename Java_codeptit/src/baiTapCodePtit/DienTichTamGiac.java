package baiTapCodePtit;

import java.util.Scanner;

public class DienTichTamGiac {
	private double x;
	private double y;
	public DienTichTamGiac(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public DienTichTamGiac() {
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
	
	public double distance (DienTichTamGiac A) {
		return Math.sqrt((this.x - A.x)*(this.x - A.x) + (this.y - A.y)*(this.y - A.y));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- >0) {
			TamGiac tamGiac = new TamGiac(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			System.out.println(tamGiac);
		}
		
	}
}

class TamGiac {
	private DienTichTamGiac p1 = new DienTichTamGiac();
	private DienTichTamGiac p2 = new DienTichTamGiac();
	private DienTichTamGiac p3 = new DienTichTamGiac();
	
	private double AB, AC, BC;

	public TamGiac(double x1, double y1, double x2, double y2, double x3, double y3) {
		p1.setX(x1);
		p1.setY(y1);
		p2.setX(x2);
		p2.setY(y2);
		p3.setX(x3);
		p3.setY(y3);
		
		this.AB = p1.distance(p2);
		this.AC = p1.distance(p3);
		this.BC = p2.distance(p3);
	}
	

	@Override
	public String toString() {
		if (AB + AC <= BC || AB + BC <= AC || AC + BC <= AB)
            return String.format("INVALID");
		double p = (AB + AC + BC) / 2.0;
        return String.format("%.2f", Math.sqrt(p * (p - AB) * (p - AC) * (p - BC)));
	}
	
}
