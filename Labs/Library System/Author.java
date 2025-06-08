public class Author
{
    // private attributes for name, email, and nationality of the author. 
    // I went through my notes and Person.java helped me the most.

    private String name;
    private String email;
    private String nationality;
    
    public Author(String name, String email, String nationality) {
        this.name = name;
        this.email = email;
        this.nationality = nationality;
    }
    // getter method to return name of author
    public String getName() {
        return name;
    }
    // getter method to return email
    public String getEmail() {
        return email;
    }
    // getter method to return nationality
    public String getNationality() { 
        return nationality; 
    }
    // overrided the toString() method to display author info 
    @Override
    public String toString() {
        return 
        "Author: " + name + ", Email: " + email + ", Nationality: " + nationality;

    }
}