import java.util.Scanner;

class Book
{
    String title;
    String author;
    double price;

    // Constructor
    Book(String t, String a, double p)
    {
        title = t;
        author = a;
        price = p;
    }

    // Method to display book information
    void display()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title of Book 1: ");
        String t1 = sc.nextLine();

        System.out.print("Enter author of Book 1: ");
        String a1 = sc.nextLine();

        System.out.print("Enter price of Book 1: ");
        double p1 = sc.nextDouble();
        sc.nextLine();

        Book b1 = new Book(t1, a1, p1);

        System.out.print("\nEnter title of Book 2: ");
        String t2 = sc.nextLine();

        System.out.print("Enter author of Book 2: ");
        String a2 = sc.nextLine();

        System.out.print("Enter price of Book 2: ");
        double p2 = sc.nextDouble();

        Book b2 = new Book(t2, a2, p2);

        System.out.println("\nBook 1 Details:");
        b1.display();

        System.out.println("\nBook 2 Details:");
        b2.display();
    }
}
