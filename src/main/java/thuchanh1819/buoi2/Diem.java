package thuchanh1819.buoi2;

import java.util.Scanner;

public class Diem {
	private int x;
	private int y;

	public Diem() {

	}

	public Diem(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void nhapDiem(Scanner scan) {
	
		System.out.print("Enter x: ");
		this.x = scan.nextInt();
		System.out.print("Enter y: ");
		this.y = scan.nextInt();

	}

	public void hienThi() {
		System.out.println("(" + x + "," + y + ")");
	}

	public int giaTriX() {
		return x;
	}

	public int giaTriY() {
		return y;
	}

	public float khoangCach() {
		return (float) Math.sqrt(x * x + y * y);

	}

	public float khoangCach(Diem d) {
		return (float) Math.sqrt((x - d.giaTriX()) * (x - d.giaTriX()) + (y - d.giaTriY()) * (y - d.giaTriY()));
	}

}
