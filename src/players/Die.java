package players;

/**
 *
 * @author bashar
 */
public class Die {
    
    public int getFaceValue(){
        return (int)(Math.random()*6+1);
    }
}
