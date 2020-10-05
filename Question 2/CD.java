
/**
 * Write a description of class CD here.
 *
 * @author Cheung Tin Ho Benjamin 19073365d
 */
public class CD extends Item
{
    private String artist;
    private int numberOfTracks;
    
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }
    
    public void setComment(String comment)
    {
        super.setComment(comment);
    }

    public String getComment()
    {
        return super.getComment();
    }

    public void setOwn(boolean ownIt)
    {
        super.setOwn(ownIt);
    }

    public boolean getOwn()
    {
        return super.getOwn();
    }

    public void print()
    {
        System.out.println("CD");
        super.print();
        System.out.println("Artist: " + artist);
        System.out.println("No. of tracks: " + numberOfTracks);
    }
}
