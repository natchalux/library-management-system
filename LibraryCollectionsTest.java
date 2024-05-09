

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryCollectionsTest.
 *
* @author  (Natchalux)
 * @version (1.0)
 */
public class LibraryCollectionsTest
{
    /**
     * Default constructor for test class LibraryCollectionsTest
     */
    public LibraryCollectionsTest()
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
    public void getTitle()
    {
        LibraryCollections libraryC1 = new LibraryCollections("title");
        assertEquals("title", libraryC1.getTitle());
    }

    @Test
    public void getAuthor()
    {
        LibraryCollections libraryC1 = new LibraryCollections("title");
        assertEquals(null, libraryC1.getAuthor());
    }

    @Test
    public void getMember()
    {
        LibraryCollections libraryC1 = new LibraryCollections("title");
        assertEquals(null, libraryC1.getMember());
    }
}



