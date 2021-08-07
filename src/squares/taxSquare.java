/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squares;

import monopoly.Board;
import players.Player;

/**
 *
 * @author bashar
 */
public class taxSquare extends square {

    public taxSquare(String name) {
        super(name);
    }

    @Override
    public void doAction(Player player, Board board) {
      System.out.println("You landed on "+name+"  ");
        System.out.print("you had $"+player.money.getMoney());
      player.money.substractMoney(200);
        System.out.println(" now you have $"+player.money.getMoney());
    }
    
}
