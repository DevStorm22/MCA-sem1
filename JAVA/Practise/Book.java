import java.util.Scanner;
class Book
{
	private String title, author;
	private double price;
	Book(String title, String author, double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void displayDetails()
	{
		System.out.println("Book Details");
		System.out.println("Book Name: " + title);
		System.out.println("Book Author: " + author);
		System.out.println("Book Price: " + price);
	}
	double applyDiscount(float discount)
	{
		price -= (price * discount);
		System.out.println("Discount applied\n\nNow you book price is: " + price);
		return price;
	}
	public static void main(String[]  args)
	{
		Scanner sc = new Scanner(System.in);
		String title, author;
		double price;
		float discount;
		Book books[] = new Book[3];
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Enter Book Name:");
			title = sc.nextLine();
			System.out.print("Enter Auther Name: ");
			author = sc.nextLine();
			System.out.print("Enter Book Price: ");
			price = sc.nextDouble();
			books[i] = new Book(title, author, price);
			sc.nextLine();
		}
		for(int i = 0; i < 3; i++)
		{
			books[i].displayDetails();
		}
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Enter Book Discount(0 - 100): ");
			discount = sc.nextFloat();
			books[i].applyDiscount(discount);
		}
	}
}