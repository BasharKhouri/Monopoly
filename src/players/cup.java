/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package players;

/**
 *
 * @author basha
 */
public class cup {

    private Die die1 = new Die();
    private Die die2 = new Die();
    private int roll = 0;
    private int die1Val = 0;
    private int die2Val = 0;

    public cup() {

    }

    public int getCurrentRoll() {
        return roll;
    }

    public int getNewRoll() {
        die1Val = die1.getFaceValue();
        die2Val = die2.getFaceValue();
        roll = die1Val + die2Val;
        return roll;
    }

    public boolean isDoubleRoll() {
        return (die1Val == die2Val);

    }

}
