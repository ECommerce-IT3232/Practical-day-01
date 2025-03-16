public class Seven{
    public static void main(String[] args) {

        Library library = new Library(5);

        library.addBook(new PrintedBook("Enid blyton", "Five on a Treasure Island", 1942, 180));
        library.addBook(new EBook("George Orwell", "1984", 1949, 1.5, "PDF"));
        library.addBook(new AudioBook("Michelle Obama", "Becoming", 2018, 19.5, "Michelle Obama"));

        library.displayBooks();
    }
}

/*
@Kasunchira ➜ /workspaces/Practical-day-01/Q7 (main) $ java Seven

Library Collection:
Printed Book: Enid blyton by Five on a Treasure Island, Year: 1942, Pages: 180
E-Book: George Orwell by 1984, Year: 1949, File Size: 1.5MB, Format: PDF
Audio Book: Michelle Obama by Becoming, Year: 2018, Duration: 19.5 hours, Narrated by: Michelle Obama
*/