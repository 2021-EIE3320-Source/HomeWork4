
/**
 * Write a description of class VideoGame here.
 *
 */
public class VideoGame extends Item
{
    private String platform;
    private int numberOfPlayers;

    public VideoGame(String theTitle, String thePlatform, int Players, int time)
    {
        super(theTitle, time);
        platform = thePlatform;
        numberOfPlayers = Players;
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
        System.out.println("VideoGame");
        super.print();
        System.out.println("Platform: " + platform);
        System.out.println("No. of players:" + numberOfPlayers);
    }
}
