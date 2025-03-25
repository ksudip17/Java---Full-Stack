import java.util.*;

class Book {
    int id;
    String name, author, publisher;
    int quantity; // Corrected field name from 'quality' to 'quantity'

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity; // Corrected the parameter assignment
    }
}

public class ListExample3 {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();

        // Corrected constructor calls (added missing 'quantity' parameter)
        Book b1 = new Book(101, "Science", "Sudip", "XYZ Publishers", 10);
        Book b2 = new Book(102, "Math", "Laxmi", "ABC Publishers", 15);
        Book b3 = new Book(103, "Nepali", "Ravi", "PQR Publishers", 12);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        // Corrected the print statement
        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author);
        }
    }
}
