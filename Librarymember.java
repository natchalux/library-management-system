import java.util.ArrayList;
/**
 * This class represent the library member that have access to the facility
 *
 * @author (Natchalux)
 * @version (1.0)
 */
public class Librarymember
{
    // instance variables - replace the example below with your own
    private String name;
    private String memberId;
    private int numberBooks;
    private ArrayList<PhysicalCopy> borrowedbook;

    /**
     * Constructor for objects of class Lirarymember
     */
    public Librarymember(String memberCode, String memberName)
    {
        borrowedbook = new ArrayList<>();
        memberId = memberCode;
        name = memberName;
    }
    /**
     * method for getting a memberId
     */
    public String getMemberId()
    {
        return memberId;
    }
    /**
     * method for getting a member name
     */
    public String getMemberName()
    {
        return name;
    }
    /**
     * set new member ID
     */
    public void setMemberId(String newMemberId)
    {
        memberId = newMemberId;
    }
    /**
     * set new member name
     */
    public void setMemberName(String newMemberName)
    {
        name = newMemberName;
    }
    /**
     * method for borrow a physical book
     */
    public void borrow(PhysicalCopy book)
    {
        if(borrowedbook.contains(book))
        {
            System.out.println("This member already bought this book");
        }
        else
        {
            borrowedbook.add(book);
            book.gotBorrowed();
        }
    }
    /**
     * check the number of book that have been borrowed
     */
    public int numberOfBorrowed()
    {
        return borrowedbook.size();
    }
    /**
     * Print detail of the member 
     */
    public void printMemberDetail()
    {
        System.out.println("###############");
        System.out.println("MemerName: " + name);
        System.out.println("MemberID: " + memberId );
        System.out.println("Details of the book that this member borrow: ");
        for(PhysicalCopy book: borrowedbook){
            book.printDetail();
        }
    }
}
