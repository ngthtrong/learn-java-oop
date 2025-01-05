package thuchanh1819.buoi3;

import java.util.Scanner;

import thuchanh1819.buoi2.Diem;

public class Line {
	private Diem d1;
	private Diem d2;

	public Line() {
		super();
	}

	public Line(Diem d1, Diem d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}

	public Line(int ax, int ay, int bx, int by) {
		super();
		this.d1 = new Diem(ax, ay);
		this.d2 = new Diem(bx, by);
	}

	public void setData(Scanner scan) {
		System.out.println("Enter data of d1:");
		this.d1 = new Diem();
		d1.nhapDiem(scan);
		System.out.println("Enter data of d2:");
		this.d2 = new Diem();
		d2.nhapDiem(scan);
	}

	public void printData() {
		this.d1.hienThi();
		this.d2.hienThi();
	}

	public void translateLine(int dx, int dy) {
		this.d1 = new Diem(this.d1.giaTriX() + dx, this.d1.giaTriY() + dy);
		this.d2 = new Diem(this.d2.giaTriX() + dx, this.d2.giaTriY() + dy);
	}

	public float calcDistance() {
		return (float) Math.round(this.d1.khoangCach(this.d2) * 100) / 100;
	}

	public double calcAngle() {
		double angleR = Math.atan2(this.d2.giaTriY() - this.d1.giaTriY(), this.d2.giaTriX() - this.d1.giaTriX());
		return (double) Math.round(Math.toDegrees(angleR) * 100) / 100;

	}

}
