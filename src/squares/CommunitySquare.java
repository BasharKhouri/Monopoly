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
public class CommunitySquare extends square{

    public CommunitySquare(String name) {
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
              player.money.addMoney(200);
          }
          else if (Card==10)
          {
           System.out.println("Bank error in your favor. Collect $200.");
           player.money.addMoney(200);
          
          
          }
          else if (Card==1)
          {
           System.out.println("Doctor's fees. {fee} Pay $50");
              
          
           
          
          player.money.substractMoney( 50);
          
          
          }
          else if (Card==2)
          {
           System.out.println("From sale of stock you get $50.");
          player.money.addMoney(200);
          
          }
          else if (Card==3)
          {
           System.out.println("Income tax refund. Collect $20. ");
           player.money.addMoney(20);
          
          
          }
          else if (Card==4)
          {
           System.out.println("Get Out of Jail Free. ");
            player.setFreeJailCard(true);
          
          
          }
          else if (Card==5)
          {
           System.out.println("Life insurance matures – Collect $100");
          player.money.addMoney(100);
          
          
          }
          else if (Card==6)
          {
           System.out.println("School fees. Pay $50.");
          player.money.substractMoney( 50);
          
          
          }
          else if (Card==7)
          {
           System.out.println("Receive $25 consultancy fee");
            player.money.addMoney(25);
          
          }
          
          
          
          
          
    }
    
}
