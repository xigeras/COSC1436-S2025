public class Main {
    public static void main(String[] args)
    {
        // Author object with name, email and nationality
        Author author = new Author("J.K. Rowling", "jk.rowling@example.com", "British");
        // Book object with title, price, and the Author object
        Book book = new Book("Harry Potter and the Sorcerer's Stone", 19.99, author);

        // prints out book info
        System.out.println(book.toString());

        // project done! i used Runner.java from notes to help me work through this

    }
}