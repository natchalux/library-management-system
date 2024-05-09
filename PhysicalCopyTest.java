

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PhysicalCopyTest.
 *
 * @author  (Natchalux)
 * @version (1.0)
 */
public class PhysicalCopyTest
{
    /**
     * Default constructor for test class PhysicalCopyTest
     */
    public PhysicalCopyTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void getISBN()
    {
        PhysicalCopy physical1 = new PhysicalCopy("12345", "title");
        assertEquals("12345", physical1.getIsbn());
    }

    @Test
    public void gotBorrow()
    {
        PhysicalCopy physical1 = new PhysicalCopy("12345", "title");
        Librarymember librarym1 = new Librarymember("12345", "title");
        librarym1.borrow(physical1);
    }

    @Test
    public void checkAvailableAfterBorrow()
    {
        PhysicalCopy physical1 = new PhysicalCopy("12345", "title");
        Librarymember librarym1 = new Librarymember("12345", "title");
        librarym1.borrow(physical1);
        assertEquals(0, physical1.getAvailable());
    }

    @Test
    public void isBookAvailable()
    {
        PhysicalCopy physical1 = new PhysicalCopy("12345", "DVD");
        Librarymember librarym1 = new Librarymember("12345", "title");
        physical1.setLibraryMember(librarym1);
        assertEquals(false, physical1.isBookAvailable());
    }

    @Test
    public void TestDetailAuthorNull()
    {
        PhysicalCopy physical1 = new PhysicalCopy("12345", "title");
        Librarymember librarym1 = new Librarymember("12345", "title");
        Author author1 = new Author("title", "last", "london");
        physical1.setLibraryMember(librarym1);
        physical1.printPhysicalDetails();
    }

    @Test
    public void TestPrintMemberNull()
    {
        PhysicalCopy physical1 = new PhysicalCopy("12345", "DVD");
        Author author1 = new Author("title", "last", "london");
        physical1.setAuthor(author1);
        physical1.printPhysicalDetails();
    }

    @Test
    public void TestPrint()
    {
        PhysicalCopy physical1 = new PhysicalCopy("12345", "title");
        Librarymember librarym1 = new Librarymember("12345", "title");
        Author author1 = new Author("title", "last", "london");
        physical1.setAuthor(author1);
        physical1.setLibraryMember(librarym1);
        physical1.printPhysicalDetails();
    }
}







