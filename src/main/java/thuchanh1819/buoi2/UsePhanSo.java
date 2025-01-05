package thuchanh1819.buoi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsePhanSo {
	public static void main(String[] args) {
		PhanSo a = new PhanSo(3, 7);
		PhanSo b = new PhanSo(4, 9);
		a.hienThiPhanSo();
		b.hienThiPhanSo();

		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();

		Scanner scan = new Scanner(System.in);
		x.nhapPhanSo(scan);
		y.nhapPhanSo(scan);

		x.hienThiPhanSo();
		y.hienThiPhanSo();

		x.giaTriNghichDao().hienThiPhanSo();

		x.cong(y).hienThiPhanSo();

		System.out.print("Nhap n: ");
		int n = scan.nextInt();

		List<PhanSo> list = new ArrayList<>();

		PhanSo total = new PhanSo(0, 1);
		PhanSo max = new PhanSo(-1000, 1);

		for (int i = 0; i < n; i++) {
			PhanSo temp = new PhanSo();
			temp.nhapPhanSo(scan);
			list.add(temp);
			total = total.cong(temp);
			if (!max.lonHon(temp))
				max = temp;
		}
		scan.close();
		System.out.print("Tong n phan so: ");
		total.hienThiPhanSo();

		System.out.print("Max in n phan so: ");
		max.hienThiPhanSo();

		System.out.println("Danh sach phan so:");
		list.sort((p1, p2) -> {
			return !p1.lonHon(p2) ? -1 : 1;
		});
		for (PhanSo p : list) {
			p.hienThiPhanSo();
		}

	}
}
