package example4;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagementSystem {
    private static ArrayList<Book> bookList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void addBook() {
        System.out.println("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.println("Enter Author Name: ");
        String author = sc.nextLine();

        bookList.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    private static void viewBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("\nList of Books:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    private static void searchBook() {
        System.out.print("Enter Book ID to search: ");
        int id = sc.nextInt();
        for (Book book : bookList) {
            if (book.id == id) {
                System.out.println("Book Found: " + book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    private static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int id = sc.nextInt();
        for (Book book : bookList) {
            if (book.id == id) {
                bookList.remove(book);
                System.out.println("Book deleted successfully!");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}


