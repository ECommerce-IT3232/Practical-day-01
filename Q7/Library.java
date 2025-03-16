public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        } else {
            System.out.println("Library is full!");
        }
    }

    public void displayBooks() {
        System.out.println("\nLibrary Collection:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayDetails();
        }
    }
}