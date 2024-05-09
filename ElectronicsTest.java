

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ElectronicsTest.
 *
 * @author  (Natchalux)
 * @version (1.0)
 */
public class ElectronicsTest
{
    /**
     * Default constructor for test class ElectronicsTest
     */
    public ElectronicsTest()
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
    public void getDownload()
    {
        Electronics electron2 = new Electronics("DVD", true);
        assertEquals(true, electron2.getDownload());
    }
}

