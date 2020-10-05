
/**
 * Write a description of class Video here.
 *
 */
public class Video extends Item
{
    private String director;

    public Video(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);
        director = theDirector;
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
        System.out.println("Video");
        super.print();
        System.out.println("Director: " + director);
    }
}
