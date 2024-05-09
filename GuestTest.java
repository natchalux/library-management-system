

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GuestTest.
 *
 * @author  (Natchalux)
 * @version (1.0)
 */
public class GuestTest
{
    /**
     * Default constructor for test class GuestTest
     */
    public GuestTest()
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
    public void getDuration()
    {
        Guest guest1 = new Guest(3);
        Guest guest2 = new Guest(1);
        guest2.setDuration(3);
        assertEquals(3, guest2.getDuration());
    }
}

