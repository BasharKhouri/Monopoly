package squares;

import java.util.Scanner;
import monopoly.Board;
import players.Player;

/**
 *
 * @author bashar
 */
public class UtilitieSquare extends square {

    int price = 150;
    Player owner = null;

    public UtilitieSquare(String name) {
        super(name);
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    @Override
    public void doAction(Player player, Board board) {
        int fee1 =player.getCurrentRoll() * 4;
        int fee2 = player.getCurrentRoll() * 10;
        System.out.print("You landed on " + name + "  ");
        if (owner == null) {
            System.out.println(name + " price is " + price);
            System.out.println("Would you like to buy it? [ Y / N ] ");
            Scanner in = new Scanner(System.in);
            String answer = in.next();
            if ("y".equals(answer.toLowerCase())) {

                if (player.money.getMoney() >= price) {
                    this.owner = player;
                    owner.addUtilitie();
                    owner.money.substractMoney(price);
                } else {
                    System.out.println("Not enogh to buy.");
                }
            }
        } else if (!(owner == player)) {
            if (!(owner.pice.getCurrentPossition() == 20)) {
                if (owner.getUtilitie() == 1) {
                    System.out.println("fee= " + fee1);
                    System.out.print("player nouber " + player.getNumber() + "you had $" + player.money.getMoney());
                    player.money.substractMoney(fee1);
                    System.out.println("player nouber " + player.getNumber() + " now you have $" + player.money.getMoney());
                    System.out.print("player nouber " + owner.getNumber() + "you had $" + player.money.getMoney());
                    owner.money.addMoney(fee1);
                    System.out.println("player nouber " + owner.getNumber() + " now you have $" + player.money.getMoney());

                } else if (owner.getUtilitie() == 2) {
                    System.out.println("fee= " + fee2);
                    System.out.print("player nouber " + player.getNumber() + "you had $" + player.money.getMoney());
                    player.money.substractMoney(fee2);
                    System.out.println("player nouber " + player.getNumber() + " now you have $" + player.money.getMoney());
                    System.out.print("player nouber " + owner.getNumber() + "you had $" + player.money.getMoney());
                    owner.money.addMoney(fee2);
                    System.out.println("player nouber " + owner.getNumber() + " now you have $" + player.money.getMoney());
                }
            }
        }
    }

}
