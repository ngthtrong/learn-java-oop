package thuchanh1819.buoi1;

public class bai5 {
	public static void solveLinearEquation(double a, double b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("The equation infinitely many solutions!");
				return;
			}
			System.out.println("The equation has no solution!");
			return;
		}
		double x = -b / a;
		System.out.println("x = " + x);

	}

	public static void solveQuadraticEquation(double a, double b, double c) {
		if (a == 0) {
			solveLinearEquation(b, c);
			return;
		}
		double delte = b * b - 4 * a * c;
		if (delte > 0) {
			double x1 = (-b + Math.sqrt(delte)) / (2 * a);
			double x2 = (-b - Math.sqrt(delte)) / (2 * a);
			System.out.println("The equantion has two distinct solutions");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
			return;
		}
		if (delte == 0) {
			double x = -b / (2 * a);
			System.out.println("The equantion has double root");
			System.out.println("x1 = x2 = " + x);
			return;
		}
		System.out.println("The equation has no solution!");
	}

	public static void main(String[] args) {
		System.out.println("Example: 2x + 4 = 0");
		solveLinearEquation(2, 4);

		System.out.println("Example: 1x^2 - 3x + 2 = 0");
		solveQuadraticEquation(1, -3, 2);

		System.out.println("Example: 1x^2 + 2x + 3 = 0 (delta < 0)");
		solveQuadraticEquation(1, 2, 3);
	}
}
