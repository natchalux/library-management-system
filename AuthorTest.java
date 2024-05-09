

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AuthorTest.
 *
* @author  (Natchalux)
 * @version (1.0)
 */
public class AuthorTest
{
    /**
     * Default constructor for test class AuthorTest
     */
    public AuthorTest()
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
    public void getFirstName()
    {
        Author author1 = new Author("firstname", "lastname", "london");
        author1.setAuthorFirst("natchalux");
        assertEquals("natchalux", author1.getAuthorFirst());
    }

    @Test
    public void getLastName()
    {
        Author author1 = new Author("firstname", "lastname", "london");
        author1.setAuthorLast("wu");
        assertEquals("wu", author1.getAuthorLast());
    }

    @Test
    public void getLocation()
    {
        Author author1 = new Author("firstname", "lastname", "london");
        author1.setAuthorAddress("US");
        assertEquals("US", author1.getAddress());
    }

    @Test
    public void testPrintDetails()
    {
        Author author1 = new Author("firstname", "lastname", "london");
        author1.printDetails();
    }
}




