package squares;

import java.util.Scanner;
import monopoly.Board;
import players.Player;

/**
 *
 * @author bashar
 */
public class GoToJail extends square {

    boolean freeFromeJail = false;

    public GoToJail(String name) {
        super(name);
    }
    Scanner in = new Scanner(System.in);

    @Override
    public void doAction(Player player, Board board) {
        System.out.print("You landed on " + name + "  ");

        if (player.isFreeJailCard()) {
            System.out.println("press 3 to use get out from jail card");
        }
        int choise = 0;
        boolean choosing = true;
        while (choosing) {
            try {
                System.out.println("Would you like to pay fine of 50 and go out,use get out for jail tecket or would you like to stay for three rounds");
                System.out.println("press 1 to pay $50 fine");
                System.out.println("press 2 to wait for 3 rounds ");
                choise = Integer.parseInt(in.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println(" wrong inpute");
                System.out.println("enter again ");
                
            }
            if (choise >= 1 && choise <= 3 && player.isFreeJailCard()) {
                choosing = false;
            } else if (choise >= 1 && choise <= 2) {
                choosing = false;

            }
        }

        switch (choise) {
            case 1:
                player.money.substractMoney(50);
                freeFromeJail = true;
                player.pice.goTO(20);
                break;

            case 2:
                player.pice.goTO(10);
                player.SetJailed(true);
                break;

            case 3:
                player.setFreeJailCard(false);
                player.pice.goTO(20, false);
                break;

        }

    }

}
