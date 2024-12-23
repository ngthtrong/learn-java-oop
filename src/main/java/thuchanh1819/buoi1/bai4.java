package thuchanh1819.buoi1;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isPass = false;
		int a = 0;
		int b = 0;
		while (!isPass) {
			System.out.print("enter integer a: ");
			if (scan.hasNextInt()) {
				a = scan.nextInt();
				isPass = true;
			} else {
				System.out.println("a  incorrect format integer, please enter a again!");
				scan.next();
			}
		}
		isPass = false;
		while (!isPass) {
			System.out.print("enter integer b: ");
			if (scan.hasNextInt()) {
				b = scan.nextInt();
				isPass = true;
			} else {
				System.out.println("b incorrect format integer, please enter b again!");
				scan.next();
			}
		}
		System.out.println("a + b = " + (a+b));
		scan.close();
	}
}
