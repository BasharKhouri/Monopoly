/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squares;


import monopoly.Board;
import players.Player;
import java.lang.Math;
import players.Money;
import players.Pice;
import players.cup;


/**
 *
 * @author bashar
 */
public class ChanceSquare extends square {

    public ChanceSquare(String name) {
        super(name);
    }
    
    
    @Override
    public void doAction(Player player, Board board) {
          System.out.print("You landed on "+name+"  ");
          int Card =(int) (Math.random()*8); 
          
          if (Card==0)
          {
              System.out.println("Advance to Go (Collect $200) ");
              player.pice.goTO(0);
          }
          else if (Card==10)
          {
           System.out.println("Advance to Illinois Ave. {Avenue}. If you pass Go, collect $200");
            player.pice.goTO(16);
          
          
          }
          else if (Card==1)
          {
           System.out.println("Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total 10 times the amount thrown");
              
          
           
          player.pice.goTO( 7);
          player.money.substractMoney( player.c.getNewRoll());
          
          
          }
          else if (Card==2)
          {
           System.out.println("Advance token to the nearest Railroad and pay owner twice the rental to which he/she {he} is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.");
          
          
          }
          else if (Card==3)
          {
           System.out.println("Bank pays you dividend of $50.");
           player.money.addMoney(50);
          
          
          }
          else if (Card==4)
          {
           System.out.println("Get out of Jail Free. This card may be kept until needed");
            player.setFreeJailCard(true);
          
          
          }
          else if (Card==5)
          {
           System.out.println("Go Back Three {3} Spaces");
           player.pice.goTO(player.pice.getCurrentPossition()-3);
          
          
          }
          else if (Card==6)
          {
           System.out.println("Go to Jail. Go directly to Jail");
           player.pice.goTO(10);
           player.SetJailed(true);
          
          
          }
          else if (Card==7)
          {
           System.out.println("Pay poor tax of $15 ");
           player.money.substractMoney(15);
          
          }
          

          
          
    }
    
}
