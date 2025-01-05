package thuchanh1819.buoi3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BrickTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = scan.nextInt();
		List<Brick> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			Brick temp = new Brick();
			temp.inputData(scan);
			list.add(temp);
		System.out.println("-------");

		}
		Brick min = list.get(0);
		System.out.println("====================================");

		System.out.println("List of bricks:");
		for (Brick brick : list) {
			brick.printInfo();
			System.out.println("retail price:" + brick.getRetailPrice());
			if (min.getPrice() / min.getArea() > brick.getPrice() / brick.getArea()) {
				min = brick;
			}
		}
		System.out.println("====================================");
		System.out.println("Min price in list:");
		min.printInfo();
		System.out.println("====================================");

		System.out.println("5 x 20:");
		for (Brick brick : list) {
			long price = (long) brick.getNumberBoxByArea(5, 20) * brick.getPrice();
			System.out.println(brick.getId() + " " + brick.getColor() + ": " + price +" (" + brick.getNumberBoxByArea(5, 20) + " box)");
		}

		scan.close();
	}
}
