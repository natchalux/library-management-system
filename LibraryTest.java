

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryTest.
 *
 * @author  (Natchalux)
 * @version (1.0)
 */
public class LibraryTest
{
    /**
     * Default constructor for test class LibraryTest
     */
    public LibraryTest()
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
    public void getNumberOfBook()
    {
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        Library library1 = new Library();
        library1.addCollection(physical1);
        assertEquals(1, library1.getBookNumber());
    }

    @Test
    public void checkResource()
    {
        Library library1 = new Library();
        assertEquals(false, library1.checkResources());
    }

    @Test
    public void checkResourceContainsObject()
    {
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        Library library1 = new Library();
        library1.addCollection(physical1);
        assertEquals(true, library1.checkResources());
    }

    @Test
    public void EditAuthorFirstNoCollection()
    {
        Library library1 = new Library();
    }

    @Test
    public void editAuthorFirstNull()
    {
        Library library2 = new Library();
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        library2.addCollection(physical1);
        library2.editAuthorFirstName(physical1, "james");
    }

    @Test
    public void editAuthorFirst()
    {
        Author author1 = new Author("natchalux", "wu", "london");
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        Library library1 = new Library();
        physical1.setAuthor(author1);
        library1.addCollection(physical1);
        library1.editAuthorFirstName(physical1, "Ping");
    }

    @Test
    public void searchTitle()
    {
        Library library2 = new Library();
        PhysicalCopy physical2 = new PhysicalCopy("Wu", "title");
        Author author2 = new Author("london", "Wu", "london");
        physical2.setAuthor(author2);
        library2.addCollection(physical2);
        library2.searchTitle("title");
    }

    @Test
    public void searchSurnameAuthorNull()
    {
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        Library library1 = new Library();
        library1.addCollection(physical1);
        library1.searchBySurname("wu");
    }

    @Test
    public void searchSurnameAuthor()
    {
        Author author1 = new Author("Natchalux", "Wu", "london");
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        physical1.setAuthor(author1);
        Library library1 = new Library();
        library1.addCollection(physical1);
        library1.searchBySurname("wu");
    }

    @Test
    public void removeItem()
    {
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        Library library1 = new Library();
        library1.addCollection(physical1);
        library1.removeItem(physical1);
        assertEquals(library1.getBookNumber(),0);
    }

    @Test
    public void removeItemIndex()
    {
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        Library library1 = new Library();
        library1.addCollection(physical1);
        library1.removeItemByIndex(0);
    }

    @Test
    public void removeItemWrongIndex()
    {
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        Library library1 = new Library();
        library1.addCollection(physical1);
        library1.removeItemByIndex(10);
    }

    @Test
    public void memberBorrowBookNoResource()
    {
        Librarymember librarym1 = new Librarymember("1234567", "Natchalux");
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        Library library1 = new Library();
        library1.lendBook(physical1, librarym1);
    }

    @Test
    public void borrowBook()
    {
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        Librarymember librarym1 = new Librarymember("1234567", "Natchalux");
        Library library1 = new Library();
        library1.addCollection(physical1);
        library1.lendBook(physical1, librarym1);
    }

    @Test
    public void returnDamageBook()
    {
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        Library library1 = new Library();
        Librarymember librarym1 = new Librarymember("1234567", "James");
        library1.addCollection(physical1);
        librarym1.borrow(physical1);
        library1.returnBook(physical1, "Front cover", true);
    }

    @Test
    public void returnUnborrowBook()
    {
        Library library2 = new Library();
        PhysicalCopy physical2 = new PhysicalCopy("1234567", "title");
        library2.returnBook(physical2, "Front cover", false);
    }

    @Test
    public void printLoanedBook()
    {
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        Librarymember librarym1 = new Librarymember("1234567", "James");
        Library library1 = new Library();
        library1.addCollection(physical1);
        librarym1.borrow(physical1);
        library1.printDetailsAllAvailableBook();
    }

    @Test
    public void printDetailAllBook()
    {
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        PhysicalCopy physical2 = new PhysicalCopy("987654", "Natchalux");
        Library library1 = new Library();
        library1.addCollection(physical1);
        library1.addCollection(physical2);
        library1.printDetailsAllBook();
        library1.printDetailsAllBook();
    }

    @Test
    public void printAllDetailsNoAuthor()
    {
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        Librarymember librarym1 = new Librarymember("1234567", "Natchalux");
        physical1.setLibraryMember(librarym1);
        Library library1 = new Library();
        library1.addCollection(physical1);
        library1.printDetailsAllBook();
    }

    @Test
    public void printDetailsAllBook()
    {
        Author author1 = new Author("Natchalux", "Wu", "London");
        PhysicalCopy physical1 = new PhysicalCopy("1234567", "title");
        Librarymember librarym1 = new Librarymember("987654", "Natchalux");
        Library library1 = new Library();
        physical1.setLibraryMember(librarym1);
        physical1.setAuthor(author1);
        library1.addCollection(physical1);
        library1.printDetailsAllBook();
    }
}





















