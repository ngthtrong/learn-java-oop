package thuchanh1819.buoi1;

import java.util.Scanner;

public class bai6 {

	static void printBinary(int a) {

		if (a == 0)
			return;
		printBinary(a / 2);
		System.out.print(a % 2 + " ");
	}

	public static void main(String[] args) {
		// ----------input a---------//
		int a = 0;
		boolean check = false;
		Scanner scan = new Scanner(System.in);
		while (!check) {
			System.out.print("Enter number a:  ");
			if (scan.hasNextInt()) {
				a = scan.nextInt();
				check = true;
				scan.close();
			} else {
				System.out.println("a incorrect format of integer, please enter a again!");
				scan.next();
			}
		}
		// ----------check prime number---------//
		check = true;
		if (a < 2)
			check = false;
		for (int i = 2; i <= Math.sqrt(a) && check; i++) {
			if (a % i == 0)
				check = false;
		}
		if (check)
			System.out.println(a + " is an prime nubmer");
		else
			System.out.println(a + " is not an prime nubmer");
		// ----------print binary of a---------//
		if (a == 0)
			System.out.println(0);
		else
			printBinary(a);
	}
}
