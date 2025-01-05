package thuchanh1819.buoi3;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Brick {
	private static final AtomicInteger count = new AtomicInteger(0);
	private final int id;
	private String color;
	private int quantity;
	private int width;
	private int height;
	private long price;

	public int getId() {
		return this.id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Brick() {
		super();
		this.id = count.incrementAndGet();
	}

	public Brick(int id, String color, int quantity, int width, int height, long price) {
		super();
		this.id = count.incrementAndGet();
		this.color = color;
		this.quantity = quantity;
		this.width = width;
		this.height = height;
		this.price = price;
	}

	public void inputData(Scanner scan) {
		System.out.print("Enter color: ");
		this.setColor(scan.next());
		while (this.getColor().isEmpty()) {
			System.out.println("Please enter color!");
			System.out.println("Enter color: ");
			this.setColor(scan.next());
		}

		System.out.print("Enter quantity: ");
		// int temp = scan.nextInt();
		this.setQuantity(scan.nextInt());
		while (this.getQuantity() <= 0) {
			System.out.println("Please enter quantity bigger than zero");
			System.out.print("Enter quantity: ");
			this.setQuantity(scan.nextInt());
		}

		System.out.print("Enter width: ");
		this.setWidth(scan.nextInt());
		while (this.getWidth() <= 0) {
			System.out.println("Please enter width bigger than zero");
			System.out.print("Enter width: ");
			this.setWidth(scan.nextInt());
		}

		System.out.print("Enter height: ");
		this.setHeight(scan.nextInt());
		while (this.getHeight() <= 0) {
			System.out.println("Please enter height bigger than zero");
			System.out.print("Enter height: ");
			this.setHeight(scan.nextInt());
		}

		System.out.print("Enter price: ");
		this.setPrice(scan.nextLong());
		while (this.getPrice() <= 0) {
			System.out.println("Please enter price bigger than zero");
			System.out.print("Enter price: ");
			this.setPrice(scan.nextLong());
		}
	}

	public void printInfo() {
		System.out.println("ID: " + this.id);
		System.out.println("Color: " + this.color);
		System.out.println("Quantity: " + this.quantity);
		System.out.println("Width: " + this.width);
		System.out.println("Height: " + this.height);
		System.out.println("Price: " + this.price);
	}

	public float getRetailPrice() {
		return (float) this.getPrice() / this.getQuantity() * 1.2f;
	}

	public float getArea() {
		return (float) this.getWidth() * this.getHeight() * this.getQuantity();
	}

	public int getNumberBoxByArea(int w, int h) {
		float area = w * h;
		float areaOfBox = this.getArea();
		return (int) Math.ceil(area / areaOfBox);
	}

}
