
/**
 * Class represent a special kind of library user which can access library for
 * the maximum of 3 days
 *
 * @author (Natchalux)
 * @version (1.0)
 */
public class Guest
{
    // instance variables - replace the example below with your own
    private int duration;
    private LibraryCollections libraryCollection;

    /**
     * Constructor for objects of class Guest
     */
    public Guest(int guestDurationDay) 
    {
        if(guestDurationDay > 3){
            System.out.println("Error");
            System.out.println("Guest can access the library for the maximum of 3 days");
            System.out.println("###########");
            return;
        }
        else
        {
            this.duration = guestDurationDay;    
        }
    }
    /**
     * get number of duration
     */
    public int getDuration()
    {
        return duration;
    }
    /**
     * set a new duration
     */
    public void setDuration(int newDuration) 
    {   
        if(newDuration > 3){
            System.out.println("Error");
            System.out.println("Guest can access the library for the maximum of 3 days");
            System.out.println("###########");
            return;
        }
        else
        {
            this.duration = newDuration;    
        }
    }
}
