class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Technical extends Book {
    String subject;

    Technical(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    void display() {
        System.out.println("Technical Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}

class Story extends Technical {
    String genre;

    Story(String title, String author, String subject, String genre) {
        super(title, author, subject);
        this.genre = genre;
    }

    @Override
    void display() {
        System.out.println("Story Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
        System.out.println("Genre: " + genre);
    }
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam");
        Book b2 = new Technical("Java Programming", "James Gosling", "Computer Science");
        Book b3 = new Story("The Alchemist", "Paulo Coelho", "Literature", "Adventure");

        b1.display();
        System.out.println();

        b2.display();
        System.out.println();

        b3.display();
    }
}
