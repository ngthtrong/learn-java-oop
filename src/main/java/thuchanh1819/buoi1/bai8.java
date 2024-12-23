package thuchanh1819.buoi1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
//		boolean isDone = false;
		while (true) {
			try {
				System.out.print("Enter number to list (enter 'e' for done): ");
				String temp = scan.next();
				if (temp.equals("e"))
					break;
				list.add(Integer.parseInt(temp));
			} catch (Exception e) {
				System.out.println("This not a number format, please enter number again or type 'e' for done!");
//				scan.next();
			}
		}
		System.out.print("Enter number x: ");
		int x = scan.nextInt();
		int counter = 0;
		if (list.contains(x)) {
			for (Integer integer : list)
				if (x == integer)
					counter++;
		}
		System.out.println("x repeat in list " + counter + " time(s).");

		list.sort((a, b) -> {
			return -1 * a.compareTo(b);
		});
		System.out.println(list);

		scan.close();
	}
}
