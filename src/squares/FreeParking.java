package squares;


import monopoly.Board;
import players.Player;

/**
 *
 * @author bashar
 */
public class FreeParking extends square{

    public FreeParking(String name) {
        super(name);
    }

    @Override
    public void doAction(Player player, Board board) {
        System.out.println("FREE Parking");
    }
    
}
