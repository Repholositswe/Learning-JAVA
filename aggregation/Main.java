public class Main {
    public static void main(String[] args){

        // Aggregation = Represents a "has-a" relationship between onjects.
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently.

        Book book1 = new Book("Hlomu The Wife", 555);
        Book book2 = new Book("Sniper", 333);
        Book book3 = new Book("Love Yourz", 250);

        Book[] books = {book1, book2, book3};

        Library library = new Library("Phathudi Public Library", 2018, books);

        library.displayInfo();


    }
}
