
/**
 * Class representing electronic resources 
 *
 * @author (Natchalux)
 * @version (1.0)
 */
public class Electronics extends LibraryCollections
{
    // instance variables - replace the example below with your own
    private boolean downloadable;

    /**
     * Constructor for objects of class Electronics
     */
    public Electronics(String Title, boolean itemDownloadable)
    {   
        super(Title);
        downloadable = itemDownloadable;
    }
    public boolean getDownload()
    {
        return downloadable;   
    } 
    }

