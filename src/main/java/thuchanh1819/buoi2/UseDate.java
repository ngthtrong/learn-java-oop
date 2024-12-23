package thuchanh1819.buoi2;

public class UseDate {
	public static void main(String[] args) {
		Date date1 = new Date();
		date1.nhapNgay();
		date1.hienThi();
		
		Date date2 = new Date(29,2,1600);
		date2.hienThi();

		date1.nextDate();
		date1.hienThi();
		
		date2.nextDate();
		date2.hienThi();
		
		date1.congNgay(10000);
		date1.hienThi();
		
		date2.congNgay(29);
		date2.hienThi();
		
		
	}
}
