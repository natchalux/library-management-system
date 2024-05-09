import java.util.ArrayList;
/**
 * this class represent the physical book that contain ISBN, author information 
 * a damage and availability
 *
 * @author (Natchalux)
 * @version (1.0)
 */
public class PhysicalCopy extends LibraryCollections
{
    // instance variables - replace the example below with your own
    private String Isbn;
    private int available;
    private Author author;
    private Librarymember libraryMember;
    private ArrayList<String> damagedbook;
    /**
     * Constructor for objects of class physical
     */
    public PhysicalCopy(String bookIsbn, String Title)
    {
        super(Title);
        Isbn = bookIsbn;
        available = 1;
        this.libraryMember = libraryMember;
        this.author = author;
        this.damagedbook = new ArrayList<>();
    }
    /**
     * get the number of damage
     */
    public int getDamageNo()
    {
        return damagedbook.size();
    }
    /**
     * get the availability of the book
     */
    public int getAvailable()
    {
        return available; 
    }
    /**
     * get the ISBN 
     */
    public String getIsbn()
    {
        return Isbn;
    }
    /**
     * get the author 
     */
    public Author getAuthor()
    {
        return author;
    }
    /**
     * add string type of damage 
     */
    public void setDamage(String newDamage)
    {
        damagedbook.add(newDamage);
    }
    /**
     * add morebook by increasing the number of availability
     */
    public void setAvailable(int addMoreBook)
    {
        available = addMoreBook;
    }
    /**
     * set new ISBN 
     */
    public void setIsbn(String newIsbn)
    {
        Isbn = newIsbn;
    }
    /**
     * set new author
     */
    public void setAuthor(Author author)
    {
        this.author = author;
    }
    /**
     * add a librarymember
     */
    public void setLibraryMember(Librarymember libraryMember)
    {
        this.libraryMember = libraryMember;
    }
    /**
     * check the availability of the book when the librarymember is absence
     */
    public boolean isBookAvailable()
    {
        if(libraryMember == null){
            return true;
        }else
        {
            return false;
        }
    }
    /**
     * reduce the number of availability when someone borrow the book 
     */
    public void gotBorrowed(){
        available--;
    }
    /**
     * add string damage to the book
     */
    public void addDamagedBook(String damage)
    {
        damagedbook.add(damage);
    }
    /**
     * print all details of the book
     */
    public void printPhysicalDetails()
    {   
        if(libraryMember == null){
          System.out.println("there is no library member");  
        }
        else if(author == null){
            System.out.println("there is no author for this book");
        }
        else{
        System.out.println("#######################");
        System.out.println("Title: " + getTitle());
        System.out.println("ISBN" + Isbn);
        System.out.println("Author: " + "" + author.getAuthorFirst() + "" + author.getAuthorLast());
        System.out.println("MemberID: " + libraryMember.getMemberId());
        System.out.println("#######################" );
        }
    }
    /**
     * access print details in the author class
     * utilizing this method in library class
     */
    public void printAuthor()
    {
        author.printDetails();
    }
    
}

