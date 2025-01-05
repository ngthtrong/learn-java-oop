package thuchanh1819.buoi3;

import java.util.Scanner;

import thuchanh1819.buoi2.Diem;

public class LineTest {
	public static void main(String[] args) {
		Diem a = new Diem(2, 5);
		Diem b = new Diem(20, 35);
		Line ab = new Line(a, b);
		Line cd = new Line();
		Scanner scan = new Scanner(System.in);
		cd.setData(scan);

		System.out.println("----------------");
		System.out.println("ab & cd:");
		ab.printData();
		System.out.println("Do dai ab: " + ab.calcDistance());
		cd.printData();

		System.out.println("----------------");
		System.out.println("ab after translate:");
		ab.translateLine(5, 3);
		ab.printData();
		System.out.println("Do dai ab: " + ab.calcDistance());

		System.out.println("----------------");
		System.out.println("Do dai cd: " + cd.calcDistance());
		System.out.println("Goc dai cd: " + cd.calcAngle());

		scan.close();
	}
}
