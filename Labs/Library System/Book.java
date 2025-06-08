public class Book
{
    // title and price of book alongside an Author object
    // Car.java helped me construct this :)
    private String title;
    private double price;
    private Author author;
    
    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }
    // getter method to return title of book
    public String getTitle() {
        return title;
    }
    //getter method to return price of book
    public double getPrice() {
        return price;
    }
    //getter method to return the Author object associated with the book
    public Author getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return "Book: " + title + ", Price: $" + price + '\n' +
        author.toString();
    }
}
    