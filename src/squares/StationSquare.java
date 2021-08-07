package squares;

import java.util.Scanner;
import monopoly.Board;
import players.Player;

/**
 *
 * @author bashar
 */
public class StationSquare extends square {

    int price = 200;
    Player owner;

    public StationSquare(String name) {
        super(name);
    }

    @Override
    public void doAction(Player player, Board board) {
         System.out.print("You landed on "+name+"  ");
        if (owner == null) {
            System.out.println(name + " price is " + price);
            System.out.println("Would you like to buy it? [ Y / N ] ");
            Scanner in = new Scanner(System.in);
            String answer = in.next();
            if ("y".equals(answer.toLowerCase())) {

                if (player.money.getMoney() >= price) {
                    this.owner = player;
                    owner.addStations();
                    owner.money.substractMoney(price);
                } else {
                    System.out.println("Not enogh to buy.");
                }
            }
        } else if (!(owner == player)) {
            int money = 25 * (int) Math.pow(2, (owner.getStations() - 1));
            if (!(20 == owner.pice.getCurrentPossition())) {
                System.out.println("you have to pay $"+money);
                  System.out.print("player nouber " + player.getNumber() + "you had $" + player.money.getMoney());
                player.money.substractMoney(money);
                System.out.println("player nouber " + player.getNumber() + " now you have $" + player.money.getMoney());
                  System.out.print("player nouber " + owner.getNumber() + "you had $" + player.money.getMoney());
                owner.money.addMoney(money);
                System.out.println("player nouber " + owner.getNumber() + " now you have $" + player.money.getMoney());
            }
        }
    }
}
