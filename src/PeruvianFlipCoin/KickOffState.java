package pfc;
/**
 * Write a description of class ReadyToPlayState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KickOffState extends GameState 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ReadyToPlayState
     */
    public KickOffState()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public String toString()
    {
        return "KickOffState";
    }
    
}