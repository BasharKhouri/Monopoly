/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squares;

import java.util.Scanner;
import monopoly.Board;
import players.Player;

/**
 *
 * @author bashar
 */
public class LandSquare extends square {

    private final int price;
    private final String group;
    private boolean canBuild = false;
    private int noOfHouses = 0;
    private Player owner;
    private int rent;
    private int noOfBuildings;

    public String getGroup() {
        return group;
    }

    public void setCanBuild(boolean canBuild) {
        this.canBuild = canBuild;
    }

    public boolean isCanBuild() {
        return canBuild;
    }

    public Player getOwner() {
        return owner;
    }

    public LandSquare(String name, String group, int price) {
        super(name);
        this.price = price;
        this.group = group;
    }

    public void addHouse() {
        noOfHouses++;
    }

    public int getNoOfHouses() {
        return noOfHouses;
    }

    @Override
    public void doAction(Player player, Board board) {
        System.out.print("You landed on " + name + "  ");
        if (owner == null) {

            System.out.print("Would you ike to buy it? [ Y / N] ");
            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();
            if (answer.toLowerCase().equals("y")) {
                this.owner = player;
            }
        } else if (!(this.owner == player)) {
            System.out.println("it Belongs to player " + player.getNumber() + " his pice is " + player.pice.getName());
            if (noOfBuildings > 0) {
                rent = ((price * 1 / 10) - 4) + (int) (Math.pow(2, noOfBuildings) * 5);
            } else {
                rent = ((price * 1 / 10) - 4);
            }
            if ((owner.pice.getCurrentPossition() == 20)) {
                System.out.print("player nouber " + player.getNumber() + "you had $" + player.money.getMoney());
                player.money.substractMoney(rent);
                System.out.println("player nouber " + player.getNumber() + " now you have $" + player.money.getMoney());
                System.out.print("player nouber " + owner.getNumber() + "you had $" + player.money.getMoney());
                owner.money.addMoney(rent);
                System.out.println("player nouber " + owner.getNumber() + " now you have $" + player.money.getMoney());
            }

        }

    }

}
