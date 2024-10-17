import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        Book book1 = new Book(1, "To Kill a Mockingbird", 20, "Fiction, Historical Fiction", LocalDate.of(1960, 7, 11));
        Book book2 = new Book(2, "'1984'", 15, "Dystopian, Science Fiction", LocalDate.of(1920, 6, 8));
        Book book3 = new Book(3, "The Great Gatsby", 10, " Fiction, Tragedy", LocalDate.of(1925, 4, 10));
        Book book4 = new Book(4, "Harry Potter and the Sorcerer’s Stone", 25, "Fantasy, Young Adult", LocalDate.of(1997, 7, 26));
        Book book5 = new Book(5, "The Catcher in the Rye", 20, "Fiction, Coming-of-Age", LocalDate.of(1951, 6, 16));
        Book book6 = new Book(6, "The Lord of the Rings: The Fellowship of the Ring", 32, "Fantasy, Adventure", LocalDate.of(1954, 7, 29));
        Book book7 = new Book(7, "Pride and Prejudice", 90, "Romance, Classic Fiction", LocalDate.of(1813, 1, 28));
        Book book8 = new Book(8, "The Hobbit", 24, "Fantasy, Adventure", LocalDate.of(1937, 9, 21));
        Book book9 = new Book(9, "The Da Vinci Code", 50, "Thriller, Mystery", LocalDate.of(2003, 3, 18));
        Book book10 = new Book(10, "The Hunger Games", 40, "Dystopian, Young Adult", LocalDate.of(2008, 9, 14));
        Book book11 = new Book(11, "The Alchemist", 20, "Adventure, Fantasy, Philosophical Fiction", LocalDate.of(1988, 4, 15));
        Book book12 = new Book(12, "The Kite Runner", 32, "Fiction, Historical Fiction", LocalDate.of(2003, 5, 29));
        Book book13 = new Book(13, "Brave New World", 30, "Dystopian, Science Fiction", LocalDate.of(1932, 2, 1));
        Book book14 = new Book(14, "Gone Girl", 25, " Thriller, Mystery", LocalDate.of(2012, 6, 5));
        Book book15 = new Book(15, "Sapiens: A Brief History of Humankind", 22, "Non-Fiction, History", LocalDate.of(2011, 9, 4));

        Book[] books1 = {book1, book2, book3, book4, book5};
        Book[] books2 = {book6, book7, book8, book9, book10};
        Book[] books3 = {book11, book12, book13, book14, book15};
        Book[] booksAll = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12, book13, book14, book15};

        Library library1 = new Library(1, "First Library", "Bishkek", books1);
        Library library2 = new Library(2, "Second Library", "Osh", books2);
        Library library3 = new Library(3, "Third Library", "Yssyk-Kol", books3);
        Library[] libraries = {library1, library2, library3};

        Book.print(booksAll);

        System.out.println("We have 3 libraries, chose which one to look. Press one of 1-3");

        int input = scanner1.nextInt();
        while (input<1 || input>3){
            System.out.println("We dont have such library. Give from range 1-3.");
            input=scanner1.nextInt();
        }
        System.out.println("In Library ID " + Library.content(libraries, input).id + ". Name: " + Library.content(libraries, input).name + " there is books called: \n");
        Library.printContent(Library.content(libraries, input));

    }
}
