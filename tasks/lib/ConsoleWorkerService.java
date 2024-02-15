package lib;

import lib.exception.BookAlreadyExistsException;
import lib.exception.CantAddBookException;
import lib.exception.InvalidBookYearException;

import java.util.Scanner;

public class ConsoleWorkerService {

    private static final Scanner scanner = new Scanner(System.in);
    private static Catalog catalog = new Catalog();


    public void start() {

        while (true) {

            System.out.println("Choose available options: [ 1 | 2 | 3 | 4 | 5 | 6 ]");
            System.out.println("1. Add new book");
            System.out.println("2. Delete new book");
            System.out.println("3. Get all books");
            System.out.println("4. Get book by book name");
            System.out.println("5. Get books by author name");
            System.out.println("6. Exit");

            System.out.println();
            System.out.print("Type option here: ");
            String userOption = scanner.nextLine();

            switch (userOption) {
                case "1":
                    addBook();
                    break;
                case "2":
                    break;
                case "3":
                    System.out.println(getAllBooks());
                    System.out.println();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    stop();
                    break;
                default:
                    System.out.println("Incorrect option!");
                    System.out.println();
            }

        }

    }

    public static void stop() {
        System.out.println("Goodbye...");
        System.exit(0);
    }

    public static String getAllBooks() {
        StringBuilder stringBuilder = new StringBuilder();

        int count = 1;
        if (catalog.getBooks().length > 0) {
            for (Book b : catalog.getBooks()) {
                stringBuilder.append(count).append(". ").append(b.toString()).append("\n");
            }
        } else stringBuilder.append("Ooops. Book list is empty");

        return stringBuilder.toString();
    }

    public static void addBook() {

        System.out.println();
        System.out.println("|---------------------------|");
        System.out.println("|You chose 'add book option'|");
        System.out.println("|---------------------------|");
        System.out.println();

        try {
            System.out.print("Type book name: ");
            String bookName = scanner.nextLine();

            System.out.print("Type book's author: ");
            String bookAuthor = scanner.nextLine();

            System.out.print("Type book's year: ");
            String year = scanner.nextLine();

            Book book = new Book(bookName, bookAuthor, Integer.parseInt(year));
            catalog.addNewBook(book);
            System.out.println("Book successfully added");
            System.out.println();
        } catch (
                InvalidBookYearException |
                CantAddBookException |
                BookAlreadyExistsException |
                NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }

}
