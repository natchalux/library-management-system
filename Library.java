import java.util.ArrayList;
/**
 * This class is a represenation of a library which can simulate the 
 * general activity within the library such borrowing and returning book
 * @author (Natchalux)
 * @version (1.0)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private ArrayList<PhysicalCopy> collections;
    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
       collections = new ArrayList<>();
    }
    /**
     * get number of book that already in the library
     */
    public int getBookNumber()
    {
        return collections.size();
    }
    /**
     * adding the resource in the library
     */
    public void addCollection(PhysicalCopy resource)
    {
        if(collections.contains(resource))
        {
            System.out.println("This book object is already in your collection!");
        }
        else
        {   
            System.out.println("Book object added successfully to your collection");
            collections.add(resource);
        }
    }
    /**
     * check whether the library is empty 
     */
    public boolean checkResources()
    {
        if(collections.size() == 0){
            return false;
        }
        else
        {
            return true;
        } 
    }
    /**
     * edit the firstname of the author of the book
     */
    public void editAuthorFirstName(PhysicalCopy collectionAlter, String newFirstName) 
    {
        for(PhysicalCopy book : collections){
            if(collections.size() == 0){
                System.out.println("there is no resources in this list");
            }
              if(book.getAuthor() == null){
                System.out.print("No author for this book");
            }else{
                book.getAuthor().setAuthorFirst(newFirstName);
                System.out.println("Firstname is successfully change to: " + book.getAuthor().getAuthorFirst());
            }
                    }
    }
    /**
     * search the title of the book
     */
    public void searchTitle(String seachTitle)
    {
        boolean found = false;
        for(PhysicalCopy collection : collections ){
            if(collection.getTitle().equalsIgnoreCase(seachTitle)){
                collection.printDetail();
                found = true; 
            }
    }
    }
    /**
     * search the resources within the library by the surname of the author
     */
    public void searchBySurname(String searchSurname)
    {
        int found = 0;
        for(PhysicalCopy book : collections ){
            if(book.getAuthor() == null){
                System.out.print("No author for this book: ");
            }  
            else{
                book.getAuthor().getAuthorLast().equalsIgnoreCase(searchSurname);
                book.printAuthor();
                found++; 
            }
    }
        System.out.println("Author found: " + found);
    }  
    /**
     * remove all book from the library 
     */
    public void removeItem(PhysicalCopy item)
    {
       if(collections.contains(item)){
           collections.remove(item);
       }
       else
       {
           System.out.println("there is no resources in the catalogue");
       }
    }
    /**
     * remove items in the library by specific index
     */
    public void removeItemByIndex(int index){
        if(index >= 0 && index < collections.size()){
            collections.remove(index);
            System.out.println("item successfully remove from the list");
        }
        else
        {
            System.out.println("Wrong input, the index does not contain any catalogue");
        }
    
    }
    /**
     * method for borrow a book
     */
    public void lendBook(PhysicalCopy book, Librarymember member){
        if(collections.contains(book)){
            if(book.isBookAvailable() == true){
                member.borrow(book);
                System.out.println("This book is being lend by the member: " + member.getMemberName());
            }
            else{
                System.out.println("The book is not available: ");        
            }
    
        }
        else 
        {
            System.out.println("No book in the library");  
        }
    }
    /**
     * method for returning a book
     */
    public void returnBook(PhysicalCopy book, String addDamage, boolean bookDamage){
        bookDamage = false;
        if(collections.contains(book)){
            book.setLibraryMember(null);
            if(addDamage != ""){
                bookDamage = true;
                book.addDamagedBook(addDamage);
                System.out.println("The damge has been recorded"); 
            }
            System.out.println("you returned a book");
        }
        else
        {
           System.out.println("there is no book to be returned, you did not borrow any: ");
        }
    }
    /**
     * print all details of the book that has not been borrowed
     */
    public void printDetailsAllAvailableBook(){
        for(PhysicalCopy book : collections){
            if(book.getAvailable() == 0){
                System.out.print("This book is currently on loan");
            }
            else
            {
               book.printPhysicalDetails(); 
            }
        }
    }
    /**
     * print all details of the book in the library 
     */
    public void printDetailsAllBook(){
        for(PhysicalCopy book: collections){
            book.printPhysicalDetails();
        }
    }  
}