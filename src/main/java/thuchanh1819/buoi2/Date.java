package thuchanh1819.buoi2;

import java.util.Scanner;

public class Date {
	private int ngay;
	private int thang;
	private int nam;

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	private static boolean isNamNhuan(int nam) {
		if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0))
			return true;
		return false;
	}

	private static int daysInMonth(Date d) {
		switch (d.getNgay()) {
		case 1:
			return 31;
		case 2:
			return isNamNhuan(d.getNam()) ? 29 : 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			throw new IllegalArgumentException("Invalid month: " + d.getThang());
		}
	}

	public Date() {
	}

	public Date(int day, int month, int year) {
		super();
		ngay = day;
		thang = month;
		nam = year;
		if (!hopLe()) {
			System.out.println("Ngay khong hop le, vui long nhap lai!");
//			this.nhapNgay();
		}

	}

	public void hienThi() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}

	public void nhapNgay() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("Nhap ngay (dd mm yyyy): ");
			this.ngay = scan.nextInt();
			this.thang = scan.nextInt();
			this.nam = scan.nextInt();
			if (hopLe()) {
				System.out.println("Nhap ngay thanh cong.");
				break;
			} else
				System.out.println("Ngay khong hop le, vui long nhap lai!");
		}
		scan.close();
	}

	public boolean hopLe() {
		if (ngay < 1 || ngay > 31 || thang < 1 || thang > 12 || nam < 0 || nam > 9999)
			return false;
		if ((thang == 4 || thang == 6 || thang == 9 || thang == 11) && ngay == 31)
			return false;
		if (thang == 2) {
			if (ngay > 28)
				if (!isNamNhuan(nam))
					return false;
		}
		return true;
	}

	public Date nextDate() {
		if (hopLe()) {
			if (((thang == 4 || thang == 6 || thang == 9 || thang == 11) && ngay == 30) || (ngay == 31 && thang != 12)
					|| (ngay == 29 && thang == 2) || (ngay == 28 && thang == 2 && !isNamNhuan(nam))) {
				ngay = 1;
				thang += 1;
				return this;
			}
			if (ngay == 31 && thang == 12) {
				ngay = 1;
				thang = 1;
				nam += 1;
				return this;
			}
			ngay += 1;
			return this;
		}
		return null;
	}

	public Date congNgay(int soNgayThem) {
		while (soNgayThem > 0) {
			if (soNgayThem + ngay > daysInMonth(this)) {
				soNgayThem -= (daysInMonth(this) - ngay + 1);
				ngay = 1;
				if (thang == 12) {
					nam++;
					thang = 1;
				} else
					thang++;

			} else {
				ngay += soNgayThem;
				soNgayThem = 0;
			}
		}
		return this;
	}

}
