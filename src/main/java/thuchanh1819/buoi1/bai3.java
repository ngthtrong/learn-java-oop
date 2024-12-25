package thuchanh1819.buoi1;

import java.util.ArrayList;
import java.util.List;

public class bai3 {

	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		for (String arg : args) {
			try {
				double temp = Double.parseDouble(arg);
				list.add(temp);
			} catch (Exception e) {
				System.out.println(arg + " Not a number format");
			}
		}
		if (list.isEmpty()) {
			System.out.println("Not have number");
			return;
		}
		double max = list.get(0);
		double total = 0.0;
		for (Double double1 : list) {
			if (max < double1)
				max = double1;
			total += double1;
		}
		System.out.println("max:" + max);
		System.out.println("total: " + total);
	}
}
