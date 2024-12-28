package thuchanh1819.buoi2;

import java.util.Scanner;

public class PhanSo {
	private int TuSo;
	private int MauSo;

	private void chuanHoa() {
		int a = this.TuSo;
		int b = this.MauSo;
		while (a % b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		this.TuSo /= b;
		this.MauSo /= b;
	}

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
		System.out.print("Nhap tu so: ");
		if (scan.hasNextInt())
			this.TuSo = scan.nextInt();
		this.MauSo = 0;
		while (this.MauSo == 0) {
			System.out.print("Nhap mau so: ");
			this.MauSo = scan.nextInt();
			if (this.MauSo == 0)
				System.out.println("Vui long nhap mau so khac 0!");

		}
		this.chuanHoa();
	}

	public void hienThiPhanSo() {
		if (this.TuSo == 0 || this.MauSo == 1) {
			System.out.println(this.TuSo);
			return;
		}
		System.out.println(this.TuSo + "/" + this.MauSo);
	}

	public void nghichDao() {
		if (this.TuSo == 0) {
			System.out.println("Khong the nghich dao phan so 0");
		} else {
			int temp = this.TuSo;
			this.TuSo = this.MauSo;
			this.MauSo = temp;
		}
	}

	public PhanSo giaTriNghichDao() {
		if (this.TuSo == 0) {
			System.out.println("Khong the nghich dao phan so 0");
			return this;
		} else
			return new PhanSo(this.MauSo, this.TuSo);
	}

	public double giaTriPhanSo() {
		return (double) this.TuSo / this.MauSo;
	}

	public boolean lonHon(PhanSo a) {
		return this.giaTriPhanSo() > a.giaTriPhanSo();
	}

	public PhanSo cong(PhanSo a) {
		if (this.TuSo == 0)
			return a;
		if (a.TuSo == 0)
			return this;
		PhanSo rs = new PhanSo(this.TuSo * a.MauSo + a.TuSo * this.MauSo, this.MauSo * a.MauSo);
		rs.chuanHoa();
		return rs;
	}

	public PhanSo tru(PhanSo a) {
		if (this.TuSo == 0) {
			a.setTuSo(-a.getTuSo());
			return a;
		}
		if (a.TuSo == 0)
			return this;
		PhanSo rs = new PhanSo(this.TuSo * a.MauSo - a.TuSo * this.MauSo, this.MauSo * a.MauSo);
		rs.chuanHoa();
		return rs;
	}

	public PhanSo nhan(PhanSo a) {
		PhanSo rs = new PhanSo(this.TuSo * a.TuSo, this.MauSo * a.MauSo);
		rs.chuanHoa();
		return rs;
	}

	public PhanSo chia(PhanSo a) {
		return nhan(a.giaTriNghichDao());
	}

	public PhanSo cong(int n) {
		return this.cong(new PhanSo(n, 1));
	}

	public PhanSo tru(int n) {
		return this.tru(new PhanSo(n, 1));
	}

	public PhanSo nhan(int n) {
		return this.nhan(new PhanSo(n, 1));
	}

	public PhanSo chia(int n) {
		return this.chia(new PhanSo(n, 1));
	}

}
