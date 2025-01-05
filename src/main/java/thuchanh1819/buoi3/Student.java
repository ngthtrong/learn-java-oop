package thuchanh1819.buoi3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {
	private static final AtomicInteger count = new AtomicInteger(0);
	private final String id;
	private String name;
	private LocalDate dateOfBirth;
	private int amoutCredit;
	private String[] nameCreadit;
	private String[] scoreCreadit;

	private float getScoreValue(String score) {
		switch (score) {
		case "A":
			return 4;
		case "B+":
			return 3.5f;
		case "B":
			return 3;
		case "C+":
			return 2.5f;
		case "C":
			return 2;
		case "D+":
			return 1.5f;
		case "D":
			return 1;
		case "F":
			return 0;
		default:
			return 0;
		}
	}

	public Student() {
		super();
		this.id = "B230" + String.valueOf(count.incrementAndGet());
	}

	public Student(String name, LocalDate dateOfBirth, int amoutCredit, String[] nameCreadit, String[] scoreCreadit) {
		super();
		this.name = name;
		this.id = "B230" + String.valueOf(count.incrementAndGet());
		this.dateOfBirth = dateOfBirth;
		this.amoutCredit = amoutCredit;
		this.nameCreadit = nameCreadit;
		this.scoreCreadit = scoreCreadit;
	}

	public void inputBasicInfo(Scanner scan) {
		System.out.println("===============================");
		System.out.print("Input name of student: ");
		this.name = scan.nextLine();
		System.out.print("Input date of birth(dd-mm-yyyy): ");
		String dataString = scan.next();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		this.dateOfBirth = LocalDate.parse(dataString, dateFormatter);
		System.out.println("===============================");
	}

	public void inputScore(Scanner scan) {
		System.out.println("===============================");
		System.out.print("Input amount credit: ");
		this.amoutCredit = scan.nextInt();
		this.nameCreadit = new String[this.amoutCredit];
		this.scoreCreadit = new String[this.amoutCredit];

		for (int i = 0; i < this.amoutCredit; i++) {
			System.out.print("Input name of credit: ");
			this.nameCreadit[i] = scan.next();
			System.out.print("Input score of credit: ");
			this.scoreCreadit[i] = scan.next();
		}
	}

	@Override
	public String toString() {
		float totalScore = 0;
		for (int i = 0; i < this.amoutCredit; i++) {
			totalScore += getScoreValue(this.scoreCreadit[i]);
		}
		return "Student [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", amoutCredit=" + amoutCredit
				+ ", nameCreadit=" + nameCreadit + ", scoreCreadit=" + scoreCreadit + ", GPA="
				+ totalScore / this.amoutCredit + "]";
	}

	public float getAverageScore() {
		float rs = 0;
		for (String string : scoreCreadit) {
			rs = this.getScoreValue(string);
		}
		return rs / this.amoutCredit;
	}

}
