package squares;
import players.Player;
import monopoly.Board;
/**
 *
 * @author bashar
 */
public abstract class square {
    
    String name ; 
    public square (String name ){
        this.name = name ; 
        
    }
    public String getname(){
        return name;
    }
    
    public abstract void doAction(Player player,Board board);
        
    
    
    
    
    
}
