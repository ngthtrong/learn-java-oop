package thuchanh1819.buoi2;

public class UseDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		A.hienThi();
		Diem B = new Diem();
		B.nhapDiem();
		B.hienThi();
		Diem C = new Diem(-B.giaTriX(),-B.giaTriY());
		C.hienThi();
		System.out.println(B.khoangCach());
		System.out.println(B.khoangCach(A));
	}
}