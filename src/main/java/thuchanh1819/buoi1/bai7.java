package thuchanh1819.buoi1;

import java.util.Scanner;

public class bai7 {
	static String getFirstName(String fullName) {

		String[] name = fullName.split(" ");
		return name[name.length-1];
//		return fullName.substring(fullName.lastIndexOf(" ")+1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your full name: ");
		String fullName = scan.nextLine();
		scan.close();
		System.out.println(getFirstName(fullName));
	}
}
