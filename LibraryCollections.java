
/**
 * a parent class that store general library resources such as electronics and physical books
 *
 * @author (Natchalux)
 * @version (1.0)
 */
public class LibraryCollections
{
    // instance variables - replace the example below with your own
    
    private String title;
    private Author author;
    private int available;
    private int borrowed;
    private Librarymember libraryMember;
    /**
     * Constructor for objects of class libraryCollections
     */
    public LibraryCollections(String Title)
    {
        // initialise instance variables
      this.title = Title;
      author = null;
      libraryMember = null;
    
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public String getTitle()
    {
        return title;
    }
    public int getAvailable()
    {
        return available; 
    } 
    public Author getAuthor()
    {
        return author;
    }
    public Librarymember getMember()
    {
        return libraryMember;
    }
    public void printDetail()
    { 
    
    }
    
}
