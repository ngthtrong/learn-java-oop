package thuchanh1819.buoi2;

import java.util.Scanner;

public class PhanSo {
	private int TuSo;
	private int MauSo;

	public int getTuSo() {
		return TuSo;
	}

	public void setTuSo(int tuSo) {
		TuSo = tuSo;
	}

	public int getMauSo() {
		return MauSo;
	}

	public void setMauSo(int mauSo) {
		MauSo = mauSo;
	}

	public PhanSo() {
		super();
	}

	public PhanSo(int tuSo, int mauSo) {
		super();
		TuSo = tuSo;
		MauSo = mauSo;
	}

	public void nhapPhanSo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap tu so:");
		this.TuSo = scan.nextInt();
		this.MauSo = 0;
		while (this.MauSo == 0) {
			System.out.print("Nhap mau so: ");
			this.MauSo = scan.nextInt();
			if (this.MauSo == 0) {
				System.out.println("Vui long nhap mau so khac 0!");
			}
		}
		scan.close();
	}

	public void hienThiPhanSo() {
		if (this.TuSo == 0 || this.MauSo == 1) {
			System.out.println(this.TuSo);
			return;
		}
		System.out.println(this.TuSo + "/" + this.MauSo);

	}

}
