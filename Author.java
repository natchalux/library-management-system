
/**
 * This class represent a author of a book
 *
 * @author (Natchalux)
 * @version (1.0)
 */
public class Author
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String address;
    /**+ 
     * Constructor for objects of class Author
     */
    public Author(String authorFirst, String authorLast, String authorAddress)
    {
        firstName = authorFirst;
        lastName = authorLast;
        address = authorAddress;
    }
    /**
     * get the first name of the author
     */
    public String getAuthorFirst() 
    {
        return firstName;
    }
    /**
     * get the last name of the author
     */
    public String getAuthorLast()
    {
        return lastName;
    }
    /**
     * get the address of the author
     */
    public String getAddress()
    {
        return address; 
    }
    /**
     * set new first name of the author
     */
    public void setAuthorFirst(String newFirstName)
    {
        firstName = newFirstName;
    }
    /**
     * set new last name of the author
     */
    public void setAuthorLast(String newLastName)
    {
        lastName = newLastName;
    }
    /**
     * set new author address
     */
    public void setAuthorAddress(String newAddress)
    {
        address = newAddress;
    }
    /**
     * print details of the author
     */
    public void printDetails() 
    {
        System.out.println("Author: " + firstName + "" +
        lastName + "" + "Address: " + address);
    }
}
