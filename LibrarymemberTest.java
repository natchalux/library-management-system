

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibrarymemberTest.
 *
 * @author  (Natchalux)
 * @version (1.0)
 */
public class LibrarymemberTest
{
    /**
     * Default constructor for test class LibrarymemberTest
     */
    public LibrarymemberTest()
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
    public void borrowBook()
    {
        PhysicalCopy physical1 = new PhysicalCopy("12345", "title");
        Librarymember librarym1 = new Librarymember("12345", "title");
        librarym1.borrow(physical1);
        librarym1.borrow(physical1);
    }

    @Test
    public void bookBorrowed()
    {
        Librarymember librarym1 = new Librarymember("12345", "title");
        PhysicalCopy physical1 = new PhysicalCopy("12345", "title");
        librarym1.borrow(physical1);
        assertEquals(1, librarym1.numberOfBorrowed());
    }
}


