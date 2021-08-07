package squares;

import monopoly.Board;
import players.Player;

/**
 *
 * @author bashar
 */
public class JailSquare extends square{
 boolean jailed ;
    int playerTurnCounter=0;
    
    
    public JailSquare(String name) {
        super(name);
        this.jailed=false;
       
    }
   
   
    @Override
    public void doAction(Player player, Board board) {
        System.out.print("You landed on "+name+"  ");
        
    }
   public void getOutOfjail(Player player){
       player.SetJailed(false);
   }
    
    
    
}
